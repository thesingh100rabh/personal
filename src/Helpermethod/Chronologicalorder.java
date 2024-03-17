package Helpermethod;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronologicalorder {
	@org.testng.annotations.BeforeSuite()
	public void BeforeSuite() {
		System.out.println("befores siute");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("befores test");
}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("befores class");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("befores method");
	}
	@Test
	public void Test() {
		System.out.println("Test case");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After mathod ");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class ");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After test ");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite ");
	}
}






