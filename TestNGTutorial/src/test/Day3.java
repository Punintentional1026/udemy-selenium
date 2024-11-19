package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before executing any method in the class");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void WebLoginCarLoan(String urlname, String key)
	{
		//Selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("I will execute before every Day3 test class");
	}
	
	@AfterMethod
	public void AferEvery()
	{
		System.out.println("I will execute after every Day3 test class");
	}

	@AfterClass
	public void AfterClass()
	{
		System.out.println("After executing all methods in the class");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCar");
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobileSignInCarLoan()
	{
		//Appium
		System.out.println("Mobile SIGN IN");
	}
	
	@Test(timeOut=4000)
	public void MobileSignOutCarLoan()
	{
		//Appium
		System.out.println("Mobile SIGN OUT");
	}
	
	@Test(dependsOnMethods={"WebLoginCarLoan","MobileSignOutCarLoan"})
	public void APICarLoan()
	{
		//Rest API automation
		System.out.println("APILoginCar");
	}
	
	@DataProvider
	public void getData()
	{
		//1st combination - username password - good credit history = row
		//2nd - username password - no credit history
		//3rd - username password - fraudulent credit history
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
	}

}
