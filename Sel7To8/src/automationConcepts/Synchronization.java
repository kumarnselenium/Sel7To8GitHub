package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	//change
	
	public void exForImplicitWait() throws InterruptedException
	{
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Sel7PMTo8PM Notes\\eBay Test Data.xls", "Search");
		
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac123")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearchFor", 1));
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
		
	public void exForExplicitWaitThreadSleep() throws InterruptedException
	{
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Sel7PMTo8PM Notes\\eBay Test Data.xls", "Search");
		
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
				
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearchFor", 1));
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(180000);
		
		//Logic for Verify file uploaded successfully message
		
		
	}
	
	@Test
	public void exForExplicitWaitWDW() throws InterruptedException
	{
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Sel7PMTo8PM Notes\\eBay Test Data.xls", "Search");
		
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
				
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearchFor", 1));
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
		WebDriverWait oWDW = new WebDriverWait(oBrowser, 180);
		oWDW.until(ExpectedConditions.elementToBeClickable(oBrowser.findElement(By.id("abcd"))));
		
		//Logic for Verify file uploaded successfully message
		
		
	}
}
