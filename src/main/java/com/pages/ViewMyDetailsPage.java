package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BrowserActionsUtil;

public class ViewMyDetailsPage extends BrowserActionsUtil {
	public WebDriver driver;

	public ViewMyDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_pim_viewMyDetails")
	private WebElement myInfoTab;

	@FindBy(id = "btnSave")
	private WebElement saveOrEditBtn;

	@FindBy(id = "personal_txtEmpFirstName")
	private WebElement firstNameTxt;

	@FindBy(id = "personal_txtEmpMiddleName")
	private WebElement middleNameTxt;

	@FindBy(id = "personal_txtEmpLastName")
	private WebElement lastNameTxt;

	@FindBy(id = "personal_txtLicExpDate")
	private WebElement licenseExpiryDateSTxt;

	@FindBy(id = "personal_optGender_1")
	private WebElement maleRdBtn;

	@FindBy(id = "personal_optGender_2")
	private WebElement femaleRdBtn;

	@FindBy(id = "personal_cmbMarital")
	private WebElement martialStatusDrpDwn;

	@FindBy(id = "personal_cmbNation")
	private WebElement nationalityDrpDwn;

	@FindBy(xpath = "//h1[text()='Personal Details']")
	private WebElement personalDetailsLbl;
	
	
	@FindBy(xpath = "//*[contains(text(),'Successfully Saved')]")
	private WebElement saveMsgLbl;
	
	
	public void clickOnMyInfoTab() {
		click(myInfoTab);

	}

	public void clickOnEditButton() {
		click(saveOrEditBtn);

	}

	public void editFullName(String fName, String mName, String lName) {
		type(firstNameTxt, fName);
		type(middleNameTxt, mName);
		type(lastNameTxt, lName);

	}

	public void editPersonalDetails(String expiryDate, String gender, String martailStatus, String nationality) {

		type(licenseExpiryDateSTxt, expiryDate);
		if (gender.equals("female")) {
			click(femaleRdBtn);
		} else {
			click(maleRdBtn);
		}

		selectByVisibleText(martialStatusDrpDwn, martailStatus);
		selectByVisibleText(nationalityDrpDwn, nationality);

	}

	public boolean isPersonalDetailsDisplayed() {
		return personalDetailsLbl.isDisplayed();

	}
	public boolean saveMsgDisplayed() throws InterruptedException {
		boolean isVisible=false;
		int cnt=0;
		while(cnt<10) {
			try {
				cnt++;
				isVisible=saveMsgLbl.isDisplayed();
			}catch (Exception e) {
				// TODO: handle exception
			}
			if(isVisible) {
				break;
			}else {
				Thread.sleep(200);
			}
		}
		return isVisible;

	}
	
	

}
