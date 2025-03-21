package testPackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import POMPackage.ElectronicsPage;
import POMPackage.ShoppingCartPage;
import POMPackage.WelcomePage;
import genericLibrary.BaseTest;
@Listeners(genericLibrary.MyListener.class)

public class TC_AddToCart_001_Test  extends BaseTest{
	@Test
	
	public void addToCartMethod() {
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getComputersLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		ep.getSmartphoneAddToCart().click();
		
		wp.getShoppingcartLink().click();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(),true,"Product is not added to cart");
		sa.assertAll();
		
	}

		
		
		
		
		
		
	}
  
	


