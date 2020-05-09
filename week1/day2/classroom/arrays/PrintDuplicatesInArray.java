package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int a = arr.length;
		int count=0;

		for (int i = 0; i < a-1; i++) 
		{
			count=0;
			for (int j = i+1 ; j < a; j++) 
			{
//				if (a[i] == a[j])
				if (arr[i] == arr[j])
				{
					System.out.println("The duplicate element :"+arr[j]);
				} 
			}
			/*
			 * if (count>0) {
			 * 
			 * System.out.println("The duplicate element :"+arr[i]); }
			 */ 
		}		
	}
}
