import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section7Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("John Smith");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("john.smith@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password123");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(genderDropdown);
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("01/01/2023");
		driver.findElement(By.cssSelector("input[type='Submit']")).click();
	}

}
