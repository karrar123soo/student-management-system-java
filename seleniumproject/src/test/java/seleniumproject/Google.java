package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=6331360819268185659&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061658&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		String title=driver.getTitle();
		System.out.println(title);
		String id=driver.getWindowHandle();
		System.out.println(id);
		
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("PLAYTATION 5");
		searchbox.sendKeys(Keys.ENTER);
		

	}

}
