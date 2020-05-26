package week3.day1.assignments;

public class KVB extends RBI {

	public void loanInterestRate(String personalLoan)
	{
		System.out.println("The personal loan interest rate is :" +personalLoan);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KVB loan = new KVB();
		loan.loanInterestRate();
		loan.loanInterestRate("10%");
		loan.loanInterestRate("20%");
		loan.loanInterestRate("15%", 10000);
	}

}
