package enums.Hamleys;
/**
 * This Enum will store objects available on Shopping Cart Screen
 * @author RShivam
 * @lastmodifiedby RShivam
 */
/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME
 */
public enum HamleysShoppingCartValidationEnum {
	HOMEPAGE_CLICK_CHRISTMAS_CATEGORIES_XPATH("//a[@id='ui-id-3']"),
	LASERBATTELEHOUSE_ADDTOCART_XPATH("//button[@type='submit' and @title='Add to bag' and contains(@class, 'tocart') and contains(@class, 'primary') and @data-objectid='989']"),
	SELECT_MINI_CART_CSS("a.action.viewcart.button[title='View Bag & Checkout']"),
	MINICART_PRODUCTNAME_XPATH("//div[@id='shopping-cart-table']//strong[@class='product-item-name']/a[text()='Laser Battle Hunters']"),
	UPDATE_PD_QTY_XPATH("//input[@class='input-text qty shopping-cart-item-qty']"),
	OUTSIDE_XPATH("//li[contains(text(),'Collection')]"),
	OUTSTOCK_ERROR_MESSAGE_XPATH("//div[contains(text(), 'The requested qty exceeds the maximum qty allowed in shopping cart')]/text()"),
	OUTSTOCK_ERROR_POPUP_OK_XPATH("//button[span[text()='OK']]"),
	APPLY_COUPONCODE_XPATH("//strong[@id='block-discount-heading']"),
	ENTER_CODE_XPATH("//input[@id='coupon_code']"),
	ClICKON_APPLY_BUTTON_XPATH("//span[contains(text(),'Apply')]"),
	GETINVALIDMESSAGE_COUPONCODE_CSS("div.message-error.error.message > div"),
	REMOVEPRODUCTFROMCART_CSS("a.action.action-delete"),
	GETTEXT_EMPTYCART_SCREEN_XPATH("//p[contains(text(),'You have no items in your shopping bag.')]"),
	LOADERONCARTUPDATE_XPATH("//div[@class='loader']/img[@alt='Loading...']");
	/**
	 * Override the toString() method to return the label instead of the declared name.*/
	@Override
	public String toString() {
		return this.label;
	}
	/**
	 * A final variable to store the label, which can't be changed.*/
	public final String label;
	/**
	 * A constructor that sets the label.
	 * @param label
	 */
	HamleysShoppingCartValidationEnum(String label){
		this.label = label;
	}
}