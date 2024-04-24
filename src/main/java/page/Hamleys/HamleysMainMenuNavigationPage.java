package page.Hamleys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.UtilitiesCommon;
import enums.Hamleys.HamleysMainMenuNavigationEnum;

/**
 * This class will contain all the Main Menu Navigation methods
 * 
 * @author RShivam
 * @lastmodifiedby RShivam
 */
public class HamleysMainMenuNavigationPage {
	/**
	 * This method is used to click and verify main menu all category links
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void verifyMainMenuCategoryLinks() {
		UtilitiesCommon.waitForMilliseconds(6000);
		UtilitiesCommon.click(HamleysMainMenuNavigationEnum.HAMLEYS_GUEST_ACCEPT_XPATH);
		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_MAINMENU_ALL_CATEGORY_XAPATH);
		WebElement categorypanel = UtilitiesCommon.getElement(HamleysMainMenuNavigationEnum.HAMLEYS_MAINMENU_ALL_CATEGORY_XAPATH);
		List<WebElement> elements = categorypanel.findElements(By.tagName("a"));
		for (int i = 0; i < elements.size(); i++) {
		    String categorylinktitle = elements.get(i).getText();
		    System.out.println("link text: " + categorylinktitle);
		    elements.get(i).click();
		    UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_SHOP_CATEGORY_CSS);
			UtilitiesCommon.softAssertText(HamleysMainMenuNavigationEnum.HAMLEYS_SHOP_CATEGORY_CSS, categorylinktitle);			
			UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_MAINMENU_ALL_CATEGORY_XAPATH);
			categorypanel = UtilitiesCommon.getElement(HamleysMainMenuNavigationEnum.HAMLEYS_MAINMENU_ALL_CATEGORY_XAPATH);
			elements = categorypanel.findElements(By.tagName("a"));
		}
	}
	/**
	 * This method is used to hover over the Shop Category.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void hoverOverShopCategory(){
		UtilitiesCommon.waitForMilliseconds(6000);
		UtilitiesCommon.waitForElementIsPresent(HamleysMainMenuNavigationEnum.HAMLEYS_SHOP_CATEGORY_CSS);
		UtilitiesCommon.hoverOverElement(HamleysMainMenuNavigationEnum.HAMLEYS_SHOP_CATEGORY_CSS);
	}
}