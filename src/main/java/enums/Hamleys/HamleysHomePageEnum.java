package enums.Hamleys;

/**This enum will store objects available on Hamleys Home page.
@author spandit
@lastmodifiedby spandit
*/

/* Note: Enum key should be in capital case and should end with either of below locator types:
ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME */

public enum HamleysHomePageEnum {
	HAMLEYS_PAGE_TITLE_CSS(".page-header"),
	HAMLEYS("span[class='base'] font font"),
	HAMLEYS_HOME_SHOP_TOYS_CATEGORIES_XPATH("//span[contains(text(), 'Shop toys')]/ancestor::div[@class='top-menu top-menu__container top-menu--desktop']");

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
	HamleysHomePageEnum(String label) {
		this.label = label;
	}
}
