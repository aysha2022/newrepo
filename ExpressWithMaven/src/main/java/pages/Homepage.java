package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.SeleniumHelper;

public class Homepage {
	WebDriver dr;
	
	@FindBy(xpath="//div[@id='raven-header-mega-menu']/nav/ol/li[3]/a") WebElement jeans;
	@FindBy(xpath="//div[@id='raven-header-mega-menu']/nav/ol/li[4]/a")WebElement newMenu;
	@FindBy(xpath="//div[@id='root-Jeans']/ol[2]/li/ol/li[2]/a")WebElement slimjeans;
	@FindBy(xpath="//div[@id='root-New']/ol[2]/li/ol/li[5]/a")WebElement newaccessories;
	public Homepage(WebDriver dr) {
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	public void hoborOverOnJeans() {
		SeleniumHelper.hoborOverOnElement(dr, jeans);
		
		
	}
	public SlimJeansPage ClickOnSlimJeansSubCategory() {
		SeleniumHelper.ClickOnElement(slimjeans);
		return new SlimJeansPage(dr);
	}
public void  hoborOverOnNewmenu() {
	SeleniumHelper.hoborOverOnElement(dr, newMenu);
}
public AccessoriesPage ClickOnNewAccessories(){
	SeleniumHelper.ClickOnElement(newaccessories);
	return new AccessoriesPage(dr);
	
}
}
