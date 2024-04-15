package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.Hamleys.HamleysCheckoutPage;
import page.login.LoginPage;

/**
 * This class will contain all Sanity tests related to Checkout screen across the Hamleys application.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysCheckoutWithLoginUser {
	/**
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify Checkout with login user")
	@Description("This Test is used to Verify the login with Valid Credentials")
	public void testHamleysCheckoutLoginUser() {
		LoginPage.login("AdminUserName", "AdminPassword");
		HamleysCheckoutPage.hamleysShopToyesCategorySelection();
		HamleysCheckoutPage.hamleysCartBagSelect();
		HamleysCheckoutPage.hamleysContinueCheckout();
	}
}
