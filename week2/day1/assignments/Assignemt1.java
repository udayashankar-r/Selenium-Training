package week2.day1.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignemt1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		WebElement username=driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");		
		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("Unimoni");
		driver.findElementById("createLeadForm_firstName").sendKeys("Udayashankar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramamoorthy");

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");		
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Employee");
		System.out.println("The Employee is selected in source field dropdown using SelectbyVisibleText");

		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown1 = new Select(marketing);
		dropdown1.selectByValue("9001");
		System.out.println("The Pay Per Click Advertising is selected in MarketingCampaign field dropdown using SelectbyValue");

		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropdown2 = new Select(ownership);
		dropdown2.selectByIndex(5);
		System.out.println("The Corporation is selected in OwnerShip field dropdown using SelectbyIndex");

		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown3 = new Select(country);
		dropdown3.selectByVisibleText("India");
		System.out.println("The India is selected in Country field dropdown using SelectbyVisibleText");

		driver.findElementByName("submitButton").click();

		String title = driver.getTitle();
		System.out.println("The title is : " +title);
		String Url=driver.getCurrentUrl();
		System.out.println("The Url is " +Url);

		/*
		 * Thread.sleep(2000); 
		 * driver.close();
		 */
	}

}

