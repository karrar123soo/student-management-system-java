package scroll;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.*;

	public class ScrollByVisibleElement {
		WebDriver driver;
		JavascriptExecutor js;
		@BeforeMethod
		public void openbrowser() throws InterruptedException {
			 driver = new ChromeDriver();
		        //driver.manage().window().maximize();
		        js = (JavascriptExecutor) driver;

		        //Launch the application		
		        driver.get("https://www.w3schools.com/");
		        Thread.sleep(5000);
		}
		
		@AfterMethod
		public void closebrowser() {
			//driver.close();
		}
		
		

	    @Test 
	    public void ByVisibleElement() {
	     
	        //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.xpath("//a[@title='Git Tutorial']/div/h2"));
	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	    }
	    
	    @Test
	    public void ByPixel() {
	        
	       
	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,2000)");
	    }
	    
	    @Test
	    public void ByPage() {
	       
	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        //document.body.scrollHeight - end of the Page
	    }
	}

