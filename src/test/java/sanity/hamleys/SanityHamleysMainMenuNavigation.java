package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.HamleysMainMenuNavigationPage;
/**
 * This class will contain all Sanity tests related to Verify main menu category links
 * @author RShivam
 * @lastmodifiedby RShivam 
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysMainMenuNavigation {
	/**
	 * @author RShivam
	 * @throws InterruptedException 
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify the Main Menu Navigation without login User")
	@Description("This Test is used to Verify Main Menu Navigation by accessing category & Sub-Category")
	public void testMainMenuNavigation() {
		UtilitiesCommon.launchApplication();
		HamleysMainMenuNavigationPage.verifyMainMenuCategoryLinks();
		HamleysMainMenuNavigationPage.hoverOverShopCategory();
	}
}
