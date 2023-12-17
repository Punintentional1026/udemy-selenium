import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000L);

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;

		for (int i = 0; i < products.size(); i++) {
			// Brocolli - 1 Kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in array or not

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on Add to Card
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// 3 times
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
