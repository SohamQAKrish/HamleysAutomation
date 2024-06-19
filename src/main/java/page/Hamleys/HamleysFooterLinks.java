package page.Hamleys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.UtilitiesCommon;
import enums.Hamleys.HamleysFooterEnum;

public class HamleysFooterLinks {


//	  public static void clickAcceptButton() {
//	        WebDriver driver = null;
//	        try {
//	            System.out.println("Trying to find and click the ACCEPT button.");
//
//	            // Initialize WebDriver
//	            UtilitiesCommon.getDriver();
//	            // Handle the popup if it appears
//	            handlePopup(driver);
//
//	            // Find the shadow host element
//	            WebElement shadowHost = findShadowHost(driver);
//
//	            if (shadowHost == null) {
//	                System.err.println("Failed to find shadow host element.");
//	                return;
//	            }
//
//	            // Execute JavaScript to find the ACCEPT button within the shadow DOM
//	            WebElement acceptButton = findAcceptButtonInShadowDom(driver, shadowHost);
//
//	            if (acceptButton != null) {
//	                acceptButton.click();
//	                System.out.println("Clicked on the ACCEPT button successfully.");
//	            } else {
//	                System.err.println("Failed to find or click on the ACCEPT button.");
//	            }
//
//	        } catch (Exception e) {
//	            System.err.println("Failed to click on the ACCEPT button. Error: " + e.getMessage());
//	        } finally {
//	            if (driver != null) {
//	                driver.quit();
//	            }
//	        }
//	    }
//      private static void handlePopup(WebDriver driver) {
//          // Implement your logic to handle the popup here
//          // Use driver.findElement to find and interact with the popup element
//          try {
//              WebElement popup = driver.findElement(By.xpath("//button[@role='button' and @data-testid='uc-accept-all-button' and text()='ACCEPT']"));
//              if (popup.isDisplayed()) {
//                  popup.click();
//                  System.out.println("Handled the popup.");
//              }
//          } catch (Exception e) {
//              System.out.println("Popup not found. Proceeding without handling.");
//          }
//      }
//
//      private static WebElement findShadowHost(WebDriver driver) {
//          try {
//              // Execute JavaScript to find the shadow host element
//              return (WebElement) ((JavascriptExecutor) driver)
//                      .executeScript("return document.querySelector('div#usercentrics-root')");
//          } catch (Exception e) {
//              System.err.println("Error finding shadow host: " + e.getMessage());
//              return null;
//          }
//      }
//
//      private static WebElement findAcceptButtonInShadowDom(WebDriver driver, WebElement shadowHost) {
//          try {
//              // Execute JavaScript to find the ACCEPT button within the shadow DOM
//              return (WebElement) ((JavascriptExecutor) driver)
//                      .executeScript("return arguments[0].shadowRoot.querySelector('button[data-testid=\"uc-accept-all-button\"]')", shadowHost);
//          } catch (Exception e) {
//              System.err.println("Error finding ACCEPT button in shadow DOM: " + e.getMessage());
//              return null;
//          }
//      }
//  

	   
	public static void clickAndVerifyFooterLinks() {
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.scrolltillpageend();
		UtilitiesCommon.waitForElementIsPresent(HamleysFooterEnum.HAMLEYS_FOOTER_LINKS_XPATH);
		List<WebElement> footerElements = UtilitiesCommon.getDriver()
				.findElements(By.xpath(HamleysFooterEnum.HAMLEYS_FOOTER_LINKS_XPATH.toString() + "//a"));
		System.out.println("Number of footer links: " + footerElements.size());
		for (int i = 0; i < footerElements.size(); i++) {
			WebElement footerElement = footerElements.get(i);
			String linkText1 = footerElement.getText().trim();
			footerElement.click();
//			UtilitiesCommon.waitForPageLoad();
			String pageTitle = UtilitiesCommon.gettitle();
			if (pageTitle.contains("404")) {
				assertTrue(false, "Link '" + linkText1 + "' navigated to a 404 page");
			} else {
				assertTrue(true, "Link '" + linkText1 + "' navigated successfully to: " + pageTitle);
			}
			UtilitiesCommon.getDriver().navigate().back();
			UtilitiesCommon.waitForElementIsVisible(By.xpath(HamleysFooterEnum.HAMLEYS_FOOTER_LINKS_XPATH.toString()));
			footerElements = UtilitiesCommon.getDriver()
					.findElements(By.xpath(HamleysFooterEnum.HAMLEYS_FOOTER_LINKS_XPATH.toString() + "//a"));
		}
	}
	public static void footerFBLinkCheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(3000);
		//UtilitiesCommon.scrolltillpageend();
	//	UtilitiesCommon.setupWebdriverWait();
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.click(HamleysFooterEnum.HAMLEYS_FOOTER_FB_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		UtilitiesCommon.waitForMilliseconds(3000);
		assertEquals(UtilitiesCommon.gettitle(), "Hamleys | Facebook");
	}
	 public static void footerInstaLinkCheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(2000);
		//UtilitiesCommon.scrolltillpageend();
		//UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.click(HamleysFooterEnum.HAMLEYS_FOOTER_INSTA_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		assertEquals(UtilitiesCommon.gettitle(),"Page couldn't load • Instagram");
	}
	public static void footerYoutubeLinkCheck() throws InterruptedException {
		UtilitiesCommon.waitForMilliseconds(2000);
		//UtilitiesCommon.scrolltillpageend();
	//	UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.waitForMilliseconds(2000);
		UtilitiesCommon.click(HamleysFooterEnum.HAMLEYS_FOOTER_YOUTUBE_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		UtilitiesCommon.switchtoTab(1);
		assertEquals(UtilitiesCommon.gettitle(),"Hamleys - YouTube");
	}
	
	public static void footerPrivacyPolicyLinkCheck(){
		UtilitiesCommon.waitForMilliseconds(3000);
		//UtilitiesCommon.scrolltillpageend();
	//	UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.click(HamleysFooterEnum.HAMLEYS_FOOTER_PRIVACY_POLICY_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		assertEquals(UtilitiesCommon.gettitle(), "Privacy and Cookie Policy");
	}
	
	public static void footerTermsAndConditionsLinkCheck(){
		UtilitiesCommon.waitForMilliseconds(3000);
		//UtilitiesCommon.scrolltillpageend();
		//UtilitiesCommon.setupWebdriverWait(30);
		UtilitiesCommon.click(HamleysFooterEnum.HAMLEYS_FOOTER_TERMS_XPATH);
		UtilitiesCommon.waitForMilliseconds(3000);
		assertEquals(UtilitiesCommon.gettitle(), "Terms and Conditions");
	}
}