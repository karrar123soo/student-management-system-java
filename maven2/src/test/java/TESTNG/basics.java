package TESTNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basics {
	@BeforeMethod
	public void before() {
		System.out.println("###$$ Before$$$$$$");
	}
	@AfterMethod
	public void After() {
		System.out.println("###$After$$$");
		System.out.println("");
	}
	
	@Test(priority=1)
	public void first() {
		System.out.println("I am in first method");
	}
	@Test (priority=2)
	public void Second() {
		System.out.println("I am in 2nd method");
	
	}
	@Test (priority=3)
	public void Third () {
		System.out.println("I am in 3nd method");
	}
	@Test (priority=4)
	public void forth() {
		System.out.println("I am in 4th method");
	}

}
