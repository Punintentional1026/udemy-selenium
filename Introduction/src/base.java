import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//expected
		String[] names = {"Cucumber", "Brocolli"}; 
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));)

		for (int i=0; i < products.size(); i++)
		{
			String name = products.get(i).getText();
			
			if (name.contains("Cucumber"))
			{
				//click on Add to Card
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

		for (int i=0; i < products.size(); i++)
		{
			String name = products.get(i).getText();
			
			if (name.contains("Brocoli"))
			{
				//click on Add to Card
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

}
