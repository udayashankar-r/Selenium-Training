package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads {
	
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
		driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();

		String firstid=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a").getText();
		System.out.println("The first id in Find Leads is : " +firstid);
		
		Thread.sleep(2000); 
		driver.close();
	}

}
