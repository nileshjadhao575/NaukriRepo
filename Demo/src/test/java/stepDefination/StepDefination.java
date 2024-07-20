package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class StepDefination {
	
	public WebDriver driver;
	public LoginPage obj;
	
	
	

	@Given("user login the application")
	public void user_login_the_application() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
		
		
		
	}

	@When("user enter {string} and {string}")
	public void user_enter_username_and_password(String UserId , String pass ) {
		
		obj = new LoginPage(driver);
	
		obj.enterUserNmae(UserId , pass);
		
		
	}

	@Then("user click login button")
	public void user_click_login_button() {
		
		obj.lofINBT();
		
	}

	@Then("close the browser")
	public void close_the_browser() {
		
		driver.close();
		
	}

}
