package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement frame = driver.findElementById("iframeResult");
		driver.switchTo().frame(frame); //driver.switchTo().frame(0);
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("udayashankar");
		alert.accept();
		
//		driver.switchTo().frame(frame);
		String name = driver.findElementByXPath("//p[contains(text(),'udayashankar')]").getText();
		System.out.println(name);
		
		if (name.contains("udayashankar")) {
			System.out.println("Name given in alert exist in text");
		}
		else {
			System.out.println("Name given in alert doesn not exist in text");
		}
		
		driver.close();
	}

}

