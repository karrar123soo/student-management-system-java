package auto;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class cookies {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				WebDriver driver;
				driver=new FirefoxDriver();
				driver.get("https://www.amazon.in");
				Set <Cookie> cookieslist = driver.manage().getCookies();
				int count = cookieslist.size();
			//System.out.println(cookieslist);
			System.out.println("Size of cookies is:"+count);
			System.out.println("  ");
			for(Cookie ck:cookieslist) {
				System.out.println(ck.getName()+ ":"+ck.getValue()); 
				System.out.println("  ");
			}
			//driver.manage().getCookieNamed("session-id");
			System.out.println(driver.manage().getCookieNamed("aws-waf-token"));
		
			//Create CookieSystem.out.println("  ");
			System.out.println("  ");
			
			Cookie NewCookie= new Cookie("DemoCookie", "karrar");
			driver.manage().addCookie(NewCookie);
			
			System.out.println(NewCookie);
			System.out.println("  ");
			
			Set <Cookie> cookieslist1 = driver.manage().getCookies();
			int count2 = cookieslist1.size();
			for(Cookie ck1:cookieslist) {
				System.out.println(ck1.getName()+ ":"+ck1.getValue()); 
				System.out.println("  ");
			}
			
		//System.out.println(cookieslist1);
		System.out.println("Size of cookies is:"+count2);
		System.out.println("  ");
		for(Cookie ck:cookieslist1) {
			System.out.println(ck.getName()+ ":"+ck.getValue());
			System.out.println("  ");
		}
		System.out.println("  ");
		//Delete Named Cookie

		//driver.manage().deleteCookie(NewCookie);
		driver.manage().deleteCookieNamed("session-id");
		//driver.manage().deleteAllCookies();

		Set <Cookie> cookieslist3 = driver.manage().getCookies();
		int count3 = cookieslist3.size();
		System.out.println( "After deleting cookies are:-->" +count3);
		//System.out.println(cookieslist3);
		for(Cookie ck:cookieslist3) {
			System.out.println(ck.getName()+ ":"+ck.getValue());
		}



		driver.quit();
		

			}

		

	

}


