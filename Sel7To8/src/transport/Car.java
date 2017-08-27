package transport;

public class Car {

	public String sColor;	
	float fLength;	
	public int iNumberOfDoors;	
	boolean bIsAutotransamission;	
	
	public Car(String sColorofCar, int iDoors)
	{
		sColor = sColorofCar;
		iNumberOfDoors = iDoors;
	}
	
	public Car()
	{
		
	}
	
	public void start()	
	{	
		System.out.println(sColor);
		System.out.println(iNumberOfDoors);
		System.out.println("logic related to Start");
	}	
		
	public void stop()	
	{	
		System.out.println("logic related to Stop");
	}	
		
	public void moveForward()	
	{	
		System.out.println("logic related to move forward");
	}	
		
	public void movebackward()	
	{	
		System.out.println("logic related to move backward");
	}	
	
	public static void main(String args[])
	{
		//Instance using the Default Constructor
		Car oBMW = new Car();
		Car oHonda;
		oBMW.sColor = "Red";
		oBMW.iNumberOfDoors = 3;
		
		oBMW.start();
		oBMW.moveForward();
		oBMW.movebackward();
		oBMW.stop();
		
		
		
		
	}	


	
}
