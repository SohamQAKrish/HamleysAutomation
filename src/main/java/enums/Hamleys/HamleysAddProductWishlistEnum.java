package enums.Hamleys;

/* This enum will store objects available on Product Wishlist page.
* @author RShivam
* @lastmodifiedby spandit
*/

/*
* Note: Enum key should be in capital case and should end with either of below
* locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME,CLASSNAME
*/

public enum HamleysAddProductWishlistEnum {
	HAMLEYS_ACCEPT_XPATH("//button[contains(@class, 'amgdprcookie-button') and contains(text(), 'Accept')]"),
	HAMLEYS_SELECT_PRODUCT_FROM_TOP10_XPATH("//a[@class='product-item-photo']/span/span/img[contains(@class, 'product-image-photo')]"),
	HAMLEYS_CLICK_PRODUCT_GETTEXT_XPATH("//span[@class='base' and @data-ui-id='page-title-wrapper' and @itemprop='name']"),
	HAMLESY_SELECT_WISHLISTFROM_PDP_CSS("#wishlistCustom"),
	HAMLEYS_GETTEXT_FROMLOGIN_PAGE_XPATH("//div[contains(text(),'You must login or register to add items to your wi')]"),
	HAMELEYS_REMOVE_PRODUCTFROM_WISHLIST_XPATH("//a[@class='btn-remove action delete']");

	private final String label;

	HamleysAddProductWishlistEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}
}