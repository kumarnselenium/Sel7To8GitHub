package automationConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {

	public void searchEBay() throws InterruptedException
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
		
	}
		
	@Test
	public void searchEBayDataDriven() throws InterruptedException
	{
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Sel7PMTo8PM Notes\\eBay Test Data.xls", "Search");

		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		for(int iRow=1; iRow<oSearchSht.rowCount(); iRow++)
		{
			//2. launch www.ebay.com
			oBrowser.get("https://www.ebay.com/");
			
			//3. Enter laptop in the search textbox
			oBrowser.findElement(By.id("gh-ac")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearchFor", iRow));
			
			//4. Click on Search button
			oBrowser.findElement(By.id("gh-btn")).click();
		}
	}
}
