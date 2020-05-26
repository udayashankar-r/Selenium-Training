package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("gopi");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]").click();
		String title = driver.getTitle();

		String name = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
			
		driver.findElementByXPath("//a[@class='subMenuButton'][3]").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Companynamechange");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		
		String name1 = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		
		System.out.println(title);
		System.out.println("The old name of company : "+name);
		System.out.println("The new name of company : "+name1);
		driver.close();

	}

}

