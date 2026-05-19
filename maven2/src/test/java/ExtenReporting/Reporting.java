package ExtenReporting;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtenReporting.Listeners.class)

public class Reporting {

@Test
public void Test_Sucess() {
System.out.println("This is my success scenario test ");
}

@Test
public void Test_Failure() {
System.out.println("This is my failure scenatio test");
Assert.assertTrue(false);

}
@Test
public void Test_Skipped() {
	throw new SkipException("This test is skipped");
}
@Test
public void Test_Sucess1() {
System.out.println("This is my success scenario test------1 ");
}

@Test
public void Test_Failure1() {
System.out.println("This is my failure scenatio test------1");
Assert.assertTrue(false);

}
@Test
public void Test_Skipped1() {
	throw new SkipException("This test is skipped------1");
}
}