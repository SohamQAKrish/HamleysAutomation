package sanity.hamleys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.login.LoginPage;

/**
 * @author RShivam
 * @lastmodifiedby RShivam
 * This class will contain all Sanity tests related to Login and Navigations to different modules across the Hamleys application.
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysLoginAndNavigationTest {
	/**
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys Web Application Navigation")
	@Description("This Test is used to Verify the login with Valid Credentials")
	public void testHamleysPageHeaderTitle() {
		LoginPage.login("AdminUserName", "AdminPassword");
		//LoginPage.logout();
		//HamleysPage.verifyHamleysShopPageCategory();
		//LoginPage.reloginAfterLogout("AdminUserName", "AdminPassword");
	}
}