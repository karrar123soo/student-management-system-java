package pages;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
	By username=By.id("Standard_user");
	By password=By.id("secret_sauce");
	By loginbutton=By.id("login-button");

	private WebDriverWait Wait;
	
	public LoginPage (WebDriver driver) {
		this.driver=driver;
		Wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
	}
	public void login(String user,String pass)  {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
	
	}

}
