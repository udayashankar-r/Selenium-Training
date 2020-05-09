package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String follow="";
		String test="changeme";	//cHaNgEmE
		char[] a=test.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (i%2==1) {
				follow += Character.toUpperCase(a[i]);				
			}
		}
		System.out.println("New String : "+follow);
	}

}


