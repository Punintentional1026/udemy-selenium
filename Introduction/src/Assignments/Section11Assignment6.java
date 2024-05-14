package Assignments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Section11Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Requirements
		//1. Check any one checkbox under the Checkbox Example
		//2. Grab the label of the selected checkbox. Put into a variable
		//3. Select an option in the Dropdown Example. Here, option to select should come from step 2. Do not hard code text. Drive it dynamically from step 2
		//4. Enter the step 2 grabbed label text in Editbox Alert Example.
		//5. Click Alert and then verify if text present grabbed from step 2 is present in the pop up message

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label"));
		int index = options.size() - 1; //Get the last option index
		options.get(index).findElement(By.tagName("input")).click();
		String optionText = options.get(index).getText();

		WebElement exampleDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(exampleDropdown);
		dropdown.selectByVisibleText(optionText);
		
		driver.findElement(By.id("name")).sendKeys(optionText);
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		System.out.println(driver.switchTo().alert().getText().contains(optionText));
		
		Assert.assertTrue(driver.switchTo().alert().getText().contains(optionText));
	}

}
