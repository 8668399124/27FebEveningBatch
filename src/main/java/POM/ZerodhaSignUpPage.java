package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {

	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;	
    @FindBy(xpath="//input[@placeholder='Your 10 digit mobile number']")private WebElement number;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	
	public ZerodhaSignUpPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickInSignup() {
		signup.click();
	}
	public void enterMobileNumber (String MN) {
		number.sendKeys(MN);
	}
	public void ClickOnSubmit () {
		submit.click();
	}
	
}
