package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefination {
	
	public WebDriver driver;

	@Given("user login the application")
	public void user_login_the_application() {
		
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
	}

	@When("user enter userid")
	public void user_enter_userid() {
		driver.findElement(By.id("email")).sendKeys("nnnnnnn@gmail.com");
		
	}

	@When("user enter password")
	public void user_enter_password() {

		driver.findElement(By.id("pass")).sendKeys("12345");
	}

	@Then("user click login button")
	public void user_click_login_button() {

		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
