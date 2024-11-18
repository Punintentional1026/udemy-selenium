package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname)
	{
		//Selenium
		System.out.println("WebLoginHomePersonalLoan");
		System.out.println(urlname);
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("APILoginHome");
	}

}
