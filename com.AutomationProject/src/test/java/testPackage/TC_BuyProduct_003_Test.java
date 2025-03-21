package testPackage;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMPackage.CheckOutPage;
import POMPackage.ElectronicsPage;
import POMPackage.ShoppingCartPage;
import POMPackage.WelcomePage;
import genericLibrary.BaseTest;
@Listeners(genericLibrary.MyListener.class)

public class TC_BuyProduct_003_Test extends BaseTest {
	@Test
	public void buyProductMethod() throws EncryptedDocumentException, IOException {

		WelcomePage wp = new WelcomePage(driver);
		wp.getElectronicsLink().click();

		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		ep.getSmartphoneAddToCart().click();

		wp.getShoppingcartLink().click();

		ShoppingCartPage sp = new ShoppingCartPage(driver);

		sp.getSmartphoneCheckBox().click();
		sp.getTermsofservicescheckbox().click();;

		sp.getCheckoutButton().click();
		
		CheckOutPage cp = new CheckOutPage(driver);
		
		cp.buyProduct();
		
		
	}
}
		
		
		
		
		
		

	

