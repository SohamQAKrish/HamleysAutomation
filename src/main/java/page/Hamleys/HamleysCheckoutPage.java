package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysCheckoutEnum;

/**
 * This class will contain all the Checkout methods
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysCheckoutPage {
	/**
	 * This method is used to verify ShopToys Category.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysShopToyesCategorySelection() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_HOMEPAGE_SHOPTOYES_CATEGORIES_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_HOMEPAGE_SHOPTOYES_CATEGORIES_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_ADD_TO_PRODUCT_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_ADD_TO_PRODUCT_XPATH);
	}
	/**
	 * This method is used to click on cart icon and then click on BAGs.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysCartBagSelect() {
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_CHECKOUT_BUTTON_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_BAG_CSS);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_BAG_CSS);
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
	/**
	 * This method is used to select a credit card payment method and enter details
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysEnterCreditCardDetals() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_SELECT_CREDITCARD_AS_PAYMENTMETHOD_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_SELECT_CREDITCARD_AS_PAYMENTMETHOD_XPATH);
		UtilitiesCommon.enterValue(HamleysCheckoutEnum.HAMLEYS_ENTER_CREDITCARD_XPATH,
		UtilitiesCommon.getTestData("CardNumber"));
		UtilitiesCommon.enterValue(HamleysCheckoutEnum.HAMLEYS_ENTER_EXPIRYDATE_XPATH,
		UtilitiesCommon.getTestData("ExpDate"));
		UtilitiesCommon.enterValue(HamleysCheckoutEnum.HAMLEYS_ENTER_CVV_XPATH,
		UtilitiesCommon.getTestData("CVV"));
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_SELECT_CHECKBOX_PRIVACY_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_SELECT_CHECKBOX_PRIVACY_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_PLACE_ORDER);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_PLACE_ORDER);
	}
}