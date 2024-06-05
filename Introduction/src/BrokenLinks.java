import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//broken URL
		//Step 1 - Is to get all urls tied up to the links using Selenium
		// Java methods will call URL's and gets you the status code
		//If status code > 400 then that url is not working -> link which tied to url is broken
		//a[href*="soapui"]
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);

	}

}
