package automationConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerificationsUsingTestNG 
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
			Assert.assertTrue(oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed(), "Fail, EMI Calc page is NOT diaplyed successfully");
			System.out.println("Pass, EMI Calc page is diaplyed successfully");
		}catch(Exception e)
		{
			System.out.println("Fail, EMI Calc page is NOT diaplyed successfully");
		}
		
		
		//2nd Type of verification
		Assert.assertTrue(oBrowser.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0, "Fail, EMI Calc page is NOT diaplyed successfully");
		System.out.println("Pass, EMI Calc page is diaplyed successfully");
				
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("30000");
		
		oBrowser.findElement(By.name("rate")).click();
		
		String sExpectedLAText = "Thirty Thousand";
		String sActualLAText = oBrowser.findElement(By.id("wordloanAmount")).getText();
		
		sExpectedLAText = sExpectedLAText.toLowerCase();
		sActualLAText = sActualLAText.toLowerCase();		
	
		Assert.assertTrue(sActualLAText.contains(sExpectedLAText), "Fail, Loan Amount Text is NOT diaplyed successfully");
		System.out.println("Pass, Loan Amount Text is diaplyed successfully");
		
		oBrowser.findElement(By.name("rate")).clear();
		oBrowser.findElement(By.name("rate")).sendKeys("8");
		
		oBrowser.findElement(By.name("months")).clear();
		oBrowser.findElement(By.name("months")).sendKeys("24");
		
		oBrowser.findElement(By.name("button")).click();
		
		String sExpectedEMI = "1356.82";
		String sActualEMI = oBrowser.findElement(By.name("pay")).getAttribute("value");
		
		Assert.assertTrue(sExpectedEMI.equals(sActualEMI), "Fail, Expected EMI is NOT matching with the Actual EMI");
		System.out.println("Pass, Expected EMI is matching with the Actual EMI");
				
		
	}
}





















