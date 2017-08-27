package javaConcepts;

import transport.Car;
import transport.Ship;

public class CalculatorInputAndOutput {

	int iOutput;
	
	
	public int addition(int iInput1, int iInput2)
	{
		iOutput = iInput1+iInput2;
		return iOutput;
	}
	
	public int substraction(int iInput1, int iInput2)
	{
		iOutput = iInput1-iInput2;
		return iOutput;
	}
	
	public int multiplication(int iInput1, int iInput2)
	{
		iOutput = iInput1*iInput2;
		return iOutput;
	}
	
	public int multiplication(int iInput1, int iInput2, int iInput3)
	{
		return iInput1+iInput2+iInput3;
	}

	public float multiplication(float iInput1, float iInput2)
	{
		iOutput = (int) (iInput1*iInput2);
		return iOutput;
	}
	
	public int multiplication(int iInput1, float iInput2)
	{
		iOutput = (int) (iInput1*iInput2);
		return iOutput;
	}
	
	public int division(int iInput1, int iInput2)
	{
		iOutput = iInput1/iInput2;
		return iOutput;
	}
	
	public Car findTheBestSellingProduct(String str, int a, boolean b)
	{
		Car iBMW = new Car();
		return iBMW;		
	}
	
	public String findTheBestTrendingItem(String str, int a, boolean b, Car abc)
	{
		return str;
		
	}
	
	public static void main(String args[])
	{
			
		CalculatorInputAndOutput oCalc = new CalculatorInputAndOutput();
		
		int iAddition;		
		iAddition = oCalc.addition(5, 3);	//5 & 3
		System.out.println(iAddition);
		
		int iSubstration = oCalc.substraction(4, 2);	// 4 & 2
		System.out.println(iSubstration);
		
		System.out.println(oCalc.multiplication(768, 42));	//768 42rue
		System.out.println(oCalc.division(9221, 34));	// 09221 34
		
		
		Car oABc = oCalc.findTheBestSellingProduct("Electronics", 25,true);
		oABc.movebackward();
		
		
//		Car oBMW = new Car();
		Car oBMW;
		oBMW = new Car();
		
		oCalc.findTheBestTrendingItem("Electronics", 500, true, oBMW);
	
		
		
	}
	
}

















