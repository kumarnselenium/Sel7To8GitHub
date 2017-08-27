package javaConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EBayUsingJUNIT {

	@Before
	public void login()
	{
		System.out.println("SWD Logic related login");
	}
	
	@After
	public void logout()
	{
		System.out.println("SWD Logic related logout");
		System.out.println();
	}
	
	@Test
	public void PurchaseItem()
	{
		System.out.println("SWD Logic related PurchaseItem");
	}
	
	@Test
	public void UpdateOrder()
	{
		System.out.println("SWD Logic related UpdateOrder");
	}
	
	@Test
	public void TrashOrder()
	{
		System.out.println("SWD Logic related TrashOrder");
	}

}
