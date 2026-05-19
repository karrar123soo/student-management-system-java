package auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opennewindows {
	    public static void main(String[] args) throws InterruptedException {
	        //Launch Browser
	   
	        WebDriver driver = new FirefoxDriver();
	        //Maximize Browser
	        driver.manage().window().maximize();
	        //Open Url
	        driver.get("https://www.google.com/");
	        System.out.println("First Page:-"  +driver.getTitle());
	        WebElement search=driver.findElement(By.name("q"));
	        search.sendKeys("selenium");
	        search.sendKeys(Keys.ENTER);
	        //element.sendKeys("selenium").
	     //   driver.findElement(By.name("btnK")).click();
	System.out.println("_____________________________________");

	        Thread.sleep(5000);

	        // Open New Tab/Windows
	        driver.switchTo().newWindow(WindowType.TAB);
	        //driver.switchTo().newWindow(WindowType.WINDOW);
	        Thread.sleep(5000);
	        driver.get("https://www.makemytrip.com/");
	        System.out.println("Second Page:-"  +driver.getTitle());
	        Thread.sleep(5000);
	        System.out.println("_____________________________________");

	        //Get window handles of open windows
	        Set<String> windowHandles= driver.getWindowHandles();
	        List<String> handles = new ArrayList<String>();
	        handles.addAll(windowHandles);

	        //Close Browser and move to previous page
	        Thread.sleep(5000);
	        driver.close();
	        Thread.sleep(5000);
	        driver.switchTo().window(handles.get(0));// open Google page
	        System.out.println("First Page:-"  +driver.getTitle());
	        System.out.println("_____________________________________");
	        
	        Thread.sleep(5000);
	        driver.switchTo().window(handles.get(1));// open MMT page
	        System.out.println("second Page:-"  +driver.getTitle());
	        System.out.println("_____________________________________");
	      
	        Thread.sleep(5000);
	        driver.quit();



	    }
	}


		