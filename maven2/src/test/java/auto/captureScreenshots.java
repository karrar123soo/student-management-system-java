package auto;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreenshots {

	public static  void main(String[] args) throws IOException {
		// TODO Auto-generated method
		WebDriver driver;

		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//full page screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File("\\screenshots\\homepage.png");
		
		FileUtils.copyDirectory(src, trg);
		driver.close();
		

	}

}
