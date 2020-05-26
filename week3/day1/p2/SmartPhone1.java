package week3.day1.p2;

import week3.day1.AndroidPhone;

public class SmartPhone1 extends AndroidPhone {

	
	  public void takeVideo() 
	  {
	  System.out.println("Take a video - Method Overridding"); 
	  }
	 
	
	public static void main(String[] args) {
		
		SmartPhone1 sp = new SmartPhone1();
		sp.takeVideo();

	}
}
