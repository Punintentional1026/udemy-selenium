package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section10Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		WebElement topFrame = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(topFrame);
		WebElement middleFrame = driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame(middleFrame);
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
