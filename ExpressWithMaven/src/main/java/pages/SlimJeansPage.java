package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumHelper;

public class SlimJeansPage {
	public WebDriver dr;
	
	@FindBy(xpath="//div[@class='XCxXZ']/div[2]/div[2]/a[1]")WebElement darkwashjeans;
	
	public SlimJeansPage(WebDriver dr) {
		this .dr= dr;
		PageFactory.initElements(dr, this);//why?/
		
	}

	public ProductdetailsPage ClickOnDarkWashjeans() {
		SeleniumHelper.ClickOnElement(darkwashjeans);
		return new ProductdetailsPage(dr);//why through argument toinput dr??
		
		
	}

}
