package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {

	// Once we create Page Obj we need to extends the Base class to use Parent Class
	// properties such is Webdriver driver
	// we create a constructor and inside the constructor we define the
	// PageFactory.initElements
	// method to initialize the WebElements in this page.

	public RetailPageObj() {

		PageFactory.initElements(driver, this);
	}

	// we need to store UI Webelements in a private webElement using @FindBy
	// annotations of
	// PageFactory class.

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;

	// we need to create public methods to perform required actions on each elements
	// we stored.

	public void enterValueToSearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
	}

	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}

	public boolean iPhoneImageIsDisplayed() {

		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;

	}
}
