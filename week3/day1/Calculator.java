package week3.day1;

public class Calculator {

	//add
	public void add(int a, int b)
	{
		System.out.println("The Sum of two digits is : " +(a+b));
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println("The Sum of three digits is : " +(a+b+c));
	}
	
	//multiply
	public void multiply(int a, int b)
	{
		System.out.println("The Product of two digits is : " +(a*b));
	}
	
	public void multiply(int a, double d)
	{
		System.out.println("The Product of two digits is : " +(a*d));
	}
	
	//subtract
	public void subtract(int a, int b)
	{
		System.out.println("The minus of two digits is : " +(a-b));
	}
	
	public void subtract(double d, double e)
	{
		System.out.println("The minus of two digits is : " +(d-e));
	}
	
	//divide
	public void divide(int a, int b)
	{
		System.out.println("The division of two digits is : " +(a/b));
	}
	
	public void divide(int a, double d)
	{
		System.out.println("The division of two digits is : " +(a/d));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		cal.add(2, 3);
		cal.add(2, 3, 5);
		cal.multiply(2, 3);
		cal.multiply(2, 3.51);
		cal.subtract(3, 2);
		cal.subtract(5.5, 3.2745);
		cal.divide(9, 3);
		cal.divide(9, 2.7);
	}

}
