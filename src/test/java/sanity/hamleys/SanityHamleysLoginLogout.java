package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.Hamleys.HamleysLoginLogoutPage;
/**
 * This class will contain all Sanity tests related to Login to the system and logout. 
 * @author RShivam
 * @lastmodifiedby RShivam
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysLoginLogout {
	/**
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify Login and Logout")
	@Description("This Test is used to Verify login to the system and logout")
	public void testLoginLogout() {
		HamleysLoginLogoutPage.login("AdminUserName", "AdminPassword");
		HamleysLoginLogoutPage.logout();
	}
}