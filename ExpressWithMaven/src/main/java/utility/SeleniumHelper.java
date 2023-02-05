package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumHelper {
	public static void hoborOverOnElement(WebDriver dr, WebElement ele ) {
		Actions a= new Actions(dr);
		a.moveToElement(ele).build().perform();
		
	}
	public static void ClickOnElement(WebElement element) {
		element.click();
	}

}

