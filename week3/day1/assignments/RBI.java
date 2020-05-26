package week3.day1.assignments;

public class RBI {

	public void loanInterestRate()
	{
		System.out.println("The loan interest rate is : 5%");
	}
	
	public void loanInterestRate(String rate)
	{
		System.out.println("The loan interest rate is :" +rate);
	}
	
	//Method overloading
	public void loanInterestRate(String rate,int amount)
	{
		System.out.println("The loan interest rate is :" +rate);
		System.out.println("The loan amount is :" +amount);
	}
}



