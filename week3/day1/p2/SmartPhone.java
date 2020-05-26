package week3.day1.p2;

import week3.day1.AndroidPhone;

public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp() 
	{
		System.out.println("Connect with a WhatsApp");
	}
		
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsApp();
	}
}



