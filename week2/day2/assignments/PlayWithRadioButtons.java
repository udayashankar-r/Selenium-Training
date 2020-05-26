package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/radio.html");		
		driver.manage().window().maximize();
		
		//Are you enjoying the classes?
		driver.findElementByXPath("//label[@for='yes']").click();
		
		//Find default selected radio button
		WebElement CheckedRadioBtn =  driver.findElementByXPath("//input[@value='1']");
	    if(CheckedRadioBtn.isSelected())
	    	System.out.println("Checked radiobutton is enabled by default");
	    else
	    	System.out.println("Checked radiobutton is not enabled by default");
//			CheckedRadioBtn.click();

	    //Select your age group (Only if choice wasn't selected)
	    WebElement ageGroup =  driver.findElementByXPath("//input[@value='1']");
	    Thread.sleep(5000);	
        if(ageGroup.isSelected())
        	System.out.println("Age Group is selected");
        else
        	System.out.println("Age Group is not selected");
        	ageGroup.click();
        
        driver.close();

	}

}
