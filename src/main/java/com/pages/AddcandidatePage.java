package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BrowserActionsUtil;

public class AddcandidatePage extends BrowserActionsUtil {

	private WebDriver driver;

	public AddcandidatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "addCandidate_firstName")
	private WebElement firstNameTxt;

	@FindBy(id = "addCandidate_lastName")
	private WebElement lastNameTxt;

	@FindBy(id = "btnSave")
	private WebElement saveBtn;

	@FindBy(id = "addCandidate_email")
	private WebElement emailTxt;

	public void Addcandidate(WebDriver driver) {
		this.driver = driver;
	}

	public String getaddcandiatePageTitle() {
		return driver.getTitle();

	}

	public void fillContactUsForm(String frstname, String lstname, String emailid) {
		type(firstNameTxt, frstname);
		type(lastNameTxt, lstname);
		type(emailTxt, emailid);

	}

	public void clickonSavebutton() {
		click(saveBtn);
	}

}
