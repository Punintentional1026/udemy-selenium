
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
//		FirefoxOptions options1 = new FirefoxOptions();
//		options1.setAcceptInsecureCerts(true);
//		EdgeOptions options2 = new EdgeOptions();
//		options2.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.chrome.driver", "C:/Users/Telum/Documents/GitHub/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);
		driver.get("http://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
