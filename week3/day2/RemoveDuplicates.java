package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String input = "PayPal India";
		char[] rd = input.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (Character eachChar : rd) 
		{
			if(!charSet.add(eachChar))
			{
				dupCharSet.add(eachChar);
			}
		}
		
		/*
		 * for (Character eachDup : dupCharSet) { System.out.println(eachDup); }
		 */
		
		charSet.removeAll(dupCharSet);
		
		for (Character eachdis : charSet) 
		{
			if(eachdis != ' ')
			{
			System.out.print(eachdis);
			}
		}
	}

}


