package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		WebElement Mensfashion = driver.findElementByLinkText("Men's Fashion");
		Actions builder = new Actions(driver);
		builder.moveToElement(Mensfashion).perform();

//		driver.findElementByPartialLinkText("Shirts").click();
		driver.findElementByXPath("//a[text()='Shirts']").click();
		Thread.sleep(2000);

//		WebElement shirts = driver.findElementByXPath("//img[@title='Hangup Cotton Blend Multi Prints Shirt']");
//		WebElement shirts = driver.findElementByXPath("//img[@title='Red Tape 100 Percent Cotton Blue Checks Shirt']");
//		WebElement shirts = driver.findElementByXPath("(//img[@class='product-image '])[1]");
		WebElement shirts = driver.findElementByXPath("//p[text()='Red Tape 100 Percent Cotton Blue Checks Shirt']");
		builder.moveToElement(shirts).perform();
		
//		driver.findElementByXPath("(//div[contains(@class,'center quick-view-bar')])[1]").click();	
		driver.findElementByXPath("//div[contains(text(),'Quick View')]").click();
		System.out.println("Quick View clicked successfully");

		driver.close();

	}
	
}
