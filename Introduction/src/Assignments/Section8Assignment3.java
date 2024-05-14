package Assignments;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section8Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class='customradio']/input[@value='user']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement staticDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Consultant");

		driver.findElement(By.cssSelector("[name='terms']")).click();

		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.navbar-brand")));

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card h-100']/div[@class='card-footer']/button"));

		for (WebElement product : products) {
			product.click();
		}

		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	}

}
