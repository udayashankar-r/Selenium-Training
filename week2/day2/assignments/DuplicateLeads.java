package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeads {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		//Capturing the names of leads
		String firstname = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").getText();
		System.out.println(firstname);
		String lastname = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName']//a)[1]").getText();
		System.out.println(lastname);
		String companyname = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName']//a)[1]").getText();
		System.out.println(companyname);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]").click();
		driver.findElementByXPath("//a[@class='subMenuButton'][1]").click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//creating duplicate leads
		driver.findElementByXPath("//input[@name='submitButton']").click();
		String forename = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		System.out.println(forename);
		String surname = driver.findElementByXPath("//span[@id='viewLead_lastName_sp']").getText();
		System.out.println(surname);
		String compname = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(compname);
		
		if (firstname.equals(forename) && lastname.equals(surname))			
		{
			System.out.println("Duplicate Lead is created with the captured name");
		} 
		else 
		{
			System.out.println("Duplicate Lead not is created with the captured name");
		}
		driver.close();
	}

}

