package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver dr;

	@Test
	public void StartBrowser() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\shanu\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		//"C:\\Users\\shanu\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
 dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://www.express.com/");
	}

	public void CloseBrowser() {
		dr.quit();
	}
}
