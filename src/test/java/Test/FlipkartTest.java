package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Browser8;
import POM.FlipkartLoginPage;
import Utility.screenshot;

public class FlipkartTest {

	@Listeners(TestListeners.class)


	public class flipkartTest {
		WebDriver driver;
		 @BeforeMethod
		 public void Openbrowser() {
		driver =Browser8.openbrowser();
		}
		
		 @Test 
		 public void LoginWithValidData() throws Exception {
			 FlipkartLoginPage flip = new FlipkartLoginPage (driver);
			 flip.EnteruserID();
			 flip.EnterPassword();
			 flip.ClickOnLogin();
			 screenshot.Screen(driver, " idError");
			 flip.searchproduct();
		 }
	@Test
   public void loginwithId() {
		 FlipkartLoginPage flip = new FlipkartLoginPage (driver);
		 flip.EnteruserID();
		 flip.ClickOnLogin();
   }
	@Test
	public void loginwithoutdata() {
		FlipkartLoginPage flip = new FlipkartLoginPage (driver);
		 flip.EnteruserID();
		 flip.EnterPassword();
	     flip.ClickOnLogin();
		 
		 String text=flip.getErrorText();
		 String expectedText= "Please enter valid Email ";
		 
		 SoftAssert softAssert =new SoftAssert ();
		    softAssert.assertEquals(text, expectedText);
		
		// Assert.assertEquals(text, expectedText);
		 softAssert.assertAll();
	}
	
	
	
	
	
	}
	
}
