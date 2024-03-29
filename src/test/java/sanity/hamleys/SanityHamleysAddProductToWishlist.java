package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.WishlistPage;
import page.login.LoginPage;

@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysAddProductToWishlist {
	@Test(testName = "Hamleys verify Wishlist Product from without login")
	@Description("This Test is used to Verify the wishlist product with Valid Credentials")
	public void testAddProductToWishlist() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		WishlistPage.testProductFromHomeScreen();
		WishlistPage.testProductDetailsPage();
		Thread.sleep(5000);

	}
}
