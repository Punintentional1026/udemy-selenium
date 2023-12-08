import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		//	//a[@value='BLR'] - xpath for Bengaluru
		//	//a[@value='MAA'] - xpath for Chennai

		//	//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		//	//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.quit();
	}

}
