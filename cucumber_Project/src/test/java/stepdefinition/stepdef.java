package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(5000);
	  
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password(String username,String password) throws InterruptedException {
	    driver.findElement(By.id("user-name")).sendKeys("username");
	    Thread.sleep(5000);
	    driver.findElement(By.id("password")).sendKeys("password");
	    Thread.sleep(5000);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
		 driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigated to Hpme Page")
	public void user_is_navigated_to_hpme_page() {
		String ex_title="Swag Labs";
		String title= driver.getTitle();
		
	   Assert.assertEquals(title, ex_title);
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*@Given("User is on login page")
public void user_is_on_login_page() {
    
}

@When("User enters valid username and password")
public void user_enters_valid_username_and_password() {
   
}

@And("Clicks on Login Button")
public void clicks_on_login_button() {
    
}

@Then("User is navigated to Hpme Page")
public void user_is_navigated_to_hpme_page() {
    
}

@And("Close the browser")
public void close_the_browser() {
    
}*/



}
