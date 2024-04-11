package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysAddProductWishlistEnum;
import enums.login.LoginPageEnum;

/**
 * This method is used to verify Wishlist flow.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class WishlistPage {
	/**
	 * This method is used select product from top 10 slider.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testProductFromHomeScreen() {
		UtilitiesCommon.click(HamleysAddProductWishlistEnum.HAMLEYS_ACCEPT_XPATH);
		UtilitiesCommon.click(HamleysAddProductWishlistEnum.HAMLEYS_SELECT_PRODUCT_FROM_TOP10_XPATH);
	}
	/**
	 * This method is used to verify text from PDP.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testProductDetailsPage() {
		UtilitiesCommon.getElementText(HamleysAddProductWishlistEnum.HAMLEYS_CLICK_PRODUCT_GETTEXT_XPATH);
	}
	/**
	 * This method is used to login.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testLoginForWishlist(String usernameKey, String passwordKey) {
		UtilitiesCommon.click(HamleysAddProductWishlistEnum.HAMLESY_SELECT_WISHLISTFROM_PDP_CSS);
		UtilitiesCommon.getElementText(HamleysAddProductWishlistEnum.HAMLEYS_GETTEXT_FROMLOGIN_PAGE_XPATH);
		String username = UtilitiesCommon.getEnvironmentData(usernameKey);
		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
		UtilitiesCommon.log("Logging in with User name : " + username);
		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_USERNAME_TEXT_BOX_CSS, username);
		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_PASSWORD_TEXT_BOX_CSS,
		UtilitiesCommon.getDecryptedPassword(password));
		UtilitiesCommon.click(LoginPageEnum.LOGINPAGE_LOGIN_BUTTON_XPATH);
	}
	/**
	 * This method is used to Remove product From Wishlist.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testRemoveProductFromWishlist() {
		//UtilitiesCommon.waitForElementIsPresent(HamleysAddProductWishlistEnum.HAMELEYS_REMOVE_PRODUCTFROM_WISHLIST_XPATH);
		UtilitiesCommon.click(HamleysAddProductWishlistEnum.HAMELEYS_REMOVE_PRODUCTFROM_WISHLIST_XPATH);	}
}