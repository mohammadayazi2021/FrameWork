package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Phomnes_PDAsPageObj extends Base {

		public Phomnes_PDAsPageObj() {
			
			PageFactory.initElements(driver, this);
		}
		
		// Phones & PDAs
		@FindBy(linkText = "Phones & PDAs")
		private WebElement PhonesPDAs;
}
