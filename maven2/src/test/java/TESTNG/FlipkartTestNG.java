package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class FlipkartTestNG {
	
	WebDriver driver;
	@BeforeMethod
	public void openUrl() {
	
	driver=new ChromeDriver();
	

	driver .get("http://www.flipkart.com/");
	}
	@Test
	public void search() {
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Iphone");
		driver.findElement(By.xpath("//div[@class='FO_kXv']/button")).click();
		searchbox.click();
	}

}
