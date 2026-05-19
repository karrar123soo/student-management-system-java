package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepickar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        System.out.println("start selenium DatePicker Projects");

		        //02 may 2023
		        String Expectedday = "2";
		        String Expectedmonth = "May";
		        String Expectedyear = "2027";

		       // System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://jqueryui.com/datepicker/");

		        // switch frame
		        driver.switchTo().frame(0);

		        //Find date picker webelement to perform click action

		        WebElement datepicker = driver.findElement(By.id("datepicker"));
		        datepicker.click();

		        while(true)
		        {
		            String month =
		            driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
		            System.out.println(month);

		            String year =
		                    driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
		            System.out.println(year);


		            if (month.equals(Expectedmonth) && year.equals(Expectedyear)){
		                List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));
		                for (WebElement e:daylist){
		                    String calenderday = e.getText();
		                    if (calenderday.equals(Expectedday)){
		                        e.click();
		                        break;
		                    }
		                }
		                        break;
		        }
		            else {
		                driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();//forword
		               // driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-w']")).click();//backword
		            
		            }
		        }

		    }

	}


