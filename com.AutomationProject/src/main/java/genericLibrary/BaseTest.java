package genericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMPackage.LoginPage;
import POMPackage.WelcomePage;

public class BaseTest implements IAutoConstant {
	
	
	 protected static WebDriver driver;
	@BeforeClass
	public void browserSetUp() throws IOException {
		
		Flib flib = new Flib();
		String browservalue = flib.readPropertydata(PROP_PATH_MAIN, "browser2");
		String url = flib.readPropertydata(PROP_PATH_MAIN,URL);
		
		if(browservalue.equalsIgnoreCase("chrome")) {
			driver = new  ChromeDriver();
		}
		else if(browservalue.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browservalue.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enter valid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void validLogin() throws EncryptedDocumentException, IOException {
		
	WelcomePage wp	= new WelcomePage(driver);
	wp.getLoginLink().click();
	
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String email =flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINCREDS, 1, 0);
		String password =flib.readExcelData(EXCEL_PATH_MAIN, VALIDLOGINCREDS, 1, 1);
		lp.validLoginMethod(email, password);
		
	}
	@AfterMethod
	public void logout() {
		 WelcomePage wp =new WelcomePage(driver);
		 wp.logOut();
	}
	
	
	@AfterClass
	public void browserTearDown(){
		driver.quit();
	}
}
		
		
			
			
		
