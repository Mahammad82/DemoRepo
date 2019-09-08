package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signin-button")
	WebElement signIn;

	@FindBy(id = "login-accept")
	WebElement loginAccept;

	@FindBy(id = "user_email")
	WebElement userName;

	@FindBy(id = "user_password")
	WebElement password;

	@FindBy(css = "input[name='commit']")
	WebElement submit;
	
	@FindBy(xpath = "//a[contains(text(), 'resetting your password')]")
	WebElement verifyErrorMessage;

	public void clickSignin() {
		signIn.click();
	}

	public void acceptlogin() {
		loginAccept.click();
	}

	public void setUserName(String uName) {
		userName.clear();
		userName.sendKeys(uName);
	}

	public void setPassword(String passw) {
		password.clear();
		password.sendKeys(passw);
	}

	public void clickSubmitt() {
		submit.click();
	}
	
	public String verifyMessage(String errorMessage) {
		return verifyErrorMessage.getText();
	}
}
