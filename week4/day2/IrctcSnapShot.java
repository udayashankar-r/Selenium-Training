package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IrctcSnapShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Ok']").click();
//		driver.findElementByXPath("//span[@class='allcircle circleone']").click();
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
		
		for (String handle : driver.getWindowHandles())	
		{			 
		    driver.switchTo().window(handle);
		}

		Actions builder = new Actions(driver);
		WebElement agree = driver.findElementByXPath("//label[@for='agree']");		
		builder.moveToElement(agree).click().perform();
		
		driver.findElementByXPath("//button[text()='Continue ']").click();		
		
		File src = driver.getScreenshotAs(OutputType.FILE);		
		File dest = new File("./Screenshots/planes.png");		
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
	}

}

