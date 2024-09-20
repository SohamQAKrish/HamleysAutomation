package enums.Hamleys;
/**
 * This enum will store objects available on Search Screen flow
 * @author RShivam
 * @lastmodifiedby RShivam
 */
/*
 * Note: Enum key should be in capital case and should end with either of below
 * locator types: ID, XPATH, LINKTEXT, PARTIALLINKTEXT, CSS, NAME, TAGNAME, CLASSNAME
 */
public enum HamleysSearchProductToEnum {
	HAMLEYS_SEARCH_ACCEPT_XPATH("//button[contains(@class, 'amgdprcookie-button') and contains(text(), 'Accept')]"),
	HAMELEYS_ENTERTEXTINSERCH_CSS("#autocomplete-0-input"),
	HAMLEYS_SELECTPRODUCT_FROM_SEACHSUGGESTION_LIST_XPATH("//a[@data-objectid='11725']"),
	HAMELYS_SEARCHPRODUCT_ADD_TO_CART_CSS("#product-addtocart-button");
	
	private final String label;

	HamleysSearchProductToEnum(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return this.label;
	}
}
