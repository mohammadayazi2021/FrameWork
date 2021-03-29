package stepDefinitions;

import java.util.List;
import java.util.Map;
import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ExistingAccountObj;
import utilities.WebDriverUtility;

public class ExistingAccountStepDefinition extends Base {

	ExistingAccountObj existingAccountObj = new ExistingAccountObj();
	
	// Scenario #9: Have existing Account
	@Given("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		existingAccountObj.clickOnMyAccount();
		logger.info("User click on MyAccount");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@When("^User clicked on Login$")
	public void user_clicked_on_Login() throws Throwable {
		existingAccountObj.clickOnLogin();
		logger.info("User clicked on Login");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@When("^User enter on emailaddress 'irfan@gmail.com' and password 'irfan123'$")
	public void user_enter_on_emailaddress_irfan_gmail_com_and_password_irfan() throws Throwable {
		existingAccountObj.enterEmail();
		existingAccountObj.enterPassword();
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@When("^User click on Login Btn$")
	public void user_click_on_Login_Btn() throws Throwable {
		existingAccountObj.clickOnLoginBtn();
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();

	}
	// Scenario #10: Register as an Affiliate user with Cheque Payment Method

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
		existingAccountObj.RegisterForAnAffiliateAccount();
		logger.info("User click on ‘Register for an Affiliate Account");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable YourAffiliateInformation) throws Throwable {
		List<Map<String, String>> dataValues = YourAffiliateInformation.asMaps(String.class, String.class);
		existingAccountObj.enterValueToCompany(dataValues.get(0).get("Company"));
		existingAccountObj.enterValueToWebsite(dataValues.get(0).get("Website"));
		existingAccountObj.enterValueToTaxID(dataValues.get(0).get("TaxID"));
		existingAccountObj.enterChequePayeeName(dataValues.get(0).get("Cheque Payee Name"));

		logger.info("User fill affiliate form with below information");
		WebDriverUtility.screenShot();

	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
		existingAccountObj.AboutUsCheckBox();
		logger.info("User Check On About Us Check Box");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		existingAccountObj.SuccessMessage();
		logger.info("User should see a success message");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();

	}

	@When("^User click on ‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		existingAccountObj.EditYourAffiliateInformation();
		logger.info("click on Edit your affiliate informationlink");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		existingAccountObj.BankTransferBtn();
		logger.info("click on Bank Transfer radio button");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	// Scenario #11: Edit your affiliate information from Cheque payment method to Bank Transfer
	
	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable EditYourAffiliateInformation)
			throws Throwable {
		List<Map<String, String>> dataValues = EditYourAffiliateInformation.asMaps(String.class, String.class);
		existingAccountObj.enterValueToBankName(dataValues.get(0).get("BankName"));
		existingAccountObj.enterValueToAbaNumber(dataValues.get(0).get("AbaNumber"));
		existingAccountObj.enterValueToSwiftCode(dataValues.get(0).get("SwiftCode"));
		existingAccountObj.enterValueToAccountName(dataValues.get(0).get("AccountName"));
		existingAccountObj.enterValueToAccountNumber(dataValues.get(0).get("AccountNumber"));
		
		

		logger.info("User fill Bank information with below information");
		WebDriverUtility.screenShot();
		
	}

	// Scenario #12: Edit your account Information

	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		existingAccountObj.EditYourAccountInformation();
		logger.info("Edit your account information");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}
	
	@When("^User modify below information$")
	public void user_modify_below_information(DataTable UserModifyBelowInformation) throws Throwable {
		List<Map<String, String>> dataValues = UserModifyBelowInformation.asMaps(String.class, String.class);
		existingAccountObj.enterValueToFirstName(dataValues.get(0).get("FirstName"));
		existingAccountObj.enterValueToLastName(dataValues.get(0).get("LastName"));
		existingAccountObj.enterValueToInputEmail(dataValues.get(0).get("InputEmail"));
		existingAccountObj.enterValueToTelephoneNumber(dataValues.get(0).get("TelephoneNumber"));

		logger.info("User modify below information");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		existingAccountObj.Continue();
		logger.info("click on continue button");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {
		existingAccountObj.YourAccountHasBeenSuccessfullyUpdated();
		logger.info("Success: Your account has been successfully updated");
		WebDriverUtility.wait(2500);
		WebDriverUtility.screenShot();
	}
}