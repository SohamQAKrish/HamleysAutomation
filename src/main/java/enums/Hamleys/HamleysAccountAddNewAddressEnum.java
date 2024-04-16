package enums.Hamleys;

public enum HamleysAccountAddNewAddressEnum {
	HAMLEYS_ACCESS_ACCOUNT_XPATH("//a[text()='Account']"),
	HAMLEYS_SELECT_ADDRESSBOOK_XPATH("//a[contains(text(),'Address Book')]"),
	HAMLEYS_ADDNEWADDRESS_CSS("button[title='Add New Address']"),
	HAMLEYS_SELECTFIRST_NAME_XPATH("//input[@id='firstname']"),
	HAMLEYS_SELECTLAST_NAME_XPATH("//input[@id='lastname']"),
	HAMLEYS_SELECTPHONE_NUMBER_XPATH("//input[@id='telephone']"),
	HAMLEYS_ENTER_STREETADDRESS_CSS("#street_1"),
	HAMLEYS_SELECT_CITYNAME_XPATH("//input[@id='city']"),
	HAMLEYS_SELECT_ZIPCODE_XPATH("//input[@id='zip']"),
	HAMLEYS_SUBMIT_ADDRESSBUTTON_CSS("button.action.submit.primary[title='Save Address']"),
	HAMLEYS_DELETE_ADDRESS_XPATH("//span[contains(text(),'Delete')]"),
	HAMLEYS_DELETE_ACCEPT_ALERT_CSS("button.action-primary.action-accept[type='button']"),
	HAMLEYS_GET_SUCCESS_DELETEMESSAGE_CSS("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']");

	private final String label;

	HamleysAccountAddNewAddressEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}
}
