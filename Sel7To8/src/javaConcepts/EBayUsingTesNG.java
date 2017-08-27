package javaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EBayUsingTesNG {

	@BeforeMethod
	public void login() 
	{
		System.out.println("SWD Logic related login");
		
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("SWD Logic related logout");
		System.out.println();
	}
	
	
	@Test (priority=184)
	public void PurchaseItem()
	{
		System.out.println("SWD Logic related PurchaseItem");
	}
	
	@Test (priority=200)
	public void UpdateOrder()
	{
		System.out.println("SWD Logic related UpdateOrder");
	}
	
	@Test (priority=879)
	public void TrashOrder()
	{
		System.out.println("SWD Logic related TrashOrder");
	}

}
