package sWDconcepts;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class SpecialCases {

	WebDriver oBrowser = null;
	
	public void openApplication(String sBrowserType, String sURL)
	{		
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
	
		oBrowser.get(sURL);
		
		oBrowser.manage().window().maximize();
		
	}
		
	public void captureScreenshot(String sFilePath) throws IOException
	{
		TakesScreenshot oScn = (TakesScreenshot) oBrowser;
		//Virtual File which has information about the screenshot
		File oSrc = oScn.getScreenshotAs(OutputType.FILE);
		
		//Create a Empty Physical File
		File oDst = new File(sFilePath);
		
		//Copy from oSrc to oDst
		FileUtils.copyFile(oSrc, oDst);
	}
	
	public void handlingMenus() throws InterruptedException, IOException
	{
		openApplication("Chrome", "https://www.ebay.com/");
		
		Thread.sleep(5000);
		
		Actions oAct = new Actions(oBrowser);		
		oAct.moveToElement(oBrowser.findElement(By.linkText("Fashion")));		
		oAct.build().perform();
		
		Thread.sleep(5000);
		
		captureScreenshot("C:\\Selenium\\Sel7PMTo8PM Notes\\MenuScn.jpeg");
		
		oBrowser.findElement(By.linkText("Health")).click();
	}

	public void ExampleForCaptureScreenshot() throws IOException
	{
		openApplication("Chrome", "https://www.ebay.com/");
		
		captureScreenshot("C:\\Selenium\\Sel7PMTo8PM Notes\\eBayScn1.jpeg");
		
	}
	
	public void handlingAlert() throws IOException, InterruptedException
	{
		openApplication("Chrome", "http://www.nasdaq.com/symbol/adp/after-hours");
		
		//Make sure the Checkbox selected
		if(!oBrowser.findElement(By.id("cookiepref")).isSelected())
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		
		//UnSelect
		oBrowser.findElement(By.id("cookiepref")).click();
		
		Thread.sleep(4000);
		
		//Handle Alert
		//Switch the focus to the alert
		Alert oAlt = oBrowser.switchTo().alert();
		
		//Get the text from alert
		String sActual = oAlt.getText();
		
		//Accept
		oAlt.accept();
		
		//decline
		//oAlt.dismiss();
			
	}
	
	public void handlingMultipleBrowsers()
	{
		openApplication("Chrome", "https://www.cigna.com/");
		
		//Get the Parent Browser/window ID
		String sParentID = oBrowser.getWindowHandle();
		
		oBrowser.findElement(By.linkText("Cigna Medicare")).click();
							
		//All Browser/Window IDs
		Set<String> sAllBrowserIds = oBrowser.getWindowHandles();				
		
		//Switch the focus from Main Window to Child Window by excluding the sParentID from sAllBrowserIds
		for(String sEachBrwID:sAllBrowserIds)
		{
			if(!(sEachBrwID.equals(sParentID)))	//Excluding the Parent browser id
			{
				//Changing the focus to Child browser
				oBrowser.switchTo().window(sEachBrwID);
				break;	//Exiting the For loop
			}
		}	
		
		Select uiState = new Select(oBrowser.findElement(By.id("find-state")));
		uiState.selectByVisibleText("Alaska");
	}

	public void handlingMoreThanOneBrowser()
	{
		openApplication("Chrome", "https://www.cigna.com/");
		
		//Get the Parent Browser/window ID
		String sParentID = oBrowser.getWindowHandle();
		
		oBrowser.findElement(By.linkText("Cigna Medicare")).click();
							
		//All Browser/Window IDs
		Set<String> sAllBrowserIds = oBrowser.getWindowHandles();				
		
		String sBrwTitle;
		//More than one Child - Switch the focus from Main Window to Child Window
		for(String sEachBrwID:sAllBrowserIds)
		{
			//Changing the focus to Child browser
			oBrowser.switchTo().window(sEachBrwID);
			
			sBrwTitle = oBrowser.getTitle();
			
			if(sBrwTitle.contains("Emirates"))	//Excluding the Parent browser id
			{			
				break;	//Exiting the For loop
			}
		}	
		
		Select uiState = new Select(oBrowser.findElement(By.id("find-state")));
		uiState.selectByVisibleText("Alaska");
	}

	@Test
	public void handlingFrames() throws InterruptedException
	{
		openApplication("Chrome", "http://www.proquest.com/about/careers/current-career-opportunities.html");
		
		oBrowser.switchTo().frame(oBrowser.findElement(By.className("careers")));
		
		Select uiCountry = new Select(oBrowser.findElement(By.id("location")));
		
		uiCountry.deselectAll();
		Thread.sleep(3000);
		
		uiCountry.selectByVisibleText("Africa");
		Thread.sleep(3000);
		
		uiCountry.selectByVisibleText("Berlin");
	}
}
























