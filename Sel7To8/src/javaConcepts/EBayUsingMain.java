package javaConcepts;

public class EBayUsingMain {

	public void login()
	{
		System.out.println("SWD Logic related login");
	}
	
	public void logout()
	{
		System.out.println("SWD Logic related logout");
		System.out.println();
	}
	
	public void PurchaseItem()
	{
		System.out.println("SWD Logic related PurchaseItem");
	}
	
	public void UpdateOrder()
	{
		System.out.println("SWD Logic related UpdateOrder");
	}
	
	public void TrashOrder()
	{
		System.out.println("SWD Logic related TrashOrder");
	}

	public static void main(String args[])
	{
		EBayUsingMain oeBay;
		oeBay = new EBayUsingMain();
			
		//1. Make a Order
		oeBay.login();
		oeBay.PurchaseItem();
		oeBay.logout();
		
		//2. Modify Order
		oeBay.login();
		oeBay.UpdateOrder();
		oeBay.logout();
				
		//3. Delete Order
		oeBay.login();
		oeBay.TrashOrder();
		oeBay.logout();
		
	}

}
