package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class LaptopNoteBookPageObj extends Base {

	public LaptopNoteBookPageObj() {

		PageFactory.initElements(driver, this);
	}	
	
	// Scenario 5 Add and Remove a MacBook from Cart Xpaths
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement laptoptab;

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptop;

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
	private WebElement clickMacbook;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement addMacBookToCart;

	@FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
	private WebElement messageDisplay;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartItems;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
	private WebElement RedX;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement zeroItemsInCart;
	// Scenario 5 Add and Remove a MacBook from Cart Methods

	public void clickOnLaptopTab() {
		WebDriverUtility.clickOnElement(laptoptab);
	}

	public void clickOnShowAllLaptop() {
		WebDriverUtility.clickOnElement(showAllLaptop);
	}

	public void clickOnClickMacbook() {
		WebDriverUtility.clickOnElement(clickMacbook);
	}

	public void clickOnAddMacBookToCart() {
		WebDriverUtility.clickOnElement(addMacBookToCart);
	}

	public boolean messageDisplayed() {
		boolean messageDisplayed = messageDisplay.isDisplayed();
		return messageDisplayed;
	}

	public void clickOnCartItems() {
		WebDriverUtility.clickOnElement(cartItems);
	}

	public void clickOnRedX() {
		WebDriverUtility.clickOnElement(RedX);
	}

	public void clickOnZeroItemsInCart() {
		WebDriverUtility.clickOnElement(zeroItemsInCart);
	}

	// Scenario 6 Product Comparison Xpath
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement compareMac;

	@FindBy(css = "div.container:nth-child(4) div.row div.col-sm-9 div.row:nth-child(7) div.product-layout.product-grid.col-lg-4.col-md-4.col-sm-6.col-xs-12:nth-child(3) div.product-thumb div:nth-child(2) div.button-group > button:nth-child(3)")
	private WebElement compareMacAir;

	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement compareLink;

	@FindBy(css = "body:nth-child(2) div.container:nth-child(4) div.row div.col-sm-12 > h1:nth-child(1)")
	private WebElement seeComparison;

	// Scenario 6 Product Comparison Methods
	public void clickOnCompareMac() {
		WebDriverUtility.clickOnElement(compareMac);
	}

	public void clickOnCompareMacAir() {
		WebDriverUtility.clickOnElement(compareMacAir);
	}

	public void clickOnCompareLink() {
		WebDriverUtility.clickOnElement(compareLink);
	}

	public boolean SeeComparison() {
		boolean SeeComparison = seeComparison.isDisplayed();
		return SeeComparison;
	}

	// Scenario 7 Add in Item to wish List Xpath
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement lapTopsNoteBooks;

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptopsNoteBooks;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToWishList;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement wishListMessage;

	// Scenario 7 Add in Item to wish ListMethods

	public void clickOnLaptopsNoteBooks() {
		WebDriverUtility.clickOnElement(lapTopsNoteBooks);
	}

	public void clickOnShowAllLaptopsNoteBooks() {
		WebDriverUtility.clickOnElement(showAllLaptopsNoteBooks);
		WebDriverUtility.screenShot();
	}

	public void clickOnAddToWishList() {
		WebDriverUtility.clickOnElement(addToWishList);
	}

	public boolean wishListMessage() {
		boolean successMessage = wishListMessage.isDisplayed();
		return successMessage;
	}
	// Validate the price of MacBook Pro in 2000 xpath

	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookPro;

	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement macBookPrice;

	// Validate the price of MacBook Pro in 2000 Methods

	public void clickOnMacBookPro() {
		WebDriverUtility.clickOnElement(macBookPro);
		WebDriverUtility.screenShot();
	}

	public boolean macBookPrice() {
		boolean priceTag = macBookPrice.isDisplayed();
		return priceTag;
	}
}
