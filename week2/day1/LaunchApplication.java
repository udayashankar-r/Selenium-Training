package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_64 bit.exe"); 
		 * FirefoxDriver driver1 = new FirefoxDriver();
		 */
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();

//		driver.findElementById("createLeadForm_companyName").sendKeys("TestleafTraining");
//		driver.findElementById("createLeadForm_firstName").sendKeys("Udayashankar");
//		driver.findElementById("createLeadForm_lastName").sendKeys("R");
	
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Conference");
		dropdown.selectByValue("LEAD_EMPOLYEE");
		dropdown.selectByIndex(3);
		
//		driver.findElementByName("submitButton").click();
 
		 /* Thread.sleep(2000); 
		 * driver.close();
		 */
	}

}
