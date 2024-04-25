package enums.Hamleys;
/**This enum will store objects available on Main Menu Navigation Page page. 
@author RShivam
@lastmodifiedby RShivam
*/
/* Note: Enum key should be in capital case and should end with either of below locator types:
ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME */
public enum HamleysMainMenuNavigationEnum {
	HAMLEYS_GUEST_ACCEPT_XPATH("//button[contains(@class, 'amgdprcookie-button') and contains(text(), 'Accept')]"),
	HAMLEYS_SHOP_CATEGORY_XPATH("//a[@id='ui-id-3']"),
	HAMLEYS_VERIFY_SHOP_TITLE_TEXT_XPATH("//h1[contains(text(),'Shop toys')]"),
	HAMLEYS_VERIFY_CHRISTMAS_CATEGORY_XPATH("//a[@id='ui-id-4']"),
	HAMLEYS_VERIFY_CHRISMAS_TITLE_TEXT_XPATH("//h1[contains(text(),'Christmas')]"),
	HAMELYS_BYAGETEST_CATEGORY_XPATH("//a[@id='ui-id-5']"),
	HAMLEYS_VERIFY_BYAGETEST_TEXT_XPATH("//h1[contains(text(),'By age Test')]"),
	HAMLEYS_BYBRAND_CATEGORY_XPATH("//a[@id='ui-id-8']"),
	HAMLEYS_VERIFY_BYBRAND_TEXT_XPATH("//h2[contains(text(),'Shop by brand')]"),
	HAMLEYS_BLACKFRIDAY_CATEGORY_XPATH("//a[@id='ui-id-11']"),
	HAMLEYS_BLACKFRIDAY_CATEGORY_TITLE_TEXT_XPATH("//h1[contains(text(),'Black Friday')]"),
	HAMLEYS_GAMING_CATEGORY_XPATH("//a[@id='ui-id-12']"),
	HAMLEYS_GAMING_CATGORY_TEXT_XPATH("//h1[contains(text(),'Gaming')]");
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
	HamleysMainMenuNavigationEnum(String label) {
		this.label = label;
	}
}