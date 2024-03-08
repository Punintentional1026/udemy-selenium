import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1. Give me the count of links on the page
		//2. Count of footer section

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//This is my take on how to get all of the links in the page footer
		links = driver.findElements(By.cssSelector("#gf-BIG a"));
		System.out.println(links.size());
		
		//This is how the instructor handled getting all of the links in the footer by defining the scope of the driver
		//Limiting webdriver scope
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. Links of only the first column in the footer
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//4. Click on each link in the column and check if the pages are opening
		for(int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			//Instructor's solution for getting the window tab's title
			Thread.sleep(5000L);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		//This is my solution to get the each window tab's title
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		System.out.println(windows);
//		System.out.println(it);
//		while(it.hasNext())
//		{
//			driver.switchTo().window(it.next());
//			Thread.sleep(5000);
//			System.out.println(driver.getTitle());
//		}
//		Thread.sleep(5000);
//		driver.switchTo().defaultContent();

	}

}
