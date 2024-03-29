package enums.Hamleys;

public enum HamleysAddProductWishlistEnum {

	HAMLEYS_ACCEPT_XPATH("//button[contains(@class, 'amgdprcookie-button') and contains(text(), 'Accept')]"),
	HAMLEYS_SELECT_PRODUCT_FROM_TOP10_XPATH(
			"//a[@class='product-item-photo']/span/span/img[contains(@class, 'product-image-photo')]"),
	HAMLEYS_CLICK_PRODUCT_GETTEXT_XPATH(
			"//span[@class='base' and @data-ui-id='page-title-wrapper' and @itemprop='name']"),
	HAMLESY_SELECT_WISHLISTFROM_PDP_CSS("#wishlistCustom");

	private final String label;

	HamleysAddProductWishlistEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}

}