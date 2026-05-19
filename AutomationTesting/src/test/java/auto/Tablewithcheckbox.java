package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablewithcheckbox {


	

			public static void main(String[] args) throws InterruptedException {
				 System.out.println("start selenium Table handle Projects");
		        // System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		         WebDriver driver;
		         driver=new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.get("https://testautomationpractice.blogspot.com/");
		         // print single cell
		         WebElement next0=driver.findElement(By.xpath("//ul[@id=='pagination']/li[1]/a"));
		         next0.click();
		         WebElement element=driver.findElement(By.xpath("//table[@id='productTable']/tr[2]/td[4]/input"));
		         element.click();
		         Thread.sleep(2000);
		         WebElement next=driver.findElement(By.xpath("//ul[@id='pagination']/li[4]/a"));
		         next.click();
		         Thread.sleep(2000);
		         WebElement element2=driver.findElement(By.xpath("/table[@id='productTable']/tr[3]/td[4]/input"));
		         element2.click();
		         WebElement next1=driver.findElement(By.xpath("//ul[@id='pagination']/li[2]/a"));
		         next1.click();
		         Thread.sleep(2000);
		         WebElement element3=driver.findElement(By.xpath("//table[@id='productTable']/tr[3]/td[4]/input"));
		         element3.click();
		         
		         

			}

		

	}


