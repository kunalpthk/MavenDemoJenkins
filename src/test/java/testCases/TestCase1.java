package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@BeforeTest
	public void setup()
	{
		System.out.println("SETUP METHOD");
		
	}

	
	@Test
	public void Test1()
	{
		System.out.println("TEST CASE 1");
		
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("Tear Down Method");
		
	}
	
	

}
