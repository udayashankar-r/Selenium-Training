package week1.day1.classroom;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num=123;
		int sum=0;
		
		while(num!=0)
		{
//When I tried as per pseudocode it is not working os commented below lines and made some changes 
			
//			num=num%10;
//			System.out.println(num);
			sum=sum + num%10;
			System.out.println("The sum is "+sum);
			num=num/10;
			System.out.println("The num is "+num);
		}
		System.out.println("The sum is "+sum);
	}
}

