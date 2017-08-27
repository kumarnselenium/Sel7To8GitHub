package automationConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifications 
{
	
	@Test
	public void searchEBay() throws InterruptedException
	{
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. launch www.ebay.com
		oBrowser.get("http://www.deal4loans.com/Contents_Calculators.php");
		
		//1st verification
		try
		{
			if(oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed())
			{
				System.out.println("Pass, EMI Calc page is diaplyed successfully");
			}
		}catch(Exception e)
		{
			System.out.println("Fail, EMI Calc page is NOT diaplyed successfully");
		}
		
		//2nd Type of verification
		if(oBrowser.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0)
		{
			System.out.println("Pass, EMI Calc page is diaplyed successfully");
		}
		else
		{
			System.out.println("Fail, EMI Calc page is NOT diaplyed successfully");
		}
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("30000");
		
		oBrowser.findElement(By.name("rate")).click();
		
		String sExpectedLAText = "Thirty Thousand";
		String sActualLAText = oBrowser.findElement(By.id("wordloanAmount")).getText();
		
		sExpectedLAText = sExpectedLAText.toLowerCase();
		sActualLAText = sActualLAText.toLowerCase();		
		
		if(sActualLAText.contains(sExpectedLAText))
		{
			System.out.println("Pass, Loan Amount Text is diaplyed successfully");
		}
		else
		{
			System.out.println("Fail, Loan Amount Text is NOT diaplyed successfully");
		}
		
		oBrowser.findElement(By.name("rate")).clear();
		oBrowser.findElement(By.name("rate")).sendKeys("8");
		
		oBrowser.findElement(By.name("months")).clear();
		oBrowser.findElement(By.name("months")).sendKeys("24");
		
		oBrowser.findElement(By.name("button")).click();
		
		String sExpectedEMI = "1356.82";
		String sActualEMI = oBrowser.findElement(By.name("pay")).getAttribute("value");
		
		if(sExpectedEMI.equals(sActualEMI))
		{
			System.out.println("Pass, Expected EMI is matching with the Actual EMI");
		}
		else
		{
			System.out.println("Fail, Expected EMI is NOT matching with the Actual EMI");
		}
		
		
	}
}





















