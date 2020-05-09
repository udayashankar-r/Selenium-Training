package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,7,8};
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
//			a[i]=a[i]-1;
			if (a[i] != (i+1))
			{
			System.out.println("The missing element is : "+(i+1));
			break;
			}
			
		}

	}

}
