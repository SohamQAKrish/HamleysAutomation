package sanity.hamleys;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import page.Hamleys.HamleysPage;
import page.login.LoginPage;

@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysCheckoutWithLoginUser {

	@Test(testName = "Hamleys Web Application Navigation")
	@Description("This Test is used to Verify the login with Valid Credentials")
	public void testHanleysCheckoutLoginUser() throws InterruptedException {
		LoginPage.login("AdminUserName", "AdminPassword");
		Thread.sleep(6000);
		HamleysPage.hamleysShopToyesCategorySelection();

	}

}
