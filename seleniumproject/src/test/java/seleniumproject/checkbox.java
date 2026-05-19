package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();

		//Maximize Browser
		driver.manage().window().maximize();
		//Open Url
		driver.get("https://the-internet.herokuapp.com/checkboxes");


		// uncheck both checkboxes
		WebElement chek1 = driver.findElement(By.xpath("//input[@type ='checkbox'][1]"));
		chek1.click();
		Thread.sleep(2000);
		WebElement chek2 = driver.findElement(By.xpath("//input[@type ='checkbox'][2]"));
		chek2.click();
		Thread.sleep(2000);

		// checked both check boxes
		chek1 = driver.findElement(By.xpath("//input[@type ='checkbox'][1]"));
		chek1.click();
		Thread.sleep(2000);
		WebElement chek3 = driver.findElement(By.xpath("//input[@type ='checkbox'][2]"));
		chek3.click();
		Thread.sleep(2000);

		// driver.close();

	}
}




