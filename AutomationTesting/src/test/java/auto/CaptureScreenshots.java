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

public class CaptureScreenshots {
	 public void main(String[] args) throws IOException {


			 WebDriver driver;
			 driver= new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			 driver.manage().window().maximize();
			//Full Page screenshot
			TakesScreenshot ts=(TakesScreenshot) driver;
		
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File(".\\screenshots\\homepage.png");

			File trg1 = null;
			FileUtils.copyDirectory(src,trg1);
			driver.close();
		
		
		
	
		
			


	}

}
