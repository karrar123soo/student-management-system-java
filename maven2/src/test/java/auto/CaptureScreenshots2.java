package auto;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots2 {
	public static void main(String[] args) throws IOException {


			 WebDriver driver;
			 driver= new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			 driver.manage().window().maximize();
			//Full Page screenshot
			TakesScreenshot ts=(TakesScreenshot) driver;
			//Screenshot of section/portion of the page
			WebElement section=driver.findElement(By.xpath("//div[@class='news-items'")); 
			File src=section.getScreenshotAs(OutputType.FILE);
	
		
			File trg=new File(".\\screenshots\\section3.png");
		
			FileUtils.copyFile(src, trg);
		
		
		
	
		
			


	}

}
