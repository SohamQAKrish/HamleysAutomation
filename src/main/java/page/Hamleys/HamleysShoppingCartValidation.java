package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysShoppingCartValidationEnum;

/**
 * This method is used to verify HamleysShoppingCartValidation flow.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysShoppingCartValidation {
	/**
	 * This method is used add to product
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testAddItemToCart() {
		UtilitiesCommon.launchApplication();
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.HOMEPAGE_CLICK_CHRISTMAS_CATEGORIES_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysShoppingCartValidationEnum.SHOPTOYS_ADDTOCART_XPATH);
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.SHOPTOYS_ADDTOCART_XPATH);	
	}
	/**
	 * This method is used to access added product to the cart - Verify the item in the cart
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testAccessMiniCart() {
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.SELECT_MINI_CART_CSS);
		
	}
	/**
	 * This method is used to access added product to the cart - Verify the product name
	 * @author RShivam
	 * @param wait 
	 * @lastmodifiedby RShivam
	 */
	public static void verifyItemInTheCart() {
        UtilitiesCommon.getElementText(HamleysShoppingCartValidationEnum.MINICART_PRODUCTNAME_XPATH); 
	}		
	
	/**
	 * This method is used to access added product to the cart - Try to update the product qty more than in-stock
	 * @author RShivam
	 * @param wait 
	 * @lastmodifiedby RShivam
	 */
	public static void testUpdateProductQTYValidation() {
        UtilitiesCommon.enterValue(HamleysShoppingCartValidationEnum.UPDATE_PD_QTY_XPATH,
        UtilitiesCommon.getTestData("ProductQTY"));
        UtilitiesCommon.getElementText(HamleysShoppingCartValidationEnum.OUTSTOCK_ERROR_MESSAGE_XPATH);
        UtilitiesCommon.click(HamleysShoppingCartValidationEnum.OUTSTOCK_ERROR_POPUP_OK_XPATH);
	}		
}
