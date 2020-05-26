package week3.day2;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementById("chkSelectDateOnly").click();

		WebElement fromstation = driver.findElementById("txtStationFrom");
		fromstation.clear();
		fromstation.sendKeys("New Delhi",Keys.TAB);
		Thread.sleep(1000);

		WebElement tostation = driver.findElementById("txtStationTo");
		tostation.clear();
		tostation.sendKeys("Madurai Jn",Keys.TAB);
		Thread.sleep(2000);

		List <WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");

		for (int i = 1; i <= rows.size() ; i++)
		{
			List <WebElement> columns = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td");

			for (int j = 1; j <=columns.size() ; j++)
			{
				String content = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]").getText();
				System.out.print(content+" ");
			}
			System.out.println();
		}
		driver.close();
	}

}
