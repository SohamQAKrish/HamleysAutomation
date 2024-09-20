package enums.Hamleys;
/**
 * This enum will store objects available on checkout screen with Guest User
 * @author RShivam
 * @lastmodifiedby RShivam
 */
/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME
 */
public enum HamleysCheckoutAsGuestUserEnum {
	HAMLEYS_GUEST_ACCEPT_XPATH("//button[contains(@class, 'amgdprcookie-button') and contains(text(), 'Accept')]"),
	HAMLEYS_SELECT_HAMLEYS_EXLUSIVEPRODUCT_XPATH("//a[@class='pagebuilder-button-primary' and @href='https://www.hamleys.com/by-brand/hamleys/hamleys-exclusive-range']/span[@data-element='link_text']"),
	HAMLEYS_ADDTOBAG_CSS("button[title='Add to bag'][data-objectid='53675']"),
	HAMLEYS_CLICK_ON_MINI_BAG_CSS("a.action.viewcart.button[title='View Bag & Checkout']"),
	HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_XPATH("//button[@class='action primary checkout' and @title='Continue to Checkout']"),
	HAMLEYS_CLICK_ON_GUESTUSER_FOR_CHECKOUT_CSS("div.checkout-info.guest h3"),
	HAMLEYS_ENTER_EMAILADDRESS_AS_GUEST_USER_CSS(".checkout-checkout-guest div.control._with-tooltip input#customer-email"),
	HAMLEYS_CONTINUE_AS_GUESTUSER_XPATH("//button[@id='guestbutton']"),
	HAMLEYS_GUEST_SHIPPING_ADDRESS_FIRSTNAME_CSS("div.field._required input.input-text[name='firstname']"),
	HAMLEYS_GUEST_SHIPPING_ADDRESS_LASTNAME_CSS("div.field._required input.input-text[name='lastname']"),
	HAMLEYS_GUEST_SHIPPING_ADDRESS_PHONENUMBER_CSS("div.field._required input.input-text[name='telephone']"),
	HAMLEYS_GUEST_SHIPPING_ADDRESS_STREETNAMEC_CSS("div.field._required input.input-text[name='street[0]']"),
	HAMLEYS_GUEST_SHIPPING_ADDRESS_CITY_CSS("div.field._required input.input-text[name='city']"),
	HAMLEYS_GUEST_SHIPPING_ADDRESS_ZIPCODE_CSS("div.field._required input.input-text[name='postcode']"),
	HAMLEYS_GUEST_GO_TO_PAYMENT_CSS("button.button.action.continue.primary.go-to-payment"),
	HAMLEYS_SELECT_PAYMENTOPTION_AS_CREDITCARD_XPATH("//span[contains(text(),'Credit/Debit Card')]"),
	HAMLEYS_ENTERCARDNUMBER_CSS("span[data-cse='encryptedCardNumber'].adyen-checkout__input--large.adyen-checkout__card__cardNumber__input"),
	HAMLEYS_ENTEREXPIRYDATE_CSS("span[data-cse='encryptedExpiryDate'].adyen-checkout__input--small.adyen-checkout__card__exp-date__input"),
	HAMLEYS_CVVNUMBER_CSS("span[data-cse='encryptedSecurityCode'].adyen-checkout__input--small.adyen-checkout__card__cvc__input"),
	HAMLEYS_CHECKBOX_SELECT_CSS("#agreement_adyen_cc_3"),
	HAMLEYS_CLICKON_PLACEORDER_XPATH("//div[@class='primary']//button[@class='action primary checkout']");
	/**
	 * Override the toString() method to return the label instead of the declared name.
	 */
	@Override
	public String toString() {
		return this.label;
	}
	/**
	 * A final variable to store the label, which can't be changed.
	 */
	public final String label;
	/**
	 * A private constructor that sets the label.
	 * @param label
	 */
	HamleysCheckoutAsGuestUserEnum(String label) {
		this.label = label;
	}
}