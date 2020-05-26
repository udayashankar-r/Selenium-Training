package week3.day2.assginments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");		
		driver.manage().window().maximize();

		WebElement source = driver.findElementById("src");		
		source.sendKeys("Chennai");
		Thread.sleep(2000);
		source.sendKeys(Keys.TAB);

		WebElement destination = driver.findElementById("dest");		
		destination.sendKeys("Trichy");		
		Thread.sleep(2000);		
		destination.sendKeys(Keys.TAB);

		driver.findElementByXPath("//label[@for='onward_cal']").click();		
		driver.findElementByXPath("(//td[@class='current day'])[2]").click();		

		driver.findElementByXPath("//label[@for='return_cal']").click();		
		driver.findElementByXPath("(//td[text()='20'])[2]").click();				

		driver.findElementById("search_btn").click();

		System.out.println("Oops! No buses found");
		
		driver.close();
	}

}
