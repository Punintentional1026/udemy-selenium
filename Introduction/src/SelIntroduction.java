import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction implements WebDriver {

	public static void main(String[] args) {

		//Invoking Browser
		//Chrome  - ChromeDriver  -> Methods close get
		//Firefox - FirefoxDriver -> Methods close get
		//Safari  - SafariDriver  -> Methods close get
		
		//Interface
		//An Interface is a group of related methods with empty bodies.
		//Its class responsibility to implement the methods declared in the Interface
		//When class agreed to implement the interface, they must need to provide implementation/bodies to all defined methods in Interface
		//In simple term, Interface enforces the Contract to class to follow
		//WebDriver close get
		//WebDriver methods + class methods

		//
		WebDriver driver = new ChromeDriver();
		

	}

}
