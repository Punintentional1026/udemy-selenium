package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before executing any method in the class");
	}
	
	@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlname)
	{
		//Selenium
		System.out.println("WebLoginCar");
		System.out.println(urlname);
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

}
