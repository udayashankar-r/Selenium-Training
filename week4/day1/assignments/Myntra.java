package week4.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

		WebElement womensfashion = driver.findElementByXPath("//a[text()='Women']");
		Actions builder = new Actions(driver);
		builder.moveToElement(womensfashion).perform();
		Thread.sleep(2000);

		driver.findElementByXPath("//a[text()='Jackets & Coats']").click();
		String items = driver.findElementByClassName("title-count").getText();
		items = items.replaceAll("[^0-9.]", "");

		int itemsCount = Integer.parseInt(items);
		System.out.println("Total count of item: "+itemsCount);

		driver.findElementByXPath("//span[text()='Categories']");

		String  jackets = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		jackets = jackets.replaceAll("[^0-9.]", "");
		int jacketCount = Integer.parseInt(jackets);

		String coat = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		coat = coat.replaceAll("[^0-9.]", "");
		int coatCount = Integer.parseInt(coat);

		int sum=jacketCount+coatCount;
		System.out.println("Sum of jacket and coats count: "+sum);

		if(itemsCount == sum) {
			System.out.println("sum of categories count matches");
		}
		else {
			System.out.println("sum of categories count does not matches");
		}

		driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
		driver.findElementByXPath("//div[text()='+ ']").click();

		WebElement mango = driver.findElementByXPath("//input[@placeholder='Search brand']");
		mango.sendKeys("MANGO");
		driver.findElementByXPath("//label[@class=' common-customCheckbox']//div[1]").click();
		driver.findElementByXPath("//div[@class='FilterDirectory-titleBar']//span[1]").click();

		WebElement count = driver.findElementByXPath("//div[@class='search-leftContainer column-base']");
		String mANGO = driver.findElement(By.xpath("//label[text()='MANGO']")).getText();
		Thread.sleep(1000);
		mANGO = mANGO.replaceAll("[^0-9.]", "");
		System.out.println(count);	//System.out.println(mANGO);

		WebElement category = driver.findElementByXPath("//div[@class='vertical-filters-filters categories-container']");
		String coats = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[2]")).getText();
		coats = coats.replaceAll("[^0-9.]", "");
		System.out.println(category);	//System.out.println(coats);

		if(mANGO.equals(coats))	{
			System.out.println("All the Coats are of brand MANGO");
		}
		else {
			System.out.println("Not All the Coats are of brand MANGO");
		}

		driver.findElementByClassName("sort-sortBy").click();
		driver.findElementByXPath("//label[text()='Better Discount']").click();
		WebElement elementByXPath = driver.findElementByXPath("//ul[@class='results-base']/li");
		String amount = driver.findElementByXPath("//span[text()='4794']").getText();
	    System.out.println("The price of the first displayed Item is: "+amount);

		WebElement wishList = driver.findElementByXPath("(//span[@class='product-actionsButton product-wishlist '])[1]");
		builder.moveToElement(elementByXPath).perform();
		builder.click(wishList).perform();

		driver.close();
	}

}
