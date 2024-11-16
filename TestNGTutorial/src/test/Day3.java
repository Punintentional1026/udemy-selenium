package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void WebLoginCarLoan()
	{
		//Selenium
		System.out.println("WebLoginCar");
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
	
	@Test
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
	
	@Test
	public void MobileSignInCarLoan()
	{
		//Appium
		System.out.println("Mobile SIGN IN");
	}
	
	@Test
	public void MobileSignOutCarLoan()
	{
		//Appium
		System.out.println("Mobile SIGN OUT");
	}
	
	@Test
	public void APICarLoan()
	{
		//Rest API automation
		System.out.println("APILoginCar");
	}

}
