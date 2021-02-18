package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObj extends Base {
	
	public TabletsPageObj() {
		
		PageFactory.initElements(driver, this);
	}

	
	// Tablets
	@FindBy(linkText = "Tablets")
	private WebElement Tablets;






	
}
