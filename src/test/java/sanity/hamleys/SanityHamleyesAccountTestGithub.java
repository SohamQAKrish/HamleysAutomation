package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.UtilitiesCommon;
import io.qameta.allure.Description;
import page.Hamleys.HamleysLaunchBrowserTestGitHubActions;
/**
 * This class will contain all Sanity tests related to Launch the URL and Close the browser.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleyesAccountTestGithub {
	
	/**
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify Github Actions")
	@Description("This Test is used to Verify Launch the URL and Close the Browser")
	public void testgitHubActions() {
		HamleysLaunchBrowserTestGitHubActions.login();
		UtilitiesCommon.log("Successfully launch browser");
		UtilitiesCommon.log("Allure report generated on the docker container");

	}
}
