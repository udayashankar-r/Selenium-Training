package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTextChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.textToBe(By.id("btn"),"Click ME!"));
		driver.findElementById("btn").click();
		System.out.println("Click ME! button is clicked, Alert appears with text Click ME!");
		driver.quit();
	}

}
