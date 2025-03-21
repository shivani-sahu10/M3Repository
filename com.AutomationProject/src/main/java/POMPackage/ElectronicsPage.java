package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	//Declaration
	@FindBy(partialLinkText = "cell phones") private WebElement cellPhoneLink;
	@FindBy(xpath = "//a[text()='smartphone']/../..//input[@value='Add to cart']") private WebElement smartphoneAddToCartButton;

	//INITIALIZATION
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization

	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}

	public WebElement getSmartphoneAddToCart() {
		return getSmartphoneAddToCart();
	}
	
	
	
}
