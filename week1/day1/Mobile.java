package week1.day1;

public class Mobile {

	String mobileBrand ="Oppo";
	double mobilePrice = 8500;
	int noContacts = 100;
	long imeNumber = 1234567890l;
	
	public void makeCall() 
	{
		System.out.println("Make a Call"); 

	}
	public void sendMessage() 
	{
		System.out.println("Send a Message");

	}
	public void takePicture() 
	{
		System.out.println("Take a picture");
	}
	public static void main(String[] args)
	{
	Mobile test=new Mobile();
	test.makeCall();
	test.sendMessage();
	test.takePicture();
	
	String mBrand=test.mobileBrand;
	double mPrice=test.mobilePrice;
	int mContacts=test.noContacts;
	long mImei=test.imeNumber;
	
	System.out.println("The mobile brand is: "+mBrand);
	System.out.println("The mobile price is: "+mPrice);
	System.out.println("The mobile contact is: "+mContacts);
	System.out.println("The mobile IMEI is: "+mImei);
	
	}
	
}

