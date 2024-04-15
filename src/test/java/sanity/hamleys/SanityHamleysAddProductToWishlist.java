package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.WishlistPage;

/**
 * This class will contain all Sanity tests related to Add to Product as Wishlist across the Hamleys application.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysAddProductToWishlist {
	/**
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify Wishlist Product from with login")
	@Description("This Test is used to Verify the wishlist product with Valid Credentials")
	public void testAddProductToWishlist() 
	{
		UtilitiesCommon.launchApplication();
		WishlistPage.testProductFromHomeScreen();
		WishlistPage.testProductDetailsPage();
		WishlistPage.testLoginForWishlist("AdminUserName", "AdminPassword");
		WishlistPage.testRemoveProductFromWishlist();
	}
}
