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
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("user enter userid")
	public void user_enter_userid() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
	  
	}

	@When("user enter password")
	public void user_enter_password() throws InterruptedException {
		
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	   Thread.sleep(3000);
	}

	@Then("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	    
	}



}
