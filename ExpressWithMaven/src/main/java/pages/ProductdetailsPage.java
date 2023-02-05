package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumHelper;

public class ProductdetailsPage {
	
public 	WebDriver dr;
@FindBy(xpath="//div[@id=\"content\"]/div/div/section/section[1]/section/div[5]/div/div[2]/a/span[1]/span[2]")WebElement colour;
@FindBy(xpath="xpath of waist 31")WebElement waistsize;
@FindBy(xpath="xpath of langth")WebElement langth;
@FindBy(xpath="xpath of addtoCart")WebElement cart;

	public	ProductdetailsPage(WebDriver dr) {
		this.dr= dr;
		PageFactory.initElements(dr, this);
	}
	
	public void ClickOnColourBox() {
		SeleniumHelper.ClickOnElement(colour);
		
		
	}
public void ClickOnWaistBox() {
	SeleniumHelper.ClickOnElement(waistsize);
	
}
public void ClickOnBox() {
	SeleniumHelper.ClickOnElement(langth);
	
}
public void ClickOnAddtoCart() {
	SeleniumHelper.ClickOnElement(cart);
}
public void veryfiytitleOFCart() {
	
}
}
