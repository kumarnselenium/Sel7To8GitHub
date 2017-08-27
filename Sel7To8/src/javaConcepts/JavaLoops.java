package javaConcepts;

import org.junit.Test;

public class JavaLoops {

	
	public void loops()
	{
		int iAge=16;
		
		if(iAge>18)
		{
			
		}
		
		if(iAge>10)
		{
			//kid
		}
		else
		{
			//teenage
		}
		
		
		if(iAge>21)
		{
			
		}
		else if(iAge>31 && iAge<40)
		{
			
		}
		else if(iAge>50 && iAge<60)
		{
			
		}
		
		char sSelectType = 'K';
		
		switch (sSelectType)
		{
			case 'E':
				//Statements
				break;
			case 'B':
				//Statements
				break;
			case 'L':
				//Statements
				break;	
			default:
				//Statements
				break;
		}
		
		for(int i=1; i<=10; i++)
		{
			
		}
		
		while(iAge<10)
		{
			
		}
		
		do
		{
			
		}while(iAge<10);
		
	}
	
	@Test
	public void StringOperations()
	{
		String sFname = "Selenium";
		String sLname = " Automation";
		String sUName = "xyz";
		String sMsg = "Welcome xyz to facebook";
		String sReferenceNo = "Thank you. Your Ref is 1410950915. Please note";
				
		System.out.println("Nof Characters: " + sFname.length());	//Nof Characters: 8
		System.out.println(sFname.concat(sLname));	//Selenium Automation
		
		if(sMsg.contains(sUName))	///85th line
		{
			System.out.println("User login successful");
		}
		else
		{
			System.out.println("User login unsuccessful");
		}
		
		if(sMsg.equals(sUName))	///98th line
		{
			System.out.println("User login successful");
		}
		else
		{
			System.out.println("User login unsuccessful");
		}
		
		if(sMsg.equalsIgnoreCase("Welcome xyz to FACEBOOK"))	///103th line
		{
			System.out.println("User login successful");
		}
		else
		{
			System.out.println("User login unsuccessful");
		}
		
		System.out.println(sLname);
		System.out.println(sLname.trim());
		
		System.out.println(sReferenceNo.substring(23, 33));	//1410950915
		
		System.out.println(sMsg.replace("facebook", "gmail"));
		
	}
}






















