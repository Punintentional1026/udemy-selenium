package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void AfterTest()
	{
		System.out.println("I will execute last");
	}

	@Test
	public void Demo()
	{
		System.out.println("hello"); //automation
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}

}
