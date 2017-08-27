package sWDconcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfUIObjs {
	
	public void groupofObjs()
	{
		WebDriver oBrowser= null;
	
		//1. Open Chrome browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();	
		
		oBrowser.get("http://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		int iNofDeals = uiAllDeals.size();
		
		for(WebElement uiEachDeal:uiAllDeals)
		{
			System.out.println(uiEachDeal.getText());
		}
		
	/*
	 	System.out.println(iNofDeals);
	 	
		for(int i=0; i<iNofDeals; i++)
		{
			System.out.println(uiAllDeals.get(i).getText());
		}
	*/
		
	}

	public void groupofObjsNotepad() throws FileNotFoundException
	{
		WebDriver oBrowser= null;
	
		//1. Open Chrome browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();	
		
		oBrowser.get("http://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		int iNofDeals = uiAllDeals.size();
		
		System.out.println(iNofDeals);
		
		//Creating an empty file
		File oFile = new File("C:\\Selenium\\Sel7PMTo8PM Notes\\deals.txt");
		
		//Write into a file
		PrintWriter OPW = new PrintWriter(oFile);
		
		for(int i=0; i<iNofDeals; i++)
		{
			//Write to the file
			OPW.println(uiAllDeals.get(i).getText());
		}
		
		//Save
		OPW.flush();
		
		//Close
		OPW.close();
		
	}

	@Test
	public void groupofObjsbasedonTag()
	{
		WebDriver oBrowser= null;
	
		//1. Open Chrome browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();	
		
		oBrowser.get("https://www.ebay.com/sch/ebayadvsearch");
		
	//	List<WebElement> uiAllLinks = oBrowser.findElements(By.tagName("a"));
	//	List<WebElement> uiAllDropDown = oBrowser.findElements(By.tagName("select"));
		
		List<WebElement> uiAllCheckboxes = oBrowser.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement uiEachCheckbox:uiAllCheckboxes)
		{
			if(!uiEachCheckbox.isSelected())
			{
				uiEachCheckbox.click();
			}
		}
		
		
	}


}











