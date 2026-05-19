package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String id=driver.getWindowHandle();
		System.out.println(id);
		
	WebElement searchbox=driver.findElement(By.id(""));
	searchbox.sendKeys("mobile");
	WebElement searchbox1=driver.findElement(By.id("nav search submit buton"));

	}

}
