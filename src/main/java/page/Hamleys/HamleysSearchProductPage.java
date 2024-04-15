package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysSearchProductToEnum;

/**
 * This method is used to verify Search product flow.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysSearchProductPage {
	/**
	 * This method is used enter text in search bar.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testEnterTextSearchBar() {
		UtilitiesCommon.click(HamleysSearchProductToEnum.HAMLEYS_SEARCH_ACCEPT_XPATH);
		UtilitiesCommon.enterValue(HamleysSearchProductToEnum.HAMELEYS_ENTERTEXTINSERCH_CSS, UtilitiesCommon.getTestData("SearchText"));
	}
	/**
	 * This method is used Select Product from Search List.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testSelectProductFromSearchList() {
		UtilitiesCommon.click(HamleysSearchProductToEnum.HAMLEYS_SELECTPRODUCT_FROM_SEACHSUGGESTION_LIST_XPATH);
		String actualTitle = UtilitiesCommon.getTestData("ProductTitle");
		String expectedTitle = "Hamleys Bear Dinosaur Hat";
		if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page title verification successful!");
        } else {
            System.out.println("Page title verification failed!");
            System.out.println("Actual Title: " + actualTitle);
        }	
	}
	/**
	 * This method is used Click on Add To Cart.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testAddToCart() {
		UtilitiesCommon.waitForElementIsPresent(HamleysSearchProductToEnum.HAMELYS_SEARCHPRODUCT_ADD_TO_CART_CSS);
		UtilitiesCommon.click(HamleysSearchProductToEnum.HAMELYS_SEARCHPRODUCT_ADD_TO_CART_CSS);
	}
}
