package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.HamleysFooterNavigation;
/**
 * This class will contain all Sanity tests related to Verify Footer navigation.
 * @author RShivam
 * @lastmodifiedby RShivam 
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysFooterNavigation {
	/**
	 * @author RShivam
	 * @throws InterruptedException 
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify the Footer navigation test")
	@Description("This Test is used to Verify Footer navigation")
	public void testHamleysFooterVerify() throws InterruptedException {
		UtilitiesCommon.launchApplication();
		HamleysFooterNavigation.hamleysVerifyFooter();
		HamleysFooterNavigation.footerCMSLinkVerify();
	}
}
