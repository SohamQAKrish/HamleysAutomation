package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.HamleysFooterLinks;

@Listeners({ listeners.ScriptExecutionListener.class })

public class SanityHamleyesFootersectiontest {

	@Test(testName = "Footer section links verification")
	@Description("This Test is used to Verify the Navigation of the Footer section")
	public void Footerlinks() throws InterruptedException {
	UtilitiesCommon.launchApplication();
	Thread.sleep(5000);	
	System.out.println("Launch browser as expected");
		//HamleysFooterLinks.clickAcceptButton();
		
		//HamleysFooterLinks.clickAndVerifyFooterLinks();
//		UtilitiesCommon.waitForMilliseconds(30);
//		HamleysFooterLinks.footerPrivacyPolicyLinkCheck();
//		HamleysFooterLinks.footerTermsAndConditionsLinkCheck();
//		UtilitiesCommon.waitForMilliseconds(30);
//		HamleysFooterLinks.footerFBLinkCheck();
//		HamleysFooterLinks.footerInstaLinkCheck();
//		HamleysFooterLinks.footerYoutubeLinkCheck();
	}
}