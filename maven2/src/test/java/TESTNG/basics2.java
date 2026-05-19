package TESTNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basics2 {
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
	public void fifth() {
		System.out.println("I am in 5th method");
	}
	@Test (priority=2)
	public void Sixth() {
		System.out.println("I am in  6th method");
	
	}
	@Test (priority=3)
	public void Seventh () {
		System.out.println("I am in 7rd method");
	}
	@Test (priority=4)
	public void Eight() {
		System.out.println("I am in 8th method");
	}

}
