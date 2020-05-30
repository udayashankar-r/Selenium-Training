package week4.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContacts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("demosalesmanager");		
		driver.findElementById("password").sendKeys("crmsfa");		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByPartialLinkText("CRM").click();		
		driver.findElementByLinkText("Contacts").click();		
		driver.findElementByLinkText("Merge Contacts").click();		
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])").click(); //driver.findElementByXPath("//img[@height='14']").click();

		String winHandleBefore = driver.getWindowHandle();
		
		for (String handle : driver.getWindowHandles())
		{			 
		    driver.switchTo().window(handle);
		}
		
		driver.findElementByXPath("//a[@class='linktext'][1]").click();		
		driver.switchTo().window(winHandleBefore);
		
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click(); //driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

		for (String handle : driver.getWindowHandles())
		{			 
		    driver.switchTo().window(handle);
		}
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		driver.switchTo().window(winHandleBefore);
		
		driver.findElementByXPath("//a[text()='Merge']").click();		
		TargetLocator switchTo = driver.switchTo();

		Alert alert = switchTo.alert();		
		//Thread.sleep(1000);			
		alert.accept();
		
		String title = driver.getTitle();		
		System.out.println(title);
		
		driver.close();	
	}

}
