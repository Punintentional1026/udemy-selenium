package rahulshettyacademy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys("RobertKMaley@rhyta.com");
		driver.findElement(By.id("userPassword")).sendKeys("CHl($$U-Vb\"0wq;");
		driver.findElement(By.id("login")).click();
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		// This is how I would handle adding the ZARA COAT 3 product to the cart
		for (WebElement product : products) {
			String productName = product.findElement(By.tagName("b")).getText();
			
			if(productName.equals("ZARA COAT 3"))
			{
				product.findElement(By.xpath("//Button[2]")).click();
			}
		}
		

	}

}
