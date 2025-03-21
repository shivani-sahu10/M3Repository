package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//DECLARATION
	@FindBy(id="Email") private WebElement emailTB;
	@FindBy(id="Password") private WebElement passwordTB;
	@FindBy(xpath="//input[@value='Log in']") private WebElement LoginButton;
	@FindBy(id="RememberMe") private WebElement RememberMeCheckBox;
	@FindBy(linkText="Forgot Password") private WebElement ForgotPasswordLink;
	
	//INITIALIZATION
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//UTILIZATION

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getRememberMeCheckBox() {
		return RememberMeCheckBox;
	}

	public WebElement getRemeberMeLink() {
		return ForgotPasswordLink;
	}
	
	//Operational Methods/Business Login
	public void validLoginMethod(String email,String password)
	{
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		LoginButton.click();
	}
	
	public void invalidLoginMethod(String email,String password) throws InterruptedException
	{
		emailTB.sendKeys(email);
		passwordTB.sendKeys(password);
		LoginButton.click();
		Thread.sleep(1000);
		emailTB.clear();
		passwordTB.clear();
		
		
	}
	
	
	
	
	
	
	
}
