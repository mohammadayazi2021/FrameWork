package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class ExistingAccountObj extends Base {
	
	public ExistingAccountObj() {
		
		PageFactory.initElements(driver, this);
	}
	
	    // Scenario #9: Have existing Account Xpath
		@FindBy(xpath = "//span[contains(text(),'My Account')]")
		private WebElement myAccount;

		@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
		private WebElement Login;

		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement inputEmail;

		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement inputPassword;

		@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
		private WebElement LoginBtn;
		// Scenario #9: Have existing Account Method
		public void clickOnMyAccount() {
			WebDriverUtility.clickOnElement(myAccount);
		}

		public void clickOnLogin() {
			WebDriverUtility.clickOnElement(Login);
		}

		public void enterEmail() {
			WebDriverUtility.enterValue(inputEmail, "irfan@gmail.com");

		}

		public void enterPassword() {
			WebDriverUtility.enterValue(inputPassword, "irfan123");
		}

		public void clickOnLoginBtn() {
			WebDriverUtility.clickOnElement(LoginBtn);
		}

		// Scenario #10: Register as an Affiliate user with Cheque Payment Xpath
		@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
		private WebElement RegisterForAnAffiliateAccount;

		@FindBy(xpath = "//input[@id='input-company']")
		private WebElement companyField;

		@FindBy(xpath = " //input[@id='input-website']")
		private WebElement websiteField;

		@FindBy(xpath = "//input[@id='input-tax']")
		private WebElement taxIDField;

		@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[1]")
		private WebElement paymentMethodField;

		@FindBy(xpath = "//input[@id='input-cheque']")
		private WebElement ChequePayeeNameField;

		@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
		private WebElement AboutUsCheckBox;

		@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
		private WebElement ContinueBtn;

		@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
		private WebElement SuccessMessage;

		// Scenario #10: Register as an Affiliate user with Cheque Payment Method
		public void RegisterForAnAffiliateAccount() {
			WebDriverUtility.clickOnElement(RegisterForAnAffiliateAccount);
		}

		public void enterValueToCompany(String value) {
			WebDriverUtility.enterValue(companyField, value);
		}

		public void enterValueToWebsite(String value) {
			WebDriverUtility.enterValue(websiteField, value);
		}

		public void enterValueToTaxID(String taxID) {
			WebDriverUtility.enterValue(taxIDField, taxID);
		}

		public void enterPaymentMethod(String PaymentMethod) {
			WebDriverUtility.enterValue(paymentMethodField, PaymentMethod);
		}

		public void enterChequePayeeName(String chequePayeeName) {
			WebDriverUtility.enterValue(ChequePayeeNameField, chequePayeeName);
		}

		public void AboutUsCheckBox() {
			WebDriverUtility.clickOnElement(AboutUsCheckBox);
		}

		public void ContinueBtn() {
			WebDriverUtility.clickOnElement(ContinueBtn);
		}

		public boolean SuccessMessage() {

			boolean successMessage = SuccessMessage.isDisplayed();
			return successMessage;
		}

		// Scenario #11: Edit your affiliate information from Cheque payment method to Bank Transfer Xpath

		@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
		private WebElement EditYourAffiliateInformation;

		@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]")
		private WebElement BankTransferBtn;

		@FindBy(xpath = "//input[@id='input-bank-name']")
		private WebElement BankName;

		@FindBy(xpath = "//input[@id='input-bank-branch-number']")
		private WebElement AbaNumber;

		@FindBy(xpath = "//input[@id='input-bank-swift-code']")
		private WebElement SwiftCode;

		@FindBy(xpath = "//input[@id='input-bank-account-name']")
		private WebElement AccountName;

		@FindBy(xpath = "//input[@id='input-bank-account-number']")
		private WebElement AccountNumber;

		@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
		private WebElement ContinueButton;

		@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
		private WebElement UserShouldSeeSuccessMessage;
		
		// Scenario #11: Edit your affiliate information from Cheque payment method to Bank Transfer Method 
		public void EditYourAffiliateInformation() {
			WebDriverUtility.clickOnElement(EditYourAffiliateInformation);
		}

		public void BankTransferBtn() {
			WebDriverUtility.clickOnElement(BankTransferBtn);
			
		}

		public void enterValueToBankName(String value) {
			WebDriverUtility.enterValue(BankName, value);
		}

		public void enterValueToAbaNumber(String value) {
			WebDriverUtility.enterValue(AbaNumber, value);
		}

		public void enterValueToSwiftCode(String value) {
			WebDriverUtility.enterValue(SwiftCode, value);
		}

		public void enterValueToAccountName(String value) {
			WebDriverUtility.enterValue(AccountName, value);
		}

		public void enterValueToAccountNumber(String value) {
			WebDriverUtility.enterValue(AccountNumber, value);
		}

		public void BaContinueButton() {
			WebDriverUtility.clickOnElement(ContinueButton);
		}

		public boolean UserShouldSeeSuccessMessage() {

			boolean userShouldSeeSuccessMessage = UserShouldSeeSuccessMessage.isDisplayed();
			return userShouldSeeSuccessMessage;
		}

		// Scenario #12: Edit your account Information Xpath

		@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
		private WebElement EditYourAccountInformation;

		@FindBy(xpath = "//input[@id='input-firstname']")
		private WebElement FirstName;

		@FindBy(xpath = "//input[@id='input-lastname']")
		private WebElement LastName;

		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement InputEmail;

		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement TelephoneNumber;

		@FindBy(xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
		private WebElement Continue;

		@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
		private WebElement YourAccountHasBeenSuccessfullyUpdated;
		
		// Scenario #12: Edit your account Information Methods
		public void EditYourAccountInformation() {
			WebDriverUtility.clickOnElement(EditYourAccountInformation);
		}

		public void enterValueToFirstName(String value) {
			WebDriverUtility.enterValue(FirstName, value);
		}

		public void enterValueToLastName(String value) {
			WebDriverUtility.enterValue(LastName, value);
		}

		public void enterValueToInputEmail(String value) {
			WebDriverUtility.enterValue(InputEmail, value);
		}

		public void enterValueToTelephoneNumber(String value) {
			WebDriverUtility.enterValue(TelephoneNumber, value);
		}

		public void Continue() {
			WebDriverUtility.clickOnElement(Continue);
		}

		public boolean YourAccountHasBeenSuccessfullyUpdated() {

			boolean yourAccountHasBeenSuccessfullyUpdated = YourAccountHasBeenSuccessfullyUpdated.isDisplayed();
			return yourAccountHasBeenSuccessfullyUpdated;
		}

	}
