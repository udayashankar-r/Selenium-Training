package week1.day2.assignments.mandatory;

public class Palindrome
{

	public static void main(String[] args) 
	{
		
		String a="madam";
		String rev="";
		
		for (int i = a.length() -1 ; i >= 0; i--) 
		{
			rev = rev + a.charAt(i);
			System.out.println(rev);
		}
			if (a.equals(rev))
				System.out.println(a+" is a palindrome");	

			else
				System.out.println(a+" is a not palindrome");
		}
}

