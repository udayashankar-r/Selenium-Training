package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test="I am a software tester"; 
		String[] sp=test.split(" ");
  
		for(int i=0;i<sp.length;i++)
		{
			if(i%2!=0)
			{
				String sp2= sp[i];
				StringBuffer rev1=new StringBuffer(sp2);  
				rev1.reverse();
				String rev2= rev1.toString();
				System.out.println("Even words reversal : "+rev2);
			}
		}
	
	}

}
