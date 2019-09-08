package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.util.Base;

public class LoginPage extends Base {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "signin-button")
	public WebElement signIn;

	@FindBy(id = "login-accept")
	public WebElement loginAccept;

	@FindBy(id = "user_email")
	public WebElement userName;

	@FindBy(id = "user_password")
	public WebElement password;
	
	@FindBy (css = "input[name='commit']")
	public WebElement submit;

}
