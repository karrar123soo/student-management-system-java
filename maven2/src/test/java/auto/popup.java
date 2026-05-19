package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class popup {
	WebDriver driver;
	
	@BeforeMethod
	public void openbroser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
	}
@Test(priority=1)
	public void Basic_Auth() throws InterruptedException {
	WebElement Basic_Auth =driver.findElement(By.xpath("//div[@class='example']/ul/li[1]/button"));
	Basic_Auth.click();
	Thread.sleep(5000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	}
@Test(priority=2)
public void confirm_ok() throws InterruptedException {
	WebElement confirm =driver.findElement(By.xpath("//div[@class='example']/ul/li[2]/button"));
	Thread.sleep(5000);
	confirm.click();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	}

@Test(priority=3)
public void confirm_cancel() throws InterruptedException {
	WebElement confirm =driver.findElement(By.xpath("//div[@class='example']/ul/li[2]/button"));
	Thread.sleep(5000);
	confirm.click();
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(5000);
	}
@Test(priority=4)
public void prompt_ok() throws InterruptedException {
	WebElement prompt =driver.findElement(By.xpath("//div[@class='example']/ul/li[3]/button"));
	prompt.click();
	Thread.sleep(5000);
	driver.switchTo().alert().sendKeys("Pravin");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	Thread.sleep(5000);
}
@Test(priority=5)
public void prompt_cancel() throws InterruptedException {
	WebElement prompt =driver.findElement(By.xpath("//div[@class='example']/ul/li[3]/button"));
	prompt.click();
	Thread.sleep(5000);
	driver.switchTo().alert().sendKeys("Pravin");
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();
	Thread.sleep(5000);
}
@AfterMethod
public void close() {
	driver.close();
}
	
}

	