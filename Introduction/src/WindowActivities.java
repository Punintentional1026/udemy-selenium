import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); //.get() - Selenium will wait until page is fully loaded
		driver.navigate().to("https://rahulshettyacademy.com"); //.navigate() - doesn't wait until fully load
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
