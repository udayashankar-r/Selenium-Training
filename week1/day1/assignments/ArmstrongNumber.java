package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 153;
		int calculated=0, remainder, original;
		original = a;
		
		while(a>0)
		{
			remainder=a%10;
			a=a/10;
			calculated=calculated+(remainder*remainder*remainder);
		}
		
		if (calculated==original)		
			System.out.println(calculated +" is armstrong number");
		else
			System.out.println(calculated +" is not armstrong number");
	}

}

