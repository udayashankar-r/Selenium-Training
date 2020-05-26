package week3.day2.assginments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElementById("FromTag").sendKeys("Chennai",Keys.TAB);		
		driver.findElementByName("destination").sendKeys("New York",Keys.TAB);			
		driver.findElementByXPath("//a[contains(@class,'ui-state-default ui-state-highlight')]").click();
		
		WebElement adults = driver.findElementById("Adults");		
		Select adult = new Select(adults);		
		adult.selectByValue("3");

		WebElement children = driver.findElementById("Childrens");		
		Select child = new Select(children);		
		child.selectByValue("2");
		
		WebElement infant = driver.findElementById("Infants");		
		Select infants = new Select(infant);		
		infants.selectByValue("1");
		
		driver.findElementById("MoreOptionsLink").click();
		
		WebElement classOfTravel = driver.findElementById("Class");		
		Select travel = new Select(classOfTravel);		
		travel.selectByValue("Economy");

		driver.findElementById("AirlineAutocomplete").sendKeys("Emirates",Keys.TAB);		
		driver.findElementById("SearchBtn").click();
		
		System.out.println("No flights found for this search");	

	}

}