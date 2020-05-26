package week2.day1.assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();

		//Click button to travel home page
		driver.findElementById("home").click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("//img[@alt='Buttons']").click();
		
		//Find position of button (x,y)
		Point position = driver.findElementById("position").getLocation();
		int x = position.getX();
		int y = position.getY();
		
		System.out.println("Position of the x is " + x);
		System.out.println("Position of the y is " + y);
		
		//Find button color
		String color = driver.findElementById("color").getCssValue("background-color");
		System.out.println("The color if button is : "+color);
				
		//Find the height and width
		Dimension size = driver.findElementById("size").getSize();		
		System.out.println("The Height and width of button is : "+size);	
				
		driver.close();

	}

}
