package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.Hamleys.HamleysAccountAddNewAddress;
import page.login.LoginPage;

/**
 * This class will contain all Sanity tests related to Add New Address & Delete recently added Address from Address Book.
 * @author RShivam
 * @lastmodifiedby RShivam 
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysAccountAddNewAddress {
	/**
	 * @author RShivam
	 * @throws InterruptedException 
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify the Add New Address/Delete Recently Added Address From Account with Login User")
	@Description("This Test is used to Verify Add New Address & Delete Address with Login Users")
	public void testAddNewAddressFromAccount() throws InterruptedException {
		LoginPage.login("AdminUserName", "AdminPassword");
		HamleysAccountAddNewAddress.hamleysAccessAccountAfterLoginUser();
		HamleysAccountAddNewAddress.hamleysAddNewAddressForm();	
		HamleysAccountAddNewAddress.hamleysSelectStreetDetails();
		HamleysAccountAddNewAddress.hamleysDeleteRecentlyAddedAddredd();
	}
}
