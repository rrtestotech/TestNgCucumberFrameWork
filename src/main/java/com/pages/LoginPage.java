package com.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BrowserActionsUtil;

public class LoginPage extends BrowserActionsUtil {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUsername")
	private WebElement usernameTxt;
	@FindBy(id = "btnLogin")
	private WebElement loginBtn;
	@FindBy(id = "txtPassword")
	private WebElement passwordPwd;

	public String getLoginPageTitle() {

		return driver.getTitle();

	}

	public void enterUserName(String username) throws IOException {
		type(usernameTxt, username);

	}

	public void enterPassword(String pwd) {
		type(passwordPwd, pwd);

	}

	public void clickOnLogin() {
		click(loginBtn);
	}

	public HomePage doLogin(String username, String pwd) {
		System.out.println("login with: " + username + " and " + pwd);
		type(usernameTxt, username);
		type(passwordPwd, pwd);
		click(loginBtn);
		return new HomePage(driver);
	}
}
