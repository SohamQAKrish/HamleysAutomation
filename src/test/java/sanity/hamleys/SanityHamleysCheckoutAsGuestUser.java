package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.HamleysCheckoutAsGuestUserPage;
/**
 * This class will contain all Sanity tests related to Add Product to the Cart, and Checkout as Guest User.
 * @author RShivam
 * @lastmodifiedby RShivam 
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysCheckoutAsGuestUser {
	/**
	 * @author RShivam
	 * @throws InterruptedException 
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify the checkout screen as Guest User")
	@Description("This Test is used to Add product and checkout as Guest User")
	public void testCheckoutAsGuestUser(){
		UtilitiesCommon.launchApplication();
		HamleysCheckoutAsGuestUserPage.hamleysSelectProductFromHome();
		UtilitiesCommon.waitForMilliseconds(5000);
		HamleysCheckoutAsGuestUserPage.hamleysAddtoCartProduct();
		UtilitiesCommon.waitForMilliseconds(5000);
		HamleysCheckoutAsGuestUserPage.hamleysSelectMiniCart();
		UtilitiesCommon.waitForMilliseconds(3000);
		HamleysCheckoutAsGuestUserPage.hamleysContinueToCheckoutScreen();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysSelectCheckoutAsGuestUser();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysEnterShippingAddressDetails();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysEnterCardNumber();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysPlaceOrder();
	}
	
	/**
	 * @author RShivam
	 * @throws InterruptedException 
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify the checkout screen as Guest User")
	@Description("This Test is used to Add product and checkout as Guest User")
	public void testCheckAllureTesting(){
		UtilitiesCommon.launchApplication();
		HamleysCheckoutAsGuestUserPage.hamleysSelectProductFromHome();
		UtilitiesCommon.waitForMilliseconds(5000);
		HamleysCheckoutAsGuestUserPage.hamleysAddtoCartProduct();
		UtilitiesCommon.waitForMilliseconds(5000);
		HamleysCheckoutAsGuestUserPage.hamleysSelectMiniCart();
		UtilitiesCommon.waitForMilliseconds(3000);
		HamleysCheckoutAsGuestUserPage.hamleysContinueToCheckoutScreen();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysSelectCheckoutAsGuestUser();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysEnterShippingAddressDetails();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysEnterCardNumber();
		UtilitiesCommon.waitForMilliseconds(2000);
		HamleysCheckoutAsGuestUserPage.hamleysPlaceOrder();
	}
}