package week4.day1.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UiPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();		
		Thread.sleep(2000);

		WebElement vendors = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
//		WebElement vendors = driver.findElementByXPath("//i[@class='fa fa-truck']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(vendors).perform();

		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("BLue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		String cname = driver.findElementByXPath("//td[5]").getText(); // --//tr/td[5]
		System.out.println("Country name is : " +cname);
		driver.findElementByXPath("//a[@href='/account/logout/']").click();

		driver.close();
	}

}
