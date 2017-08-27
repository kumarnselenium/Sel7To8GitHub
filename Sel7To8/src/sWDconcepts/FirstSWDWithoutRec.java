package sWDconcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class FirstSWDWithoutRec {

	@Test
	public void eBaySearch()
	{
		WebDriver oBrowser;
		oBrowser = null;
		String sBrowserType = "Chrome";
		
		if(sBrowserType.equalsIgnoreCase("Chrome"))
		{
			//1. Open Chrome browser		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
			oBrowser = new ChromeDriver();				
		}
		else if(sBrowserType.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\FFGeckoDriver.exe");
			oBrowser = new FirefoxDriver();
		}
		else if(sBrowserType.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\IEDriverServer32.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			oBrowser = new InternetExplorerDriver(capabilities);
		}
		else if(sBrowserType.equalsIgnoreCase("HtmlUnitDriver"))
		{
			oBrowser = new HtmlUnitDriver();
		}
	
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		System.out.println(oBrowser.getTitle());
			
		//3. enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
			/*
			//3.a Object Identification
			WebElement uiSearchTB = oBrowser.findElement(By.id("gh-ac"));
			//3.b Performing the Operation
			uiSearchTB.sendKeys("laptop");
			*/

		//4. click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
		oBrowser.quit();
	}
	
	public void handlingLinkAndCheckBox()
	{
		//1. Open Chrome browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Click on Sign In
		oBrowser.findElement(By.linkText("Sign in")).click();
			
	}
	
	public void handlingCheckBox()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("http://www.nasdaq.com/symbol/adp/after-hours");
		
		//4. Make sure "Checkbox" unselected
		if(oBrowser.findElement(By.id("cookiepref")).isSelected())
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		
		//4. Make sure "Checkbox" selected
		if(!(oBrowser.findElement(By.id("cookiepref")).isSelected()))
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		
	}	

	public void handlingRadioButton()
	{
		String sTripType = "Oneway";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.southwest.com/");
		
		//4. Make sure "Checkbox" unselected
		if(sTripType.equals("RoundTrip"))
		{
			oBrowser.findElement(By.id("trip-type-round-trip")).click();
		}
		else if(sTripType.equals("Oneway"))
		{
			oBrowser.findElement(By.id("trip-type-one-way")).click();
		}
		
	}	

	public void handlingImages()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.southwest.com/");
		
		oBrowser.findElement(By.linkText("Enroll")).click();
		
		oBrowser.findElement(By.xpath("//*[@id='page']/div[1]/div/div/a/div[1]/svg/image")).click();
		
		
	}	

	public void handlingDropDown() throws InterruptedException
	{
		//1. Open Chrome browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
			
		//3. enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
			/*
			//3.a Object Identification
			WebElement uiSearchTB = oBrowser.findElement(By.id("gh-ac"));
			//3.b Performing the Operation
			uiSearchTB.sendKeys("laptop");
			*/
	/*	WebElement uiCategoryDD = oBrowser.findElement(By.id("gh-cat"));
		Select uiCategory = new Select(uiCategoryDD);
	*/
		
		Select uiCategory = new Select(oBrowser.findElement(By.id("gh-cat")));
		uiCategory.selectByVisibleText("Cameras & Photo");
		Thread.sleep(3000);
		uiCategory.selectByIndex(3);	//Baby
		Thread.sleep(3000);
		uiCategory.selectByValue("267");	//books
		
		System.out.println(uiCategory.getOptions().size());
		
		
		
	}

	public void browserOptithons() 
	{
		//1. Open Chrome browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//Maximize
		oBrowser.manage().window().maximize();
		
		//2. launch www.ebay.com
		//oBrowser.get("https://www.ebay.com/");
		oBrowser.navigate().to("https://www.ebay.com/");
		//oBrowser.navigate().back();
		//oBrowser.navigate().forward();
		
		String sBrowserTitle = oBrowser.getTitle();
		System.out.println(sBrowserTitle);
		
		oBrowser.findElement(By.linkText("register")).click();
				
		System.out.println(oBrowser.getCurrentUrl());
		
		
		//System.out.println(oBrowser.getPageSource());
		
		
		oBrowser.close();
		oBrowser.quit();
		
		
	}

	@Test
	public void exForComplexXPATH()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("http://www.nasdaq.com/extended-trading/premarket-mostactive.aspx");
		
		System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'AAPL')]/ancestor::td/following-sibling::td[3]")).getText());
		
		
	}	

}



