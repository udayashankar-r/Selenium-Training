package week1.day2.classroom.string;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str = "feeling good";
		char ch[]=str.toCharArray();  
	    String rev=""; 
	    for(int i=ch.length-1; i>=0; i--)
	    {  
	        rev+=ch[i];  
	    }  
	    System.out.print("Reversal String : "+rev); 

	}

}

