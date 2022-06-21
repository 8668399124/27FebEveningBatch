package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPasswordPage {
	@FindBy(xpath="//a[text() ='Forgot user ID or password?']") private WebElement forgot;
	@FindBy(xpath="//label[@for='radio-62']") private WebElement button1;
	@FindBy(xpath="//label[@for='radio-63']") private WebElement button2;
	@FindBy(xpath="//input[@placeholder='User ID']") private WebElement userId;
	@FindBy(xpath="//input[@placeholder='PAN']") private WebElement pan;
	@FindBy(xpath="//label[@for='radio-67']") private WebElement Ebutton3;
	@FindBy(xpath="//label[@for='radio-68']") private WebElement Sbutton;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']") private WebElement Email2;
	@FindBy(xpath="//input[@placeholder='Mobile number (as on account)']") private WebElement SMS2;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement Reset;
	
	public ZerodhaForgotPasswordPage (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void clickOnforgotpassword () {
		forgot.click();
	}
	public void clickOnbutton1() {
		button1.click();
	}
	public void clickOnbutton2 () {
		button2.click();
	}
	public void enterid (String number) {
		userId.sendKeys(number);
	}
	public void enterPancard (String value) {
		pan.sendKeys(value);
	}
	public void cilckOnbutton3 () {
		Ebutton3.click();
	}
	public void clickOnbutton4 () {
		Sbutton.click();
	}
	public void ClickOnretest () {
		Reset.click();
	}
	
	
}
