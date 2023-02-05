package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumHelper;

public class AccessoriesPage {
	@FindBy(xpath="xpath of Paisley Printed Tie")WebElement printedtie;
	WebDriver dr;
	public AccessoriesPage(WebDriver dr) {
		this .dr= dr;
		PageFactory.initElements(dr, this);
}
	
	public ProductdetailsPage ClickOnPaisleyPrintedTie() {
		SeleniumHelper.ClickOnElement(printedtie);
		return  new ProductdetailsPage(dr);
		
	}
}