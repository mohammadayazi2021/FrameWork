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

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktop;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktop;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartOption;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement addQuantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageDisplayed;
	
	// Second Scenario Canon Camera 
	
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement addToCartCanon;
	
	@FindBy(xpath = "//option[contains(text(),'Blue')]")
	private WebElement selectColor;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement addCanonQuantity;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCanonCartButton;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement messageCanonEOS5D;
	
	
	
	// We start writing public methods to access each element with respected actions
	// to them.

	public void clickOnDesktop() {
		WebDriverUtility.clickOnElement(desktop);
	}

	public void clickOnShowAllDesktop() {
		WebDriverUtility.clickOnElement(showAllDesktop);
	}

	public void clickAddToCart() {
		WebDriverUtility.clickOnElement(addToCartOption);
	
	}

	public void clickOnAddQuantity() {
		WebDriverUtility.clearText(addQuantity);
		WebDriverUtility.clickOnElement(addQuantity);
		
	}
	public void enterQuantity (String quantity) {
		WebDriverUtility.enterValue(addQuantity, quantity);
	}
	public void clickOnAddToCartButton() {
		
		WebDriverUtility.clickOnElement(addToCartButton);
	}

	public boolean messageDisplayed() {
		boolean successMessage = messageDisplayed.isDisplayed();
		return successMessage;
	}

	// Second Methods for Canon
	public void addToCartCanon() {
		 addToCartCanon.click();
	}

	public void selectColor() {
		selectColor.click();
	}

	public void addCanonQuantity() {
		addCanonQuantity.click();
	}

	public void addToCanonCartButton() {
		addToCanonCartButton.click();
	}

	public boolean messageCanonEOS5D() {
		boolean successMessage = messageCanonEOS5D.isDisplayed();
		return successMessage;

	}

}