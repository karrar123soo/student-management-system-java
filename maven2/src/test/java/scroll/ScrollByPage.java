package scroll;



	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class ScrollByPage {

	    WebDriver driver;
	    @Test
	    public void ByPage() throws Exception {
	       
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("https://www.amazon.in/");

	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        Thread.sleep(5000);
	    }
	}


