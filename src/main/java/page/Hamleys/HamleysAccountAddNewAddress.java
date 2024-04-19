package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysAccountAddNewAddressEnum;
/**
 * This class will contain all the Add New Address Class
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysAccountAddNewAddress {
	/**
	 * This method is used to Access the Account information after login to the Systems.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysAccessAccountAfterLoginUser() {
		UtilitiesCommon.waitForElementIsPresent(HamleysAccountAddNewAddressEnum.HAMLEYS_ACCESS_ACCOUNT_XPATH);
		UtilitiesCommon.click(HamleysAccountAddNewAddressEnum.HAMLEYS_ACCESS_ACCOUNT_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysAccountAddNewAddressEnum.HAMLEYS_SELECT_ADDRESSBOOK_XPATH);
		UtilitiesCommon.click(HamleysAccountAddNewAddressEnum.HAMLEYS_SELECT_ADDRESSBOOK_XPATH);
	}
     /**
	 * This method is used to Click on Add New Address for Fill the form.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysAddNewAddressForm() {
		UtilitiesCommon.waitForElementIsPresent(HamleysAccountAddNewAddressEnum.HAMLEYS_ADDNEWADDRESS_CSS);
		UtilitiesCommon.click(HamleysAccountAddNewAddressEnum.HAMLEYS_ADDNEWADDRESS_CSS);
		UtilitiesCommon.enterValue(HamleysAccountAddNewAddressEnum.HAMLEYS_SELECTFIRST_NAME_XPATH,
		UtilitiesCommon.getTestData("FirstName"));
		UtilitiesCommon.enterValue(HamleysAccountAddNewAddressEnum.HAMLEYS_SELECTLAST_NAME_XPATH,
		UtilitiesCommon.getTestData("LastName"));
		UtilitiesCommon.enterValue(HamleysAccountAddNewAddressEnum.HAMLEYS_SELECTPHONE_NUMBER_XPATH,
		UtilitiesCommon.getTestData("PhoneNumber"));
	}
	/**
	 * This method is used to enter value in street address.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysSelectStreetDetails() {
		UtilitiesCommon.enterValue(HamleysAccountAddNewAddressEnum.HAMLEYS_ENTER_STREETADDRESS_CSS,
		UtilitiesCommon.getTestData("StreetAddress"));
		UtilitiesCommon.enterValue(HamleysAccountAddNewAddressEnum.HAMLEYS_SELECT_CITYNAME_XPATH,
		UtilitiesCommon.getTestData("City"));
		UtilitiesCommon.enterValue(HamleysAccountAddNewAddressEnum.HAMLEYS_SELECT_ZIPCODE_XPATH,
		UtilitiesCommon.getTestData("ZipCode"));
		UtilitiesCommon.click(HamleysAccountAddNewAddressEnum.HAMLEYS_SUBMIT_ADDRESSBUTTON_CSS);
	}
	/**
	 * This method is used to delete the recently added address.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hamleysDeleteRecentlyAddedAddredd() {
		UtilitiesCommon.waitForElementIsPresent(HamleysAccountAddNewAddressEnum.HAMLEYS_DELETE_ADDRESS_XPATH);
		UtilitiesCommon.click(HamleysAccountAddNewAddressEnum.HAMLEYS_DELETE_ADDRESS_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysAccountAddNewAddressEnum.HAMLEYS_DELETE_ACCEPT_ALERT_CSS);
		UtilitiesCommon.click(HamleysAccountAddNewAddressEnum.HAMLEYS_DELETE_ACCEPT_ALERT_CSS);
		UtilitiesCommon.getElementText(HamleysAccountAddNewAddressEnum.HAMLEYS_GET_SUCCESS_DELETEMESSAGE_CSS);
	}
}
