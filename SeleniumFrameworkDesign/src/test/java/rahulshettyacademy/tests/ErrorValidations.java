package rahulshettyacademy.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.TestComponents.BaseTest;

public class ErrorValidations extends BaseTest {


	@Test
	public void submitOrder() throws IOException, InterruptedException
	{

		String productName = "ZARA COAT 3";

		landingPage.loginApplication("johnhsmith@testng.com", "4GWjvay3BuSciU1z");
		Assert.assertEquals("Incorrect email or pas@@sword.", landingPage.getErrorMessage());

	}

}
