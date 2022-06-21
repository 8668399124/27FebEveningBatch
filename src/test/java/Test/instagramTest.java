package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Browser8;
import POM.instagramLoginPage;

@Listeners(TestListeners.class)


public class instagramTest {
	WebDriver driver;
	 @BeforeMethod
	 public void Openbrowser() {
	driver =Browser8.openbrowser();
	}
	  @Test 
	  public void SignInWithValidCredentials () throws InterruptedException {
		  instagramLoginPage insta = new instagramLoginPage(driver);
		  insta.EnteruserId();
		  insta.EnterPassword();
		  insta.ClickOnLogin();
		  
		 
}
	  @Test
	  public void LoginWithInvalidCredeintials () {
		  instagramLoginPage insta = new instagramLoginPage(driver);
		  insta.ClickOnLogin();
	  }
	  
	  
}