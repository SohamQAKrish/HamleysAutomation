package page.Hamleys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysCheckoutEnum;

/**
 * @author RShivam
 * @lastmodifiedby RShivam This class will contain all the Home Page methods
 */

public class HamleysPage {
	/**
	 * This method is used to verify Hamleys Click Shop Category.
	 * 
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */

	public static void hamleysShopToyesCategorySelection() {
		try {
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_HOMEPAGE_SHOPTOYES_CATEGORIES_XPATH);
			System.out.println("------Test0----");
			UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_ADD_TO_PRODUCT_XPATH);
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_ADD_TO_PRODUCT_XPATH);
			System.out.println("------Test----");
			
			UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_CHECKOU_LOADING_MASK_XPATH);
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_CHECKOUT_BUTTON_XPATH);
			System.out.println("------Test2----");
			
		
			//UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_BAG_XAPTH);
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_BAG_XAPTH);
			System.out.println("------Test3----");

			UtilitiesCommon
					.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_BUTTON_XPATH);
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_BUTTON_XPATH);
			UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_GO_TO_PAYMENT_XAPTH);

			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_GO_TO_PAYMENT_XAPTH);
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_SELECT_PAYMENTMETHOD_CREDITCARD_XPATH);

		} catch (Exception e) {
			System.out.println("An error occurred while clicking the element: " + e.getMessage());
		}
	}

}