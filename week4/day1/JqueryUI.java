package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://jqueryui.com/");
		driver.findElementByXPath("//a[text()='Sortable']").click();		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		WebElement sourceloc = driver.findElementByXPath("(//ul[@id='sortable']/li)[1]");
		WebElement targetloc = driver.findElementByXPath("(//ul[@id='sortable']/li)[4]");
//		WebElement sourceloc = driver.findElementByXPath("(//li[text()='Item 1']");
//		WebElement targetloc = driver.findElementByXPath("(//li[text()='Item 4']");
		
		Point location = targetloc.getLocation();		
		int xloc = location.getX();
		int yloc = location.getY();
		
		Actions builder = new Actions(driver);
//		builder.dragAndDrop(sourceloc, targetloc).perform();
//		builder.click(sourceloc).clickAndHold().keyDown(Keys.SHIFT).moveToElement(targetloc).release().perform();
		builder.dragAndDropBy(sourceloc, xloc, yloc).perform();
		driver.close();
	}

}
