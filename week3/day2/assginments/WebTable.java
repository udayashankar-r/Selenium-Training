package week3.day2.assginments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();

		List<WebElement> tablerows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		System.out.println("The no.of rows in table is : " +tablerows.size());

		for (int i = 2; i <= tablerows.size(); i++) {
//			String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]").getText(); 
//			System.out.println(text);

			List<WebElement> tablecols = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
			for (int j = 1; j <= tablecols.size(); j++) 
			{
				String text2 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				System.out.print(text2);
			}
			System.out.println(" ");
			System.out.println("The no.of columns/cells in table is : " +tablecols.size());
		}

		String progressvalue = driver.findElementByXPath("//td[text()='Learn to interact with Elements']/following-sibling::td").getText();
		System.out.println("The progress value of 'Learn to interact with Elements' is : " +progressvalue);

		List<WebElement> rows= driver.findElementsByXPath("//table[@id='table_id']//tr//td[2]");
		List<Integer> integer=new ArrayList<Integer>();
		String progress="";
		
		for (WebElement pro : rows) {
			progress= pro.getText().replaceAll("%", "");
			integer.add(Integer.parseInt(progress));			
		}
	
		Collections.sort(integer);
		System.out.println(integer);
		System.out.println(integer.get(0));

		driver.findElementByXPath("(//td[(text()='30%')]/following::input)").click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
