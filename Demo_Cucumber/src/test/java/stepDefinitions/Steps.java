package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;

	public LoginPage login;

	@Given("User open URL {string}")
	public void user_open_URL(String url) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + ".\\Demo_Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		login = new LoginPage(driver);

		driver.get(url);

	}

	@Given("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {

		login.clickSignin();
	}

	@Given("User clicks on accept button")
	public void user_clicks_on_accept_button() {

		login.acceptlogin();
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String password) {

		login.setUserName(userName);
		login.setPassword(password);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {

		login.clickSubmitt();
	}

	@Then("User gets error message as {string}")
	public void user_gets_error_message_as(String errorMessage) {

		if (driver.getPageSource().contains("resetting your password")) {
			driver.close();
			Assert.assertTrue(false);

		} else {
			Assert.assertEquals(errorMessage, login.verifyMessage(errorMessage));
		}

	}

}
