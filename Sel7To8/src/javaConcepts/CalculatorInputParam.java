package javaConcepts;

import transport.Car;

public class CalculatorInputParam {

	int iOutput;
	
	public void addition(int iInput1, int iInput2)
	{
		iOutput = iInput1+iInput2;
		System.out.println(iOutput);
	}
	
	public void substraction(int iInput1, int iInput2)
	{
		iOutput = iInput1-iInput2;
		System.out.println(iOutput);
	}
	
	public void multiplication(int iInput1, int iInput2)
	{
		iOutput = iInput1*iInput2;
		System.out.println(iOutput);
	}
	
	public void division(int iInput1, int iInput2)
	{
		iOutput = iInput1/iInput2;
		System.out.println(iOutput);
	}
	
	void findTheBestSellingProduct(String str, int a, boolean b)
	{
		
	}
	
	void findTheBestTrendingItem(String str, int a, boolean b, Car abc)
	{
		
	}
	
	public static void main(String args[])
	{
		CalculatorInputParam oCalc = new CalculatorInputParam();
			
		oCalc.addition(5, 3);	//5 & 3
		oCalc.substraction(4, 2);	// 4 & 2
		oCalc.multiplication(768, 42);	//768 42rue
		oCalc.division(9221, 34);	// 09221 34
		
//		Car oBMW = new Car();
		Car oBMW;
		oBMW = new Car();
		
		oCalc.findTheBestTrendingItem("Electronics", 500, true, oBMW);
	}
	
}
