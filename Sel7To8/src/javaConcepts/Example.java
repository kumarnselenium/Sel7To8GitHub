package javaConcepts;

import transport.Car;

public class Example {

	public static void main(String args[])
	{
		//Instance using the Default Constructor
		Car oToyota = new Car();
		
		oToyota.sColor = "Yellow";
		oToyota.iNumberOfDoors = 5;
		
		oToyota.start();
		oToyota.moveForward();
		oToyota.movebackward();
		oToyota.stop();
		

		//Instance using the Parameterized Constructor
		Car oHonda = new Car("Blue", 4);		
		
		oHonda.start();
		oHonda.moveForward();
		oHonda.movebackward();
		oHonda.stop();
		
	}	
	
	
}
