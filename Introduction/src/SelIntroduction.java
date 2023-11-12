import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		//Invoking Browser
		//Chrome  - ChromeDriver  -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//Safari  - SafariDriver  -> Methods close get
		
		//Interface
		//An Interface is a group of related methods with empty bodies.
		//Its class responsibility to implement the methods declared in the Interface
		//When class agreed to implement the interface, they must need to provide implementation/bodies to all defined methods in Interface
		//In simple term, Interface enforces the Contract to class to follow
		//WebDriver close get
		//WebDriver methods + class methods

		//chromedriver.exe -> Chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		
		//webdriver.chrome.driver -> value of path
		//WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver
		
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "C:/Users/Telum/Documents/GitHub/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //Close current window/tab only
		//driver.quit();  //Close all open windows/tabs
	}

}
