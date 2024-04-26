package page.Hamleys;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysFooterNavigationEnum;

/**
 * This class will contain all the Footer navigation flow
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysFooterNavigation {
	/**
	 * This method is used to Accept the Cookies
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysVerifyFooter() {
		UtilitiesCommon.waitForMilliseconds(6000);
		UtilitiesCommon.click(HamleysFooterNavigationEnum.HAMLEYS_GUEST_ACCEPT_XPATH);		
	}
	/**
	 * This method is used to Verify CMS link from Footer
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void footerCMSLinkVerify() throws InterruptedException{
		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.scrolltillPageEnd();
		UtilitiesCommon.setupWebdriverWait(5000);
		UtilitiesCommon.waitForElementIsPresent(HamleysFooterNavigationEnum.HAMLEYS_VERIFY_FOOTER_CSS);
		WebElement footerCMSsection = UtilitiesCommon.getElement(HamleysFooterNavigationEnum.HAMLEYS_VERIFY_FOOTER_CSS);
		List<WebElement> footerelements = footerCMSsection.findElements(By.tagName("a"));
		System.out.println("Number of footer links " + footerelements.size());
		for (int i = 0; i < footerelements.size()-7; i++) {
			String footerlinktitle = footerelements.get(i).getText();
			System.out.println("link text " + footerlinktitle);
			footerelements.get(i).click();
			UtilitiesCommon.waitForElementIsPresent(HamleysFooterNavigationEnum.HAMLEYS_VERIFY_FOOTER_CSS);
			System.out.println("Afterclick CMS page title" + UtilitiesCommon.getTitle());
			if (UtilitiesCommon.getTitle().contains("404")) {
				assertTrue(false, "CMS link navigated to 404");
			} else {
				assertTrue(true, "CMS page loaded properly" + UtilitiesCommon.getTitle());
			}
			UtilitiesCommon.scrolltillPageEnd();
			UtilitiesCommon.waitForElementIsPresent(HamleysFooterNavigationEnum.HAMLEYS_VERIFY_FOOTER_CSS);
			footerCMSsection = UtilitiesCommon.getElement(HamleysFooterNavigationEnum.HAMLEYS_VERIFY_FOOTER_CSS);
			footerelements = footerCMSsection.findElements(By.tagName("a"));
		}
	}
}