package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhaLoginPage {

	@FindBy(xpath="//input[@id='userid']")private WebElement userid ;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text() ='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//a[text() =\"Don't have an account? Signup now!\"]")private WebElement signup;
	@FindBy(xpath="(//span[@class='su-message'])[1]")private WebElement userError;
	public zerodhaLoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enteruserid(String user) {
		userid.sendKeys(user);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnlogin () {
		login.click();
	}
	public void clickOnforgotpassword () {
		forgot.click();
	}
	public void clickOnsignup () {
		signup.click();
	}
	public String getErrorText() {
	String text =userError.getText();
	return text;
			
	}
	
	
	
	
	
	
	
	
	
}
