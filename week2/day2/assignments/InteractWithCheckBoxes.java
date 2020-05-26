package week2.day2.assignments;

//import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		//Language selection
		WebElement option1 = driver.findElementByXPath("(//div[@class='example']//input)[1]");
		option1.click();
		WebElement option2 = driver.findElementByXPath("(//div[@class='example']//input)[3]");
		option2.click();
		
		if (option1.isSelected() || option2.isSelected()) 
            System.out.println("Checkbox is Toggled On");
		else 
            System.out.println("Checkbox is Toggled Off");

		//To check Checkbox is checked
//		WebElement option3 = driver.findElementByXPath("(//div[@class='example']//input)[6]");
		WebElement option3 = driver.findElementByXPath("(//div[contains(text(),'Selenium')])");
		if (option3.isSelected()) 
            System.out.println("Selenium checkbox is checked by default");
		else 
            System.out.println("Selenium checkbox is not checked by default");
		Thread.sleep(2000);
		
		//To deselect checked checkbox
		boolean option4 = driver.findElementByXPath("(//div[@class='example']//input)[8]").isSelected();
		if (option4 != false)
		{
			driver.findElementByXPath("(//div[@class='example']//input)[8]").click();
			System.out.println("Checkbox unchecked successfully");
		}
		else
			System.out.println("Checkbox is checked already");
		
		//To select all the checkboxes
//		List<WebElement> checkList = driver.findElementByXPath("//label[text()='Select all below checkboxes ']");
		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();        
        driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();        
        driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();        
        driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();        
        driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
				
		driver.close();
	
	}

}
