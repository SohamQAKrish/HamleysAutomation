package enums.Hamleys;
/**This enum will store objects available on Main Menu Navigation Page page.
@author RShivam
@lastmodifiedby RShivam
*/
/* Note: Enum key should be in capital case and should end with either of below locator types:
ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME */
public enum HamleysFooterNavigationEnum {
	HAMLEYS_GUEST_ACCEPT_XPATH("//button[contains(@class, 'amgdprcookie-button') and contains(text(), 'Accept')]"),
	HAMLEYS_VERIFY_FOOTER_CSS("body.cms-home .footer-main > div:nth-child(2)");
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
	HamleysFooterNavigationEnum(String label) {
		this.label = label;
	}
}
