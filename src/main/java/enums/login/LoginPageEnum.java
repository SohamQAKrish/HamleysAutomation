package enums.login;

/**
 * This enum will store objects available on Login page.
 * @author spandit
 * @lastmodifiedby spandit
 */

/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME 
 */
/**
 * @author RShivam
 * @lastmodifiedby RShivam 
 * This class will contain all the Enums for Login Page
 */
public enum LoginPageEnum {
	HOMEPAGE_ACCEPT_XPATH("//button[contains(@class, 'amgdprcookie-button') and contains(text(), 'Accept')]"),
	LOGINPAGE_LOGIN_REGISTER_XPATH("//a[contains(text(),'Sign In / Register')]"),
	LOGINPAGE_USERNAME_TEXT_BOX_CSS("#email"),
	LOGINPAGE_PASSWORD_TEXT_BOX_CSS("#pass"),
	LOGINPAGE_LOGIN_BUTTON_XPATH("//span[contains(text(), 'Sign in')]"),
	LOGIN_ACCOUNT_CLICK_XPATH("//a[@href='https://mcstaging.hamleys.com/customer/account/']"),
	LOGIN_SIGNOUT_CLICK_XPATH("//a[contains(text(),'Sign out')]");

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
	LoginPageEnum(String label) {
		this.label = label;
	}
}