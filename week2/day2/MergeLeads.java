package week2.day2;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@type='submit']").click();

		driver.findElementByXPath("(//a)[2]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Merge Leads']").click();

//		WebElement Fromlead = driver.findElementByXPath("//a[contains(@href,''ComboBox_partyIdFrom']");
//		WebElement Fromlead = driver.findElementByXPath("//a[contains(@href,'partyIdFrom']");
//		WebElement ToLead = driver.findElementByXPath("//a[contains(@href,'partyIdTo']");		
		driver.findElementByXPath("(//a)/img[@alt='Lookup'][1]");//.click();
		System.out.println("Merge Lead - FromLead xpath spy success");
		driver.findElementByXPath("(//a)/img[@alt='Lookup'][2]");

		Thread.sleep(2000);
		driver.close();
	}

}
