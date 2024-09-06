package sanity.hamleys;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.Hamleys.HamleysShoppingCartValidation;
/**
 * This class will contain all Sanity tests related to Shopping cart validation. 
 * @author RShivam
 * @lastmodifiedby RShivam
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanityHamleysShoppingCartValidation {
	/**
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify Shopping Cart Validation")
	@Description("This Test is used to adding the the product to cart or other validations")
	public void testAddItemToCartValidation() {
		HamleysShoppingCartValidation.testAddItemToCart();
		HamleysShoppingCartValidation.testAccessMiniCart();
		HamleysShoppingCartValidation.verifyItemInTheCart();
		HamleysShoppingCartValidation.testUpdateProductQTYValidation();
	}
}

