package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

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
	driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);

	String id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").getText();
	System.out.println("The first lead id is : "+id);

	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
//	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]").click();
//	driver.findElementByXPath("//td[@clas='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])").click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();

	//After deleting the id
	driver.findElementByXPath("//a[text()='Find Leads']").click();
	driver.findElementByXPath("//input[@name='id']").sendKeys(id);
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	
	String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
	System.out.println(text);
	driver.close();
	
	}

}
