package page.Hamleys;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysMainMenuNavigationEnum;
/**
 * This class will contain all the Main Menu Navigation methods
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysMainMenuNavigationPage {
	/**
	 * This method is used to click and verify the Shop Category.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickOnShopCategoryLink() {
		UtilitiesCommon.waitForMilliseconds(6000);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMLEYS_GUEST_ACCEPT_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMLEYS_SHOP_CATEGORY_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_SHOP_TITLE_TEXT_XPATH);
		UtilitiesCommon.getElementText(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_SHOP_TITLE_TEXT_XPATH);
	}
	/**
	 * This method is used to click the Christmas Category and verify title text.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickOnChristmasCategoryLink(){
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_CHRISTMAS_CATEGORY_XPATH);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_CHRISTMAS_CATEGORY_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_CHRISMAS_TITLE_TEXT_XPATH);
		UtilitiesCommon.getElementText(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_CHRISMAS_TITLE_TEXT_XPATH);		
	}
	/**
	 * This method is used to click the By Age Test Category and verify category title text.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickOnByAgeTestCategoryLink(){
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMELYS_BYAGETEST_CATEGORY_XPATH);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMELYS_BYAGETEST_CATEGORY_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_BYAGETEST_TEXT_XPATH);
		UtilitiesCommon.getElementText(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_BYAGETEST_TEXT_XPATH);		
	}
	/**
	 * This method is used to click on By brand category and verify the title text.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickOnByBrandCategoryLink(){
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_BYBRAND_CATEGORY_XPATH);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMLEYS_BYBRAND_CATEGORY_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_BYBRAND_TEXT_XPATH);
		UtilitiesCommon.getElementText(HamleysMainMenuNavigationEnum.HAMLEYS_VERIFY_BYBRAND_TEXT_XPATH);
	}
	/**
	 * This method is used to click on Black Friday category and verify the Black Friday title text.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickBlackFridayCategoryLink(){	
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_BLACKFRIDAY_CATEGORY_XPATH);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMLEYS_BLACKFRIDAY_CATEGORY_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_BLACKFRIDAY_CATEGORY_TITLE_TEXT_XPATH);
		UtilitiesCommon.getElementText(HamleysMainMenuNavigationEnum.HAMLEYS_BLACKFRIDAY_CATEGORY_TITLE_TEXT_XPATH);
	}
	/**
	 * This method is used to click on Gaming category and verify the Gaming title text.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void clickGamingCategoryLink(){
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_GAMING_CATEGORY_XPATH);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMLEYS_GAMING_CATEGORY_XPATH);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_GAMING_CATGORY_TEXT_XPATH);
		UtilitiesCommon.getElementText(HamleysMainMenuNavigationEnum.HAMLEYS_GAMING_CATGORY_TEXT_XPATH);
	}	
}