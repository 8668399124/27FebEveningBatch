package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser7;
import POM.ZerodhaPinPage;
import POM.ZerodhaShareSearchPage;
import POM.zerodhaLoginPage;
import Utility.parameterization;
import Utility.screenshot;

public class KiteShareSerarchPageTest {
WebDriver driver;
@BeforeMethod 
public void LaunchBrowser() {
	driver=Browser7.openbrowser();
}

@Test
    public void kitesearch () throws Exception {
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
			
			ZerodhaShareSearchPage zerodhashareSearchPage= new ZerodhaShareSearchPage (driver);
			String sharename = parameterization.getdata("IdandPw", 3, 1);
			System.out.println(sharename);
			
			
			zerodhashareSearchPage.enterShare(sharename);
			zerodhashareSearchPage.ClickByButtonShare(driver);
			zerodhashareSearchPage.clickOnNSE();
			zerodhashareSearchPage.clickOnMIS();
			//Thread.sleep(2000);
			//screenshot.Screen(driver, "number of share");
			//zerodhashareSearchPage.enterQuantity();
		//	screenshot.Screen(driver, "buy share");
			zerodhashareSearchPage.buyShare();
}		    
			
	
	
	
	
	
	
}
