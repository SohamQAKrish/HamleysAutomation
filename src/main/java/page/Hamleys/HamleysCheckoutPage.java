package page.Hamleys;

import common.CustomExceptions;
import common.UtilitiesCommon;
import enums.Hamleys.HamleysCheckoutEnum;

/**
 * @author RShivam
 * @lastmodifiedby RShivam
 * This class will contain all the Checkout methods
 */
public class HamleysCheckoutPage {	
	/**
	 * This method is used to verify ShopToys Category.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysShopToyesCategorySelection() {		
		try {
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_HOMEPAGE_SHOPTOYES_CATEGORIES_XPATH);
			UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_ADD_TO_PRODUCT_XPATH);
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_ADD_TO_PRODUCT_XPATH);
		} catch (Exception e) {
			System.out.println("An error occurred while clicking the element: " + e.getMessage());
		}
	}	
	/**
	 * This method is used to click on cart icon and then click on BAGs.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysCartBagSelect() {		
		try {
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_CHECKOUT_BUTTON_XPATH);
			UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_BAG_CSS);
			UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_BAG_CSS);
		} catch (CustomExceptions e) {
			System.out.println("Error: Locator is not correct.");
			e.printStackTrace(); // Print the stack trace for debugging
		}
	}	
	/**
	 * This method is used to click on Continue to checkout button.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysContinueCheckout() {		
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_BUTTON_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_BUTTON_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_GO_TO_PAYMENT_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_GO_TO_PAYMENT_XPATH);
	}
}