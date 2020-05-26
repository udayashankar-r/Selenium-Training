package week2.day1.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//Go to Home Page
		driver.findElementByLinkText("Go to Home Page").click();
		String title = driver.getTitle();
		System.out.println("The title of Home Page is : " +title);
		driver.findElementByXPath("//img[@alt='Link']").click();
		
		//Find where am supposed to go without clicking me?
		driver.findElementByXPath("//a[@href='Button.html']").click();
		String title1 = driver.getTitle();
		System.out.println("The title of Navigated Page is : " +title1);
		driver.findElementById("home").click();
		driver.findElementByXPath("//img[@alt='Link']").click();

		//Verify am I broken
		driver.findElementByXPath("//a[@href='error.html']").click();		
		String title2 = driver.findElementByXPath("//h1[text()='HTTP Status 404 – Not Found']").getText();		
		System.out.println("The title of Error Page is : " +title2);
		driver.navigate().back();
		
		//Go to Home Page (Interact with same link name)
		driver.findElementByLinkText("Go to Home Page").click();
		String title3 = driver.getTitle();
		System.out.println("The title of Home Page(Interact with same linkname) is : " +title3);
		driver.findElementByXPath("//img[@alt='Link']").click();

		//How many links are available in this page?
		List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on this page are :"+nooflinks.size());
		
		driver.close();
		
	}

}

