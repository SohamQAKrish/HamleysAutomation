package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysCheckoutAsGuestUserEnum;
/**
 * This class will contain all the Checkout methods as Guest User
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysCheckoutAsGuestUserPage {
	/**
	 * This method is used to Select a Product from Home Screen.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysSelectProductFromHome() {
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_ACCEPT_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_SELECT_HAMLEYS_EXLUSIVEPRODUCT_XPATH);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_SELECT_HAMLEYS_EXLUSIVEPRODUCT_XPATH);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_ACCEPT_XPATH);
	}
	/**
	 * This method is used to Add To Cart.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysAddtoCartProduct() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ADDTOBAG_CSS);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ADDTOBAG_CSS);		
	}
	/**
	 * This method is used to Select Mini Cart and then click on View Bag.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysSelectMiniCart() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICK_ON_MINI_BAG_CSS);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICK_ON_MINI_BAG_CSS);		
	}
	/**
	 * This method is used to click on Continue to checkout button.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysContinueToCheckoutScreen() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_XPATH);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_XPATH);
	}
	/**
	 * This method is used to Click on Checkout as Guest User link text.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysSelectCheckoutAsGuestUser() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICK_ON_GUESTUSER_FOR_CHECKOUT_CSS);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICK_ON_GUESTUSER_FOR_CHECKOUT_CSS);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ENTER_EMAILADDRESS_AS_GUEST_USER_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ENTER_EMAILADDRESS_AS_GUEST_USER_CSS,
		UtilitiesCommon.getTestData("GuestUserEmailAddress"));
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CONTINUE_AS_GUESTUSER_XPATH);
	}
	/**
	 * This method is used to fill the form of Shipping address details
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysEnterShippingAddressDetails() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_FIRSTNAME_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_FIRSTNAME_CSS,
		UtilitiesCommon.getTestData("FirstName"));
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_LASTNAME_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_LASTNAME_CSS,
		UtilitiesCommon.getTestData("LastName"));
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_PHONENUMBER_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_PHONENUMBER_CSS,
		UtilitiesCommon.getTestData("PhoneNumber"));		
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_STREETNAMEC_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_STREETNAMEC_CSS,
		UtilitiesCommon.getTestData("StreetRoad"));		
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_CITY_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_CITY_CSS,
		UtilitiesCommon.getTestData("City"));		
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_ZIPCODE_CSS);
		UtilitiesCommon.enterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_SHIPPING_ADDRESS_ZIPCODE_CSS,
		UtilitiesCommon.getTestData("ZipCode"));
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_GO_TO_PAYMENT_CSS);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_GUEST_GO_TO_PAYMENT_CSS);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_SELECT_PAYMENTOPTION_AS_CREDITCARD_XPATH);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_SELECT_PAYMENTOPTION_AS_CREDITCARD_XPATH);
		UtilitiesCommon.scrollDownSlightly();
	}
	/**
	 * This method is used to choose payment method as Credit Card and fill the card details and click place order button
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysEnterCardNumber() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ENTERCARDNUMBER_CSS);
		UtilitiesCommon.javaScriptEnterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ENTERCARDNUMBER_CSS,
		UtilitiesCommon.getTestData("CardNumber"));
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ENTEREXPIRYDATE_CSS);
		UtilitiesCommon.javaScriptEnterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_ENTEREXPIRYDATE_CSS,
		UtilitiesCommon.getTestData("ExpDate"));		
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CVVNUMBER_CSS);
		UtilitiesCommon.javaScriptEnterValue(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CVVNUMBER_CSS,
		UtilitiesCommon.getTestData("CVV"));
	}
	/**
	 * This method is used to click on Place order button after entering card details
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysPlaceOrder() {
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CHECKBOX_SELECT_CSS);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CHECKBOX_SELECT_CSS);
		UtilitiesCommon.waitForElementIsPresent(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICKON_PLACEORDER_XPATH);
		UtilitiesCommon.click(HamleysCheckoutAsGuestUserEnum.HAMLEYS_CLICKON_PLACEORDER_XPATH);		
	}
}