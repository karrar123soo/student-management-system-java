package auto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsk {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("http://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String id=driver.getWindowHandle();
		System.out.println(id);
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("PLAYTATION 5");
		searchbox.sendKeys(Keys.ENTER);
		
	

	}

}
