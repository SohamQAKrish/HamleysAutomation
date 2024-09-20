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
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.HOMEPAGE_CLICK_CHRISTMAS_CATEGORIES_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.waitForElementIsPresent(HamleysShoppingCartValidationEnum.LASERBATTELEHOUSE_ADDTOCART_XPATH);
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.LASERBATTELEHOUSE_ADDTOCART_XPATH);	
	}
	/**
	 * This method is used to access added product to the cart - Verify the item in the cart
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void testAccessMiniCart() {
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.SELECT_MINI_CART_CSS);
		UtilitiesCommon.getElementText(HamleysShoppingCartValidationEnum.MINICART_PRODUCTNAME_XPATH); 		
	}	
	/**
	 * This method is used to access added product to the cart - Try to update the product qty.
	 * @author RShivam
	 * @param wait 
	 * @lastmodifiedby RShivam
	 */
	public static void testUpdateProductQTYValidation() {
        UtilitiesCommon.enterValue(HamleysShoppingCartValidationEnum.UPDATE_PD_QTY_XPATH,
        UtilitiesCommon.getTestData("UpdateProductQTY"));
        UtilitiesCommon.click(HamleysShoppingCartValidationEnum.OUTSIDE_XPATH);
        UtilitiesCommon.waitForElementIsPresent(HamleysShoppingCartValidationEnum.LOADERONCARTUPDATE_XPATH);
	}	
	/**
	 * This method is used to access added product to the cart - Try to update remove the product QTY.
	 * @author RShivam
	 * @param wait 
	 * @lastmodifiedby RShivam
	 */
	public static void testRemoveProductQTY() {
		UtilitiesCommon.enterValue(HamleysShoppingCartValidationEnum.UPDATE_PD_QTY_XPATH,
		UtilitiesCommon.getTestData("RemoveProductQTY"));
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.OUTSIDE_XPATH);	
		UtilitiesCommon.waitForElementIsPresent(HamleysShoppingCartValidationEnum.LOADERONCARTUPDATE_XPATH);
	}
	/**
	 * This method is used to enter invalid coupon code on cart screen
	 * @author RShivam
	 * @param wait 
	 * @lastmodifiedby RShivam
	 */
	public static void testInValidCouponCode() {
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.APPLY_COUPONCODE_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysShoppingCartValidationEnum.ENTER_CODE_XPATH);
		UtilitiesCommon.enterValue(HamleysShoppingCartValidationEnum.ENTER_CODE_XPATH,
		UtilitiesCommon.getTestData("InvalidCouponCode"));
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.ClICKON_APPLY_BUTTON_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysShoppingCartValidationEnum.GETINVALIDMESSAGE_COUPONCODE_CSS);
		UtilitiesCommon.getElementText(HamleysShoppingCartValidationEnum.GETINVALIDMESSAGE_COUPONCODE_CSS);		
	}
	/**
	 * This method is used to remove all product from cart and verified empty cart text
	 * @author RShivam
	 * @param wait 
	 * @lastmodifiedby RShivam
	 */
	public static void testEmptyCart() {
		UtilitiesCommon.waitForElementIsPresent(HamleysShoppingCartValidationEnum.REMOVEPRODUCTFROMCART_CSS);
		UtilitiesCommon.click(HamleysShoppingCartValidationEnum.REMOVEPRODUCTFROMCART_CSS);	
		UtilitiesCommon.getElementText(HamleysShoppingCartValidationEnum.GETTEXT_EMPTYCART_SCREEN_XPATH);
	}
}