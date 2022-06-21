package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POJO.Browser7;
import POM.zerodhaLoginPage;
import Utility.Reports;
import Utility.parameterization;

@Listeners(TestListeners.class)

 public class LoginPageTest extends BaseTest {
	ExtentReports reports;
	ExtentTest test;
   @BeforeTest
	public void extentReports() {
	reports= Reports.createReport();
   }
	
    @BeforeMethod
      public void browser() {
	  driver =Browser7.openbrowser();
}
	
	@Test 
	public void loginwithValidCredentials () throws EncryptedDocumentException, IOException {
	test=reports.createTest("loginwithValidCredentials");
		zerodhaLoginPage zerodhaLogin = new zerodhaLoginPage(driver);
	    String username=parameterization.getdata("IdandPw", 0, 1);
	    String password=parameterization.getdata("IdandPw", 1, 1);	
		zerodhaLogin.enteruserid(username);
		zerodhaLogin.enterpassword(password);
		zerodhaLogin.clickOnlogin();
		}
	
	@Test
	public void forgotpasswordlinkTest() {
	test=reports.createTest("forgotpasswordlinkTest");
		zerodhaLoginPage zerodhaLogin = new zerodhaLoginPage(driver);
		zerodhaLogin.clickOnforgotpassword();
	}
	@Test(dependsOnMethods= {"clickOnLoginWithoutDataTest"})
	public void signupLinkTest () {
		test=reports.createTest("forgotpasswordlinkTest");
		zerodhaLoginPage zerodhaLogin = new zerodhaLoginPage(driver);
        zerodhaLogin.clickOnsignup();
		
	}
	@Test
	public void clickOnLoginWithoutDataTest () throws EncryptedDocumentException, IOException {
		test=reports.createTest("forgotpasswordlinkTest");
		zerodhaLoginPage zerodhaLogin = new zerodhaLoginPage(driver);
		zerodhaLogin.clickOnlogin();
	    String text= zerodhaLogin.getErrorText();
	    String expectedText = "user Id should be minimum 6 charecters";
        //Assert.assertEquals(text, expectedText);
	    SoftAssert softAssert =new SoftAssert ();
	    softAssert.assertEquals(text, expectedText);
	
	    String username=parameterization.getdata("IdandPw", 0, 1);
	    String password=parameterization.getdata("IdandPw", 1, 1);	
		zerodhaLogin.enteruserid(username);
		zerodhaLogin.enterpassword(password);
		zerodhaLogin.clickOnlogin();

	    softAssert.assertAll();
	}
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
	}
	@AfterTest
	public void flushResult() {
		reports.flush();
	}
	
	
	
	
	
	}
