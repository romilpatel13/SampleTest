package SampleProg;

public class Calculator {

	public int add(int a, int b)
	{
		System.out.println("Add " + a + " , "+ b + " is : "+ (a+b));
		return a + b;
	}
	
	public int mul(int a, int b)
	{
		System.out.println("Mul" + a + " , "+ b + " is : "+ (a*b));
		return a * b;
	}
	public int sub(int a, int b)
	{
		System.out.println("Sub" + a + " , "+ b + " is : "+ (a-b));
		return a - b;
	}
	
}
