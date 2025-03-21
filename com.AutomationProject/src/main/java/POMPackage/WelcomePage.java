package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage{

     //DECLARATION
	@FindBy(id="Register") private WebElement RegisterLink;
	@FindBy(linkText="Log in") private WebElement loginLink;
	@FindBy(xpath="//spa[text()='Shopping cart']") private WebElement shoppingcartLink;
	@FindBy(xpath="//span[text()='Whislist']") private WebElement whislistLink ;
	@FindBy(partialLinkText="BOOKS") private WebElement booksLink;
	@FindBy(partialLinkText="COMPUTERS") private WebElement computersLink;
	@FindBy(partialLinkText="ELECTRONICS") private WebElement electronicsLink;
	@FindBy(linkText= "Log out") private WebElement LogOutlink;
	
	
	

	//INITIALIZATION
	public WelcomePage(WebDriver driver) {

	PageFactory.initElements(driver, this);
     }
	
	//UTILIZATION
	public WebElement getLogOutlink() {
		return LogOutlink;
	}
	

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWhislistLink() {
		return whislistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	
	//operational Method
	public void logOut() {
		LogOutlink.click();
	}
	}


