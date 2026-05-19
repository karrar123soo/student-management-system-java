package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
	public static void  main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		//Maximize Browser
		driver.manage().window().maximize();
		//Open url
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		// uncheck both checkboxes
		WebElement chek1=driver.findElement(By.xpath("// input[@type='check'][1]"));
		chek1.click();
		Thread.sleep(2000);
		WebElement chek2=driver.findElement(By.xpath("//input[@type='// input[@type='check'][2]"));
		Thread.sleep(2000);
		
		//check both check boxes
		chek1=driver.findElement(By.xpath("//input[@type='// input[@type='check'][1]"));
		WebElement check1 = null;
		check1.click();
		Thread.sleep(2000);
		driver.close();
		chek2=driver.findElement(By.xpath("//input[@type='// input[@type='check'][2]"));
		WebElement check2 = null;
		check2.click();
		Thread thrad = null;
		thrad.sleep(2000);
		driver.close();
		

	}
}



