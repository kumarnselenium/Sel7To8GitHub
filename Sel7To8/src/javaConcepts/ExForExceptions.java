package javaConcepts;

import java.io.FileNotFoundException;

public class ExForExceptions {

	
	public void exLogin() throws InterruptedException
	{
		System.out.println("logic for usernamen, pwd and click on Sign on");
		Thread.sleep(3000);
	}
	
	public void exForTryCatch()
	{
		System.out.println("logic for usernamen, pwd and click on Sign on");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			//write the logic to handle the exception
		}
	
		
	/*	try{
			System.out.println("Logic related to read the data from a file");
		}catch (FileNotFoundException e)
		{
			//write the logic to create the file under required location
		} catch (Exception f)
		{
			
		}finally {
			
		}*/
		
	}
	
}
