package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range=8; 
		int firstNum=0, secNum=1;
		
		for (int i = 1; i <= range; i++) {
			System.out.print(firstNum+", ");
			int fibNum = firstNum + secNum;
			firstNum = secNum;
			secNum=fibNum;
		}		

	}

}
