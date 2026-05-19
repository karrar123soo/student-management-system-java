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
			WebElement section=driver.findElement(By.xpath("section[@class='product-grid home-page-product-grid']")); 
			WebElement ele;
			WebElement src=ele=driver.findElement((By) OutputType.FILE);
			File trg=new File(".\\screenshots\\section2.png");
			File src1 = null;
			FileUtils.copyFile(src1, trg);
		
		
		
	
		
			


	}

}
