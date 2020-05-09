package week1.day2.classroom.string;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0;
		char[] a = str.toCharArray();
//		int leng = a.length;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]=='e') 
				count++;
			}
		System.out.println("The number of e is:" +count);
		}
	}

