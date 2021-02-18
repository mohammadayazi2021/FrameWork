package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Laptops_NoteBooksPageObj extends Base {
	
	public Laptops_NoteBooksPageObj() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	// Laptops & Notebooks
		@FindBy(linkText = "Laptops & Notebooks")
		private WebElement LaptopsNotebooks;

		@FindBy(linkText = "Macs")
		private WebElement Macs;

		@FindBy(linkText = "Windows")
		private WebElement Windows;

		@FindBy(xpath = "//li/class='dropdown open']")
		private WebElement Desktop;
}
