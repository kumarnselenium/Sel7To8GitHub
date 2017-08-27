package javaConcepts;

public class Calculator {

	int iInput1, iInput2;
	int iOutput;
	

	public void addition()
	{
		iOutput = iInput1+iInput2;
		System.out.println(iOutput);
	}
	
	public void substraction()
	{
		iOutput = iInput1-iInput2;
		System.out.println(iOutput);
	}
	
	public void multiplication()
	{
		iOutput = iInput1*iInput2;
		System.out.println(iOutput);
	}
	
	public void division()
	{
		iOutput = iInput1/iInput2;
		System.out.println(iOutput);
	}

	public static void main(String args[])
	{
		Calculator oCalc = new Calculator();
		
		oCalc.iInput1 = 5;
		oCalc.iInput2 = 3;
		
		oCalc.addition();	//5 & 3
		oCalc.substraction();	// 4 & 2
		oCalc.multiplication();	//768 42
		oCalc.division();	// 09221 34
		
		
	}
	
}
