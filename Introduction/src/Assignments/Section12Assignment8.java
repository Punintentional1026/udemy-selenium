package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Section12Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("autocomplete"))).click().sendKeys("uni").build().perform();

		Thread.sleep(1000);

		List<WebElement> items = driver.findElements(By.cssSelector("li.ui-menu-item div"));

		for (int i = 0; i<items.size(); i++)
		{
			if(items.get(i).getText().trim().equals("United States (USA)"))
			{
				a.moveToElement(items.get(i)).click().build().perform();
				break;
			}
		}
		
		Assert.assertEquals(driver.findElement(By.id("autocomplete")).getAttribute("value"), "United States (USA)");
		
		driver.quit();
	}

}
