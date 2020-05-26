package week2.day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithEditFields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		//Entering Email address
		driver.findElementById("email").sendKeys("udayashankar1993@gmail.com");
		String text1 = driver.findElementById("email").getAttribute("value");
		System.out.println("After entering email : "+text1);
		
		//Appending value with existing text
		String text2 = driver.findElementByXPath("(//input)[2]").getAttribute("value");
		System.out.println("Before Appending Text : "+text2);
		driver.findElementByXPath("(//input)[2]").sendKeys("udaya");
		
		String text3 = driver.findElementByXPath("(//input)[2]").getAttribute("value");
		System.out.println("After Appending Text : "+text3);
		
		//Getting default value in textbox
//		String text4 = driver.findElementByClassName("username").getAttribute("value");
		String text4 = driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value");
		System.out.println("Default value in the textbox : "+text4);
		
		//clear the value in textbox
		String text5 = driver.findElementByXPath("(//input[@name='username'])[2]").getAttribute("value");
		System.out.println("Value in the textbox before clearing : "+text5);
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		//Check textbox is non-editable
		boolean text6 = driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();
		if (text6 == true) 
		{
			System.out.println("Textbox is editable");
		} 
		else
		{
			System.out.println("Textbox is non editable");
		}
			
		driver.close();
	}

}

