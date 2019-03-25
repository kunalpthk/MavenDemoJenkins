package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	@BeforeTest
	public void setup()
	{
		System.out.println("SETUP METHOD");
		
	}

	
	@Test
	public void Test2()
	{
		System.out.println("TEST CASE 2");
		
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("Tear Down Method");
		
	}

}
