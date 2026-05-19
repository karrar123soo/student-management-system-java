package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG {

	public static void main(String[] args) throws InterruptedException {
		By driver = null;
		// TODO Auto-generated method stub
		WebDriver driver1;
		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement confirm =driver1.findElement(By.xpath("//div[@class='example']/ul/li[2]/button"));
		Thread.sleep(5000);
		confirm.click();
		Thread.sleep(5000);
		driver1.switchTo().alert().accept();
		/*WebElement Basic_Auth =driver.findElement((SearchContext) By.xpath("//div[@class='example']/ul/li[1]/button"));
		Basic_Auth.click();
		Thread.sleep(5000);
		WebElement confirm1 =driver.findElement((SearchContext) By.xpath("//div[@class='example']/ul/li[2]/button"));
		Thread.sleep(5000);
		confirm1.click();
		Thread.sleep(5000);
		 driver1.switchTo().alert().dismiss();
		WebElement prompt =driver.findElement((SearchContext) By.xpath("//div[@class='example']/ul/li[3]/button"));
		prompt.click();
		Thread.sleep(5000);
		 driver1.switchTo().alert().sendKeys("Pravin");
		Thread.sleep(5000);
		 driver1.switchTo().alert().accept();
		Thread.sleep(5000);*/
		
		
		
		
		
	}

}
