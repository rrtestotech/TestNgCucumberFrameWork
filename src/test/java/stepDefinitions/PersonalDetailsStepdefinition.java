package stepDefinitions;


import org.junit.Assert;

import com.pages.ViewMyDetailsPage;
import com.qa.factory.DriverFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PersonalDetailsStepdefinition {

	private ViewMyDetailsPage viewMyDetailsPage = new ViewMyDetailsPage(DriverFactory.getDriver());

	
	@When("user click on myinfo tab")
	public void clickOnMyInfo() {
		viewMyDetailsPage.clickOnMyInfoTab();

	}

	@Then("user should able to see personal details")
	public void personalDetailsPage() {

		Assert.assertTrue(viewMyDetailsPage.isPersonalDetailsDisplayed());
	}

	@And("user click on edit button")
	public void clickOnEditBtn() {
		viewMyDetailsPage.clickOnEditButton();

	}

	@When("user modifies full name as {string} {string} {string}")
	public void enterFullName(String fname, String mname, String lname) {

		viewMyDetailsPage.editFullName(fname, mname, lname);

	}
	
	@And("user modifies personaldetails as {string} {string} {string} {string}")
	public void modifyPersonalDetails(String expDate,String gen,String status,String nationality) {
		viewMyDetailsPage.editPersonalDetails(expDate,gen,status,nationality);
		
	}
	@When("user click on save button")
	public void clickOnSaveBtn() {

		viewMyDetailsPage.clickOnEditButton();

	}
	
	@Then("user should able to see message as {string}")
	public void successfulMessage() throws InterruptedException {

		Assert.assertTrue(viewMyDetailsPage.saveMsgDisplayed());
	}

}
