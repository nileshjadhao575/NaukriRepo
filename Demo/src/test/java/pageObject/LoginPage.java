package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	

	public LoginPage(WebDriver driver) {


		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(id = "email")
	WebElement userName;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	WebElement logInbt;

	public void enterUserNmae(String UserNmae , String Password) {

		userName.sendKeys(UserNmae);
		password.sendKeys(Password);
	}

	public void lofINBT() {
		logInbt.click();
	}
}
