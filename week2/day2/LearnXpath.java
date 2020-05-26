package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.findElementByXPath("(//a)[2]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[@href='http://leaftaps.com/crmsfa/control/createLeadForm']").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Uni");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Udayashankar");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("R");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		System.out.println("Lead created successfully using xpath");
		
	}

}
