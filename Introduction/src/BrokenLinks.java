import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedrive/chromedriver.exer");
		WebDriver driver = new ChromeDriver();
		
		//broken URL
		//Step 1 - Is to get all urls tied up to the links using Selenium
		// Java methods will call URL's and gets you the status code
		//If status code > 400 then that url is not working -> link which tied to url is broken
		//a[href*="soapui"]
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");

	}

}
