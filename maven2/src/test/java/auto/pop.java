package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class pop {

WebDriver driver;
	
		@Test(priority=1)
		public void Basic_Auth() throws InterruptedException {
		WebElement Basic_Auth =driver.findElement(By.xpath("//div[@class='example']/ul/li[1]/button"));
		Basic_Auth.click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		}
	

	}


