package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LaptopNoteBookPageObj;
import utilities.WebDriverUtility;

public class LaptopNoteBookStepDefinition extends Base {

	LaptopNoteBookPageObj laptopNoteBookObj = new LaptopNoteBookPageObj();
		
	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
		laptopNoteBookObj.clickOnMacBookPro();
		WebDriverUtility.wait(2500);
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
		laptopNoteBookObj.messageDisplayed();
		WebDriverUtility.wait(2500);
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		laptopNoteBookObj.clickOnCartItems();
		WebDriverUtility.wait(2500);
	}

	@Then("^User click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
		laptopNoteBookObj.clickOnRedX();
		WebDriverUtility.wait(2000);
	}

	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cart_should_show_item_s(int arg1) throws Throwable {
		laptopNoteBookObj.clickOnZeroItemsInCart();
		WebDriverUtility.wait(2500);
	}


	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
		laptopNoteBookObj.clickOnCompareMac();
		WebDriverUtility.wait(2500);
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws Throwable {
		laptopNoteBookObj.clickOnCompareMacAir();
		WebDriverUtility.wait(2500);
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
		laptopNoteBookObj.clickOnCompareLink();
		WebDriverUtility.wait(2500);
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
		laptopNoteBookObj.SeeComparison();
		WebDriverUtility.wait(2500);
	}

	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {
		laptopNoteBookObj.clickOnLaptopsNoteBooks();
		WebDriverUtility.wait(2500);
	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
		laptopNoteBookObj.clickOnShowAllLaptopsNoteBooks();
		WebDriverUtility.wait(2500);
	}

	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
		laptopNoteBookObj.clickOnAddToWishList();
		WebDriverUtility.wait(2500);

	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list()
			throws Throwable {
		laptopNoteBookObj.wishListMessage();
		WebDriverUtility.wait(2500);

	}

	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		laptopNoteBookObj.clickOnMacBookPro();
		WebDriverUtility.wait(2500);
	}

	@Then("^User should see ‘\\$(\\d+),(\\d+)\\.(\\d+)’ price tag is present on UI\\.Retail Page$")
	public void user_should_see_$_price_tag_is_present_on_UI_Retail_Page(int arg1, int arg2, int arg3)
			throws Throwable {
		laptopNoteBookObj.macBookPrice();

	}

}
