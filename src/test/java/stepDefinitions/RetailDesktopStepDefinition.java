package stepDefinitions;



import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;


public class RetailDesktopStepDefinition extends Base {
	
	DesktopPageObj desktoppageobj = new DesktopPageObj();

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
		desktoppageobj.clickOnDesktop();
		WebDriverUtility.screenShot();
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		desktoppageobj.clickOnShowAllDesktop();
		WebDriverUtility.screenShot();
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {

	}

	@When("^User click ADD TO CARToption on ‘HP LP(\\d+)’item$")
	public void user_click_ADD_TO_CARToption_on_HP_LP_item(int arg1) throws Throwable {
	   desktoppageobj.clickAddToCart();
		WebDriverUtility.screenShot();
	}

	@When("^User select quantity (.+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		desktoppageobj.enterQuantity("5");
		WebDriverUtility.screenShot();
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desktoppageobj.clickOnAddToCartButton();
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1)
			throws Throwable {

		WebDriverUtility.screenShot();
	}

	// Second 
	
	@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		desktoppageobj.addToCartCanon();
		WebDriverUtility.screenShot();
	}

	@When("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		desktoppageobj.selectColor();
		WebDriverUtility.screenShot();
	}
	@When("^User select Canon quantity (\\d+)$")
	public void user_select_Canon_quantity(int arg1) throws Throwable {
		desktoppageobj.addCanonQuantity();
		WebDriverUtility.screenShot();
	}

	@When("^User click add to Canon Cart button$")
	public void user_click_add_to_Canon_Cart_button() throws Throwable {
		desktoppageobj.addToCanonCartButton();
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
		desktoppageobj.messageCanonEOS5D();
		WebDriverUtility.screenShot();
	}

}
