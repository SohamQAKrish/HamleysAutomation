package page.Hamleys;

import org.openqa.selenium.WebElement;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysAddProductWishlistEnum;
import enums.login.LoginPageEnum;

/**
 * @author RShivam
 * @lastmodifiedby RShivam This class will contain all the Wishlist flow methods
 */
public class WishlistPage {

	public static void testProductFromHomeScreen() {
		UtilitiesCommon.click(HamleysAddProductWishlistEnum.HAMLEYS_ACCEPT_XPATH);
		UtilitiesCommon.click(HamleysAddProductWishlistEnum.HAMLEYS_SELECT_PRODUCT_FROM_TOP10_XPATH);

	}

	public static void testProductDetailsPage() {
		UtilitiesCommon.getElementText(HamleysAddProductWishlistEnum.HAMLEYS_CLICK_PRODUCT_GETTEXT_XPATH);
		UtilitiesCommon.click(HamleysAddProductWishlistEnum.HAMLESY_SELECT_WISHLISTFROM_PDP_CSS);

	}

	public static void testLoginForWishlist(String usernameKey, String passwordKey) {
		UtilitiesCommon.click(LoginPageEnum.HOMEPAGE_ACCEPT_XPATH);
		UtilitiesCommon.click(LoginPageEnum.LOGINPAGE_LOGIN_REGISTER_XPATH);
		String username = UtilitiesCommon.getEnvironmentData(usernameKey);
		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
		UtilitiesCommon.log("Logging in with User name : " + username);
		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_USERNAME_TEXT_BOX_CSS, username);
		UtilitiesCommon.enterValue(LoginPageEnum.LOGINPAGE_PASSWORD_TEXT_BOX_CSS,
				UtilitiesCommon.getDecryptedPassword(password));
		UtilitiesCommon.click(LoginPageEnum.LOGINPAGE_LOGIN_BUTTON_XPATH);
	}

}