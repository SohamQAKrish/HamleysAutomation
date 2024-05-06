package enums.Hamleys;
/**
 * This enum will store objects available on Checkout Screen with Login User
 * @author RShivam
 * @lastmodifiedby RShivam
 */
/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME
 */
public enum HamleysCheckoutEnum {
	HAMLEYS_HOMEPAGE_SHOPTOYES_CATEGORIES_XPATH("//a[@id='ui-id-3']"), 
	HAMLEYS_ADD_TO_PRODUCT_XPATH("//button[@type='submit' and @title='Add to bag' and contains(@class, 'tocart') and contains(@class, 'primary') and @data-objectid='30460']"),
	HAMLEYS_CLICK_CHECKOU_LOADING_MASK_XPATH("//img[contains(@src, 'loader-1.gif') and @alt='Loading...' and @title='Loading...' and @style='position: absolute;']"),
	HAMLEYS_CLICK_ON_CHECKOUT_BUTTON_XPATH("//a[@class='action showcart' and @onclick='getPricesAndQuantitieslogo()' and @href='https://mcstaging.hamleys.com/checkout/cart/']"),
	HAMLEYS_CLICK_ON_BAG_CSS("a.action.viewcart.button[title='View Bag & Checkout']"),
	HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_BUTTON_XPATH("//button[@class='action primary checkout' and @title='Continue to Checkout']"),
	HAMLEYS_CLICK_GO_TO_PAYMENT_XPATH("//span[contains(text(), 'Go to payment')]"),
	HAMLEYS_SELECT_CREDITCARD_AS_PAYMENTMETHOD_XPATH("//span[contains(text(),'Credit or Debit Card')]"),
	HAMLEYS_ENTER_CREDITCARD_XPATH("//input[@placeholder='1234 5678 9012 3456']"),
	HAMLEYS_SWITCHTOIFRAM_CARD_CSS("iframe[title='Iframe for card number']"),
	HAMLEYS_ENTER_EXPIRYDATE_XPATH("//input[@placeholder='MM/YY']"),
	HAMLEYS_SWITCH_EXPIRYDATE_IFRAME_CSS("iframe[title='Iframe for expiry date']"),	
	HAMLEYS_ENTER_CVV_XPATH("//input[@placeholder='3 digits']"),
	HAMLEYS_SWITCH_CVV_CSS("iframe[title='Iframe for security code']"),
	HAMLEYS_SELECT_CHECKBOX_PRIVACY_XPATH("//div[@class='checkout-agreement field choice required']//input[@id='agreement_adyen_cc_1' and @name='agreement[1]' and @value='1']"),
	HAMLEYS_CLICK_ON_PLACE_ORDER_XPATH("//button[@title='Place Order']/ancestor::form[@id='adyen-cc-form']"),
	HAMLEYS_GETTEXT_THANK_XPATH("//span[contains(text(),'Thank you for your order')]");
	
	private final String label;

	HamleysCheckoutEnum(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return this.label;
	}
}