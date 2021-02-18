package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObj extends Base {
	
	public ComponentsPageObj() {
		
		PageFactory.initElements(driver, this);
		
	}

	// Components
		@FindBy(linkText = "Components")
		private WebElement Components;

		@FindBy(linkText = "Mice and Trackballs")
		private WebElement MiceAndTrackballs;

		@FindBy(linkText = "Monitors")
		private WebElement Monitors;

		@FindBy(linkText = "Printers")
		private WebElement Printers;

		@FindBy(linkText = "Scanners")
		private WebElement Scanners;

		@FindBy(linkText = "Web Cameras")
		private WebElement WebCameras;
	
}
