package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTrainNamesAreUnique {

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

		WebElement tostation = driver.findElementById("txtStationTo");
		tostation.clear();
		tostation.sendKeys("Mumbai Central",Keys.TAB);
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		int size = rows.size();
		System.out.println("The size of rows is : " +size);
		String trainname = null;
		List <String>tname=new ArrayList<String>();
		
	      for(int i=1;i<rows.size();i++)
	      {
	    	  trainname=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();
	    	  System.out.println(trainname);
	    	  tname.add(trainname);	
	      }
				
		Set<String> rows2 = new HashSet<String>(tname);
		int size1 = rows2.size();
		System.out.println("The size of rows is : " +size1);

		if(size!=size1) {
	    	 System.out.println("train names are duplicated");
	     }
	     else {
	    	 System.out.println("train names are unique/not duplicated");
	     }
		driver.close();
	}

}

