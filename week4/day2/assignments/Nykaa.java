package week4.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.nykaa.com/");		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement brands = driver.findElementByXPath("//a[text()='brands']");		
		Actions builder = new Actions(driver);		
		builder.moveToElement(brands).perform();
		
		WebElement popular = driver.findElementByXPath("//a[text()='Popular']");		
		builder.moveToElement(popular).perform();		
		driver.findElementByXPath("//img[@src=\"https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png\"]").click();
		
		String winHandleBefore = driver.getWindowHandle();
		
		for (String handle : driver.getWindowHandles()) {			 
		    driver.switchTo().window(handle);
		}
		
		String title = driver.getTitle();
		String value = "L'Oreal Paris";
		System.out.println("The title of page is : " +title);
		
		if(title.contains(value)) {
			System.out.println("Page title contains L'Oreal Paris");
		}		
		else {
			System.out.println("Does not contain L'Oreal Paris");
		}
		
		driver.switchTo().window(winHandleBefore);		
		driver.close();
		
		for (String handle : driver.getWindowHandles()) {			 
		    driver.switchTo().window(handle);
		}
		
		driver.findElementByXPath("//span[text()='Sort By : ']").click();		
		driver.findElementByXPath("//span[text()='customer top rated']").click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		driver.findElement(By.xpath("(//label[@for='chk_Shampoo_undefined']//div)[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='card-img']//img)[1]")).click();
//		String winHandleAfter = driver.getWindowHandle();

		for (String handle : driver.getWindowHandles()) {
		    driver.switchTo().window(handle);
		}

		driver.findElementByXPath("//button[text()='ADD TO BAG']").click();
		driver.findElementByClassName("AddBagIcon").click();
		driver.findElementByXPath("//span[text()='Proceed']").click();
		
		String message = driver.findElementByClassName("popup-error").getText();
		System.out.println(message);

		driver.quit();

	}

}
