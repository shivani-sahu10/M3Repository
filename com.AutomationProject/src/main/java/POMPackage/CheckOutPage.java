package POMPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseTest;
import genericLibrary.Flib;
import genericLibrary.IAutoConstant;
import genericLibrary.SelectUtility;

public class CheckOutPage extends BaseTest implements IAutoConstant {
  
 
	  
	  @FindBy(id = "BillingNewAddress_FirstName") private WebElement FirstNameTextBox;
	  @FindBy(id = "BillingNewAddress_LastName") private WebElement LastNameTextBox;
	  @FindBy(id= "BillingNewAddress.CountryId")  private WebElement countryDD; 
	  @FindBy(id="BillingNewAddress_City") private WebElement cityTB;
      @FindBy(id ="BillingNewAddress_Address1") private WebElement address1TB;
      @FindBy(id ="BillingNewAddress_ZipPostalCode")private WebElement pincodeTB;
      @FindBy(id ="BillingNewAddress_PhoneNumber")private WebElement phoneNoTB;
      @FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
      @FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement ShippingAddressContinueButton;
      @FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement ShippingMethodContinueButton;
      @FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement PaymentMethodContinueButton;
      @FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
      @FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderConfirmButton;
      @FindBy(xpath= "//strong[text()='Your order has been successfully processed!']") private WebElement orderProcessedText;
      @FindBy(id="billing-address-select") private WebElement billingAddressOldAddressDD;
      
      
      //Initialization
      public CheckOutPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver,this);
      }
      
      //operational Methods
      public WebElement getFirstNameTextBox() {
		return FirstNameTextBox;
	}
 //Utilization
	public WebElement getLastNameTextBox() {
		return LastNameTextBox;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPincodeTb() {
		return pincodeTB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressContinueButton() {
		return ShippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return ShippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return PaymentMethodContinueButton;
	}

	public WebElement getPaymentInfoConfirmButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderConfirmButton() {
		return confirmOrderConfirmButton;
	}

	public WebElement getOrderProcessedText() {
		return orderProcessedText;
	}
	
public WebElement getBillingAddressOldAddressDD() {
		return billingAddressOldAddressDD;
	}

	public void buyProduct() throws EncryptedDocumentException, IOException {
    	  SelectUtility su = new SelectUtility();
    	  try
    	  {
    		   if(billingAddressOldAddressDD.isDisplayed()==true)
    		    {
    		  su.SelectByVisibleTextMethod(billingAddressOldAddressDD, "New Address");
    	  }
    	  }
    	  catch(Exception e)
    	  {
    		  su.SelectByVisibleTextMethod(countryDD, "India"); 
    	  }
    	   su.SelectByVisibleTextMethod(countryDD, "India");
    	 
            Flib flib = new Flib();
    	  int rn =  flib.randomNumber();
    	  String city = flib.readExcelData(EXCEL_PATH_MAIN,"buyproductdetails", 1, 0);
    	  String address1 = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 1);
    	 long pin = flib.readExcelData1(EXCEL_PATH_MAIN,"buyproductdetails",1,2);
    	 long phone = flib.readExcelData1(EXCEL_PATH_MAIN, "buyproductdetails",1,3);
    	  //String pin =flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 2);
    	 // String phone = flib.readExcelData(EXCEL_PATH_MAIN, "buyproductdetails", 1, 3);
    	  
    	  String phoneNo = phone+""+rn;
    	  
    	  cityTB.sendKeys(city);
    	  address1TB.sendKeys(address1);
    	  pincodeTB.sendKeys(String.valueOf(pin));
    	  phoneNoTB.sendKeys(String.valueOf(phoneNo));
    	  billingAddressContinueButton.click();
    	  
    	  ShippingAddressContinueButton.click();
    	  ShippingMethodContinueButton.click();
    	  paymentInfoContinueButton.click();
    	  confirmOrderConfirmButton.click();
    	  
    	  SoftAssert sa = new SoftAssert();
    	  sa.assertEquals(orderProcessedText.isDisplayed(), true,"order is not placed!");
    	  
    	  sa.assertAll();
	}
}
    	 
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      
      

