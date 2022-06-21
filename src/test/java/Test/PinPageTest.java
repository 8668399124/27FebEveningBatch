package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser7;


import POM.ZerodhaPinPage;
import POM.ZerodhaShareSearchPage;
import POM.zerodhaLoginPage;
import Utility.parameterization;

public class PinPageTest {
	WebDriver driver;
@BeforeMethod 
public void launchBrowser () {
	 driver =Browser7.openbrowser();
	}
 @Test
public void loginToZerodhawithPinTest () throws EncryptedDocumentException, IOException, InterruptedException {
	 zerodhaLoginPage zerodhaLogin = new zerodhaLoginPage(driver);
		String username=parameterization.getdata("IdandPw", 0, 1);
		String password=parameterization.getdata("IdandPw", 1, 1);	
			zerodhaLogin.enteruserid(username);
			zerodhaLogin.enterpassword(password);
			zerodhaLogin.clickOnlogin();
			
			ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage (driver);
			String pin = parameterization.getdata("IdandPw", 2, 1);
			zerodhaPinPage.enterPin(pin,driver);
			zerodhaPinPage.clickOnContinue();
			
			

			
			
 }		
 

}