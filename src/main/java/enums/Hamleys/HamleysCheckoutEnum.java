package enums.Hamleys;

/**
 * This enum will store objects available on RShivam Home page.
 * 
 * @author RShivam
 * @lastmodifiedby RShivam
 */

/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME,
 * CLASSNAME
 */
public enum HamleysCheckoutEnum {

//	HAMLEYS_HOMEPAGE_SHOPTOYS_CATEGORIES_XPATH(
//			"//a[@href='https://mcstaging.hamleys.com/shop-toys.html' and @class='level-top ui-menu-item-wrapper' and @id='ui-id-2']"),
//	HAMLEYS_HOMEPAGE_SHOPYOYES_LOADING_CSS(".loading-mask"),
	HAMLEYS_HOMEPAGE_SHOPTOYES_CATEGORIES_XPATH("//a[@id='ui-id-2']"),
	HAMLEYS_ADD_TO_PRODUCT_XPATH(
			"//button[@type='submit' and @title='Add to bag' and contains(@class, 'tocart') and contains(@class, 'primary') and @data-objectid='30460']"),
	HAMLEYS_CLICK_CHECKOU_LOADING_MASK_XPATH(
			"//img[contains(@src, 'loader-1.gif') and @alt='Loading...' and @title='Loading...' and @style='position: absolute;']"),
	HAMLEYS_CLICK_ON_CHECKOUT_BUTTON_XPATH(
			"//a[@class='action showcart' and @onclick='getPricesAndQuantitieslogo()' and @href='https://mcstaging.hamleys.com/checkout/cart/']"),
	HAMLEYS_CLICK_ON_BAG_XAPTH(
			"//span[contains(text(),'View Bag & Checkout')]"),
	HAMLEYS_CLICK_ON_CONTINUETOCHECKOUT_BUTTON_XPATH(
			"//button[@type='button' and @data-role='proceed-to-checkout' and @title='Continue to Checkout' and contains(@class, 'action primary checkout')]"),
	HAMLEYS_CLICK_GO_TO_PAYMENT_XAPTH(
			"//button[@data-role='opc-continue' and @type='submit' and contains(@class, 'button action continue primary go-to-payment')]"),
	HAMLEYS_SELECT_PAYMENTMETHOD_CREDITCARD_XPATH("//label[@class='label' and @for='adyen_cc']");

	private final String label;

	HamleysCheckoutEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}

}
