import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String[] expectedList = {monthNumber, date, year};

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		
		//This is how I would handle selecting the date
		//driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		//driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).click();
		//driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		//driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		//driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__decade-view__years__year'][contains(text(), " + year + ")]")).click();
		//driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month'][" + monthNumber + "]")).click();
		//driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']/abbr[contains(text(), " + date + ")]")).click();

		
		//This is how the instructor handled selecting the date
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i = 0; i < actualList.size(); i++)
		{
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i+1]);
		}
		
		driver.close();
	}

}
