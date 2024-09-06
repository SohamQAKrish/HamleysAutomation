package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysLoginLogoutEnum;
/**
 * @author RShivam
 * @lastmodifiedby RShivam This class will contain all the Login page methods
 */
public class HamleysLoginLogoutPage {
	/**
	 * This method is used to Login into the application
	 * @param usernameKey
	 * @param passwordKey
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void login(String usernameKey, String passwordKey) {
		UtilitiesCommon.launchApplication();
		//UtilitiesCommon.clickAcceptButton();
		UtilitiesCommon.click(HamleysLoginLogoutEnum.LOGINPAGE_LOGIN_REGISTER_XPATH);
		String username = UtilitiesCommon.getEnvironmentData(usernameKey);
		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
		UtilitiesCommon.log("Logging in with User name : " + username);
		UtilitiesCommon.enterValue(HamleysLoginLogoutEnum.LOGINPAGE_USERNAME_TEXT_BOX_CSS, username);
		UtilitiesCommon.enterValue(HamleysLoginLogoutEnum.LOGINPAGE_PASSWORD_TEXT_BOX_CSS,
		UtilitiesCommon.getDecryptedPassword(password));
		UtilitiesCommon.click(HamleysLoginLogoutEnum.LOGINPAGE_LOGIN_BUTTON_XPATH);
	}
	/**
	 * This method is used to navigate to account section and click on sign out link text.
	 * @param usernameKey
	 * @param passwordKey
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void logout() {
		UtilitiesCommon.waitForMilliseconds(6000);
		UtilitiesCommon.applicationLogout();
		UtilitiesCommon.waitForElementIsPresent(HamleysLoginLogoutEnum.LOGIN_SIGNOUT_CLICK_XPATH);
		UtilitiesCommon.click(HamleysLoginLogoutEnum.LOGIN_SIGNOUT_CLICK_XPATH);
	}
}
