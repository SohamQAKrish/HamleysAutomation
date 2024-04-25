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
	HAMLEYS_ENTER_CREDITCARD_XPATH("//span[@data-uid=\"adyen-checkout-encryptedCardNumber-1713270882054\"]"),
	HAMLEYS_ENTER_EXPIRYDATE_XPATH("//span[@data-uid=\"adyen-checkout-encryptedExpiryDate-1713270882055\"]"),
	HAMLEYS_ENTER_CVV_XPATH("//span[@data-uid=\"adyen-checkout-encryptedSecurityCode-1713270882056\"]"),
	HAMLEYS_SELECT_CHECKBOX_PRIVACY_XPATH("//input[@id=\\\"agreement_adyen_cc_1\\\"]"),
	HAMLEYS_CLICK_ON_PLACE_ORDER("//button[@class=\"action primary checkout\" and @title=\"Place Order\"]");
	
	private final String label;

	HamleysCheckoutEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}
}