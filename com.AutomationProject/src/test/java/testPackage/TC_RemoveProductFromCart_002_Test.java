package testPackage;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMPackage.ElectronicsPage;
import POMPackage.ShoppingCartPage;
import POMPackage.WelcomePage;
import genericLibrary.BaseTest;
@Listeners(genericLibrary.MyListener.class)

public class TC_RemoveProductFromCart_002_Test extends BaseTest
{
  @Test
  public void removeProductFromCart() {
	  
	  WelcomePage wp = new WelcomePage(driver);
		wp.getComputersLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		ep.getSmartphoneAddToCart().click();
		
		wp.getShoppingcartLink().click();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getSmartphoneCheckBox().click();
		
		sp.getUpdateShoppingCartButtons().click();
		 
		
		SoftAssert sa = new SoftAssert();
		try {
			sa.assertEquals(sp.getSmartphoneCartProduct().isDisplayed(),false,"Product is not removed from Cart");
			
		}
		catch(Exception e)
		{
			Reporter.log("Product is removed from cart",true);
		}
		sa.assertAll();
		
		
	  
  }
}
