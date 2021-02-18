package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CamerasPageObj extends Base {
	
	public CamerasPageObj() {
		
		PageFactory.initElements(driver, this);
	}

	// Cameras
	@FindBy(linkText = "Cameras")
	private WebElement Cameras;

	@FindBy(linkText = "Canon")
	private WebElement Canon;

	@FindBy(linkText = "Nikon")
	private WebElement Nikon;
}
