import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//1. Print the number of rows
		System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tr")).size());
		
		//2. Print the number of columns
		System.out.println(driver.findElements(By.cssSelector("table[name='courses'] th")).size());

		//3. Print the data in row 2
		List<WebElement> cells = driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(3) td"));
		
		for (int i=0; i<cells.size(); i++)
		{
			System.out.println(cells.get(i).getText());
		}
	}

}
