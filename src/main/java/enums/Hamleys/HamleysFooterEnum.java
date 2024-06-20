package enums.Hamleys;

public enum HamleysFooterEnum {
	HAMLEYS_POPUP_BUTTON_XPATH("//button[@role='button' and @data-testid='uc-accept-all-button' and text()='ACCEPT']"),

	HAMLEYS_FOOTER_LINKS_XPATH("//div[@class='h-footer-links']"),
	HAMLEYS_FOOTER_PRIVACY_POLICY_XPATH("//a[@href='https://mcstaging.hamleys.com/privacy-policy-cookie-restriction-mode']"),
	HAMLEYS_FOOTER_TERMS_XPATH("//a[@href='https://mcstaging.hamleys.com/terms-and-conditions'][normalize-space()='terms and conditions']"),
	HAMLEYS_FOOTER_FB_XPATH("//a[@href='https://www.facebook.com/Hamleyslondon/']"),
	HAMLEYS_FOOTER_INSTA_XPATH("//a[@href='https://www.instagram.com/hamleysofficial/?hl=en']"),
	HAMLEYS_FOOTER_YOUTUBE_XPATH("//li[@class='newsletter-utube']//a");

	
	private final String label;

	// A private constructor that sets the label for each enum constant
	private HamleysFooterEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}
}