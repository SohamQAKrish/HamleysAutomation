package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import page.Hamleys.HamleysPage;
import page.login.LoginPage;

@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysCheckoutWithLoginUser {

	@Test(testName = "Hamleys verify Checkout with login user")
	@Description("This Test is used to Verify the login with Valid Credentials")
	public void testHanleysCheckoutLoginUser() throws InterruptedException{
		LoginPage.login("AdminUserName", "AdminPassword");
		Thread.sleep(6000);
		HamleysPage.hamleysShopToyesCategorySelection();
		Thread.sleep(6000);
		HamleysPage.hamleysCartBagSelect();
		Thread.sleep(6000);
		HamleysPage.hamleysContinueCheckout();
	
	}

}
