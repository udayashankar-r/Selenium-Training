package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] sp = text.split(" ");
		
		for (int i = 0; i < sp.length; i++) 
		{
			for (int j = i+1; j < sp.length; j++) 
			{
				if(sp[i].equals(sp[j]))
				{
					count+= 1;
					sp[j] = " ";
				}
			}
		
			if(count > 1 && sp[i] !=" ")
			{
				System.out.println("After removing duplicate word : "+sp[i]);
			}
		}
	}
}

