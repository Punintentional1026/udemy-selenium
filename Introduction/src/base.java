import java.util.Arrays;
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
		
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"}; 
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));)

		for (int i=0; i < products.size(); i++)
		{
			String name = products.get(i).getText();
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in array or not
			
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		
			if (itemsNeededList.contains(name))
			{
				//click on Add to Card
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
