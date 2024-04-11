package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.HamleysSearchProductPage;
import page.login.LoginPage;

/**
 * @author RShivam
 * @lastmodifiedby RShivam
 * This class will contain all Sanity tests related to Search product and add to cart across the Hamleys application.
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysSearchProductToCart {
	/**
	 * @author RShivam
	 * @throws InterruptedException 
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys Search product & Add to Cart")
	@Description("This Test is used to Search Functionality and Add the product to the cart")
	public void testSearchProductToCart() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		//LoginPage.login("AdminUserName", "AdminPassword");
		HamleysSearchProductPage.testEnterTextSearchBar();
		HamleysSearchProductPage.testSelectProductFromSearchList();
		HamleysSearchProductPage.testAddToCart();
	}
}


