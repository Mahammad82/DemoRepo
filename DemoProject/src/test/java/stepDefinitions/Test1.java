package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.pages.LoginPage;
import com.demo.util.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 extends Base {

	LoginPage login = new LoginPage();

	@Test
	@Given("^User is on home page$")
	public void user_is_on_home_page() {

		driver.get("https://beta.sam.gov/");

		login.signIn.click();
		login.loginAccept.click();
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password() {

		login.userName.sendKeys("demo@demo.com");
		login.password.sendKeys("123456789");
	}

	@When("^User click on submit button$")
	public void user_click_on_submit_button() {

		login.submit.click();
	}

	@Then("^User lanchs on login page$")
	public void user_lanchs_on_login_page() {

		String actualResult = driver.findElement(By.xpath("//a[contains(text(), 'resetting your password')]"))
				.getText();
		System.out.println(actualResult);
		String expectedResult = "resetting your password";
		assertEquals(expectedResult, actualResult);

		driver.quit();
	}

}
