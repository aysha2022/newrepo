package com.bit.test;

import org.junit.Test;

import pages.AccessoriesPage;
import pages.Homepage;
import pages.ProductdetailsPage;
import pages.SlimJeansPage;

public class EndtoEndScenario extends BaseTest {
	Homepage hp;
	ProductdetailsPage pdp;
	AccessoriesPage ap;
	SlimJeansPage sjp;
	

@Test
public void buyAJeansWith () {
	StartBrowser();
	hp.hoborOverOnJeans();
	hp.ClickOnSlimJeansSubCategory();
	sjp.ClickOnDarkWashjeans();
	pdp.ClickOnColourBox();
	pdp.ClickOnWaistBox();
	pdp.ClickOnBox();
	pdp.ClickOnAddtoCart();
	
}
@Test
public void buyAccossories() {
	hp.hoborOverOnNewmenu();
	hp.ClickOnNewAccessories();
	pdp.ClickOnColourBox();
	pdp.ClickOnAddtoCart();
	
}
}
