package sanity.hamleys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.Hamleys.HamleysPage;
import page.login.LoginPage;

/**
 * @author spandit
 * @lastmodifiedby spandit
 * This class will contain all Sanity tests related to Login and Navigations to different modules across the Hamleys application.
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysLoginAndNavigationTest {
	/**
	 * @author spandit
	 * @lastmodifiedby spandit
	 */
	@Test(testName = "Hamleys Web Application Navigation")
	@Description("This Test is used to Verify the login with Valid Credentials")
	public void testHamleysPageHeaderTitle() {
		LoginPage.login("AdminUserName", "AdminPassword");
//		HamleysPage.hamleysShopToyesCategorySelection();
		//LoginPage.logout();
		//HamleysPage.verifyHamleysShopPageCategory();
		//LoginPage.reloginAfterLogout("AdminUserName", "AdminPassword");


	}

//	/**
//	 * @author spandit
//	 * @lastmodifiedby spandit
//	 */
//	@Test(testName = "Hamleys Men Category Navigation")
//	@Description("This Test is used to Verify the Navigation to the Men Category")
//	public void testHamleysCategoryNavigation() {
//		LoginPage.reloginAfterLogout("AdminUserName", "AdminPassword");
//		//HamleysPage.verifyHamleysShopPageCategory();
//		//HamleysPage.verifyHamleysShopPageCategory();
//	}

}