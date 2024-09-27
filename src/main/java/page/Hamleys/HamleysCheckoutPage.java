package page.Hamleys;

import org.openqa.selenium.WebElement;

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
//		UtilitiesCommon.waitForMilliseconds(6000);
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
	 * This method is used to select a credit card payment method
	 * @author RShivam
	 * @param driver
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysChoosePaymentAsCreditCard() {
//		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_SELECT_CREDITCARD_AS_PAYMENTMETHOD_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_SELECT_CREDITCARD_AS_PAYMENTMETHOD_XPATH);
	}
	/**
	 * This method is used to enter a credit card number
	 * @author RShivam
	 * @param driver
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysEnterCardNumber() {
//		UtilitiesCommon.waitForMilliseconds(1000);
		UtilitiesCommon.switchToFrame(HamleysCheckoutEnum.HAMLEYS_SWITCHTOIFRAM_CARD_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutEnum.HAMLEYS_ENTER_CREDITCARD_XPATH, UtilitiesCommon.getTestData("CardNumber"));
		UtilitiesCommon.switchToDefault();	
	}
	/**
	 * This method is used to enter a valid Expire date
	 * @author RShivam
	 * @param driver
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysEnterExpiryDate() {
		UtilitiesCommon.switchToFrame(HamleysCheckoutEnum.HAMLEYS_SWITCH_EXPIRYDATE_IFRAME_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutEnum.HAMLEYS_ENTER_EXPIRYDATE_XPATH, UtilitiesCommon.getTestData("ExpDate"));
		UtilitiesCommon.switchToDefault();
	}
	/**
	 * This method is used to enter a valid CVV number
	 * @author RShivam
	 * @param driver
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysEnterCVVNumber() {
		UtilitiesCommon.switchToFrame(HamleysCheckoutEnum.HAMLEYS_SWITCH_CVV_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutEnum.HAMLEYS_ENTER_CVV_XPATH, UtilitiesCommon.getTestData("CVV"));
		UtilitiesCommon.switchToDefault();
	
//		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_SELECT_CHECKBOX_PRIVACY_XPATH);
	}
//		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_SELECT_CHECKBOX_PRIVACY_XPATH);
//		WebElement checkbox = UtilitiesCommon.getElement(HamleysCheckoutEnum.HAMLEYS_SELECT_CHECKBOX_PRIVACY_XPATH);
//		if (!checkbox.isSelected()) {
//            checkbox.click();
//            System.out.println("Select Checkbox");
//        }		
//	    UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_SELECT_CHECKBOX_PRIVACY_CSS);
//	    System.out.println("Select Checkbox");
//	}
	/**
	 * This method is used to click on Place Order button
	 * @author RShivam
	 * @param driver
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysClickOnPlaceAnOrder() {
//	    UtilitiesCommon.waitForMilliseconds(2000);	   
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_PLACE_ORDER_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_CLICK_ON_PLACE_ORDER_XPATH);
	}
	/**
	 * This method is used get Thank You text from order success page
	 * @author RShivam
	 * @param driver
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysOrderPageGetText() {
//		UtilitiesCommon.waitForMilliseconds(1000);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutEnum.HAMLEYS_GETTEXT_THANK_XPATH);
		UtilitiesCommon.click(HamleysCheckoutEnum.HAMLEYS_GETTEXT_THANK_XPATH);
	}
}