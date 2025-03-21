package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	//DECLARATION
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@tittle = 'show details for Smartphone']")
	private  WebElement smartphoneCartProduct;
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title = 'show details for smartphone']/../..//input[@name = 'removefromcart']")
    private WebElement smartphoneCheckBox;
	@FindBy(name = "updateCart")
	private WebElement updateShoppingCartButtons;
	@FindBy(name = "continueShopping") 
	private WebElement continueShoppingButton;
	@FindBy(id = "termsofservice")
	private WebElement termsofservicescheckbox;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	
	//initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getSmartphoneCartProduct() {
		return smartphoneCartProduct;
	

	}

	public WebElement getSmartphoneCheckBox() {
		return smartphoneCheckBox;
	}

	public WebElement getUpdateShoppingCartButtons() {
		return updateShoppingCartButtons;
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public WebElement getTermsofservicescheckbox() {
		return termsofservicescheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	
	}
	

	
