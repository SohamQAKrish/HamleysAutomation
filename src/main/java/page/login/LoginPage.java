package page.login;

import common.UtilitiesCommon;
import enums.login.LoginPageEnum;

/**
 * @author RShivam
 * @lastmodifiedby RShivam 
 * This class will contain all the Login page methods
 */
public class LoginPage {
	/**
	 * This method is used to Login into the application
	 * @param usernameKey
	 * @param passwordKey
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void login(String usernameKey, String passwordKey) {
		UtilitiesCommon.launchApplication();
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
	/**
	 * This method is used to re-Login into the application after Logout
	 * @param usernameKey
	 * @param passwordKey
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void reloginAfterLogout(String usernameKey, String passwordKey) {
		UtilitiesCommon.openUrl();
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
