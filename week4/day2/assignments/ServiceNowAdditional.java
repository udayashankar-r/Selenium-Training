package week4.day2.assignments;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowAdditional {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://dev60453.service-now.com/");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.switchTo().frame("gsft_main");		
		driver.findElementById("user_name").sendKeys("admin");		
		driver.findElementById("user_password").sendKeys("India@123");		
		driver.findElementById("sysverb_login").click();
		
		driver.findElementById("filter").sendKeys("change",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[text()='Open'])[3]").click();
		Thread.sleep(3000);

		WebElement frame = driver.findElementById("gsft_main");
		driver.switchTo().frame(frame);
		
		driver.findElementByXPath("//button[text()='New']").click();
		driver.findElementByLinkText("Normal: Changes without predefined plans that require approval and CAB authorization.").click();
		driver.findElementByXPath("(//div[@class='form-group '])[1]");
		
		String changerequestnumber = driver.findElementById("change_request.number").getAttribute("value");
		System.out.println("First captured change request number: "+changerequestnumber);
		
		driver.findElementById("change_request.short_description").sendKeys("Change request service now");		
		driver.findElementById("sysverb_insert_bottom").click();
		driver.findElementById("change_request_table_header_search_control").sendKeys(changerequestnumber,Keys.ENTER);
		
		String creatednumber = driver.findElementByXPath("//table[@id='change_request_table']/tbody[1]/tr[1]/td[3]/a[1]").getText();		
		System.out.println("Searched number: "+creatednumber);
		
		if(changerequestnumber.equals(creatednumber)) 
		{
			System.out.println("Successful");
		}
		else {
			System.out.println("UnSuccessful");
		}

	}

}

