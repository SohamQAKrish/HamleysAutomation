package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.Hamleys.HamleysCheckoutPage;
import page.login.LoginPage;
/**
 * @author RShivam
 * @lastmodifiedby RShivam
 * This class will contain all Sanity tests related to Checkout screen across the Hamleys application.
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysCheckoutWithLoginUser {
	/**
	 * @author RShivam
	 * @throws InterruptedException 
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify Checkout with login user")
	@Description("This Test is used to Verify the login with Valid Credentials")
	public void testHanleysCheckoutLoginUser(){
		LoginPage.login("AdminUserName", "AdminPassword");
//		HamleysCheckoutPage.hamleysShopToyesCategorySelection();
		HamleysCheckoutPage.hamleysCartBagSelect();
		HamleysCheckoutPage.hamleysContinueCheckout();
//		HamleysCheckoutPage.hamleysChoosePaymentAsCreditCard();
		HamleysCheckoutPage.hamleysEnterCardNumber();
		HamleysCheckoutPage.hamleysEnterExpiryDate();
		HamleysCheckoutPage.hamleysEnterCVVNumber();
		HamleysCheckoutPage.hamleysClickOnPlaceAnOrder();
		HamleysCheckoutPage.hamleysOrderPageGetText();
	}
}