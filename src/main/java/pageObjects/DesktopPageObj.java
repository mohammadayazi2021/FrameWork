package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObj extends Base {

	public DesktopPageObj() {
		// we will use initElements method of PageFactory class to initialize the
		// Webelements of UI
		PageFactory.initElements(driver, this);

	}

	// First Scenario (User verify all items are present in desktop tab) Xpath
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktop;

	// First Scenario (User verify all items are present in desktop tab) Methods
	public void clickOnDesktop() {
		WebDriverUtility.clickOnElement(desktopTab);
	}

	public void clickOnShowAllDesktop() {
		WebDriverUtility.clickOnElement(showAllDesktop);
	}

	// Second Scenario (User add HP LP 3065 from desktop tab to the cart) xpath
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hpLP3065;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplay;

	// Second Scenario (User add HP LP 3065 from desktop tab to the cart) Methods
	public void clickOnHpLp3065() {
		WebDriverUtility.clickOnElement(hpLP3065);
	}

	public void clickOnAddToCartBtn() {
		WebDriverUtility.clickOnElement(addToCartBtn);
	}

	public boolean messageDisplayed() {
		boolean messageDisplayed = messageDisplay.isDisplayed();
		return messageDisplayed;
	}

	// Third Scenario (User add Canon EOS 5D from Desktops tab to the cart) Xpath
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement addToCart;

	@FindBy(xpath = "//select[@id='input-option226']//option[contains(text(),'Red')]")
	private WebElement selectColor;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantity1;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplaySuccess;

	// Third Scenario (User add Canon EOS 5D from Desktop tab to the cart) Methods
	public void clickOnAddToCart() {
		WebDriverUtility.clickOnElement(addToCart);
	}

	public void clickOnSelectColor() {
		WebDriverUtility.clickOnElement(selectColor);
	}

	public void clickOnSelectQuantity1() {
		WebDriverUtility.clickOnElement(selectQuantity1);
	}

	public void clockOnAddToCartButton() {
		WebDriverUtility.clickOnElement(addToCartButton);
	}	

	public boolean messageDisplaySuccess() {
		boolean messageDisplayed = messageDisplaySuccess.isDisplayed();
		return messageDisplayed;
	}

	// Fourth Scenario (User add a review to Canon EOS 5D items in Desktop tab) Xpath
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement Canon;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement ReviewLink;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement enterName;

	@FindBy(css = "#input-review")
	private WebElement enterReview;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[3]")
	private WebElement BadOrGood;

	@FindBy(css = "#button-review")
	private WebElement Continue;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement reviewMessage;

	// Fourth Scenario (User add a review to Canon EOS 5D items in Desktop tab)
	// Methods

	public void clickOnCanon() {
		WebDriverUtility.clickOnElement(Canon);
	}

	public void clickOnReviewLink() {
		WebDriverUtility.clickOnElement(ReviewLink);
	}

	public void enterName(String name) {
		enterName.sendKeys(name);
	}

	public void enterReview(String review) {
		enterReview.sendKeys(review);
	}

	public void clickOnBadOrGood() {
		WebDriverUtility.clickOnElement(BadOrGood);
	}

	public void clikOnContinue() {
		WebDriverUtility.clickOnElement(Continue);
	}

	public boolean reviewMessage() {
		boolean reviewMessageDisplayed = reviewMessage.isDisplayed();
		return reviewMessageDisplayed;
	}
}