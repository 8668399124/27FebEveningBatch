package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement UserName;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement login;
	@FindBy(xpath="//a[text()='New to Flipkart? Create an account']")private WebElement NewAccount;
	@FindBy(xpath="//input[@title='Search for products, brands and more']")private WebElement search;
	@FindBy(xpath="//span[text()='Please enter valid Email ID/Mobile number']")private WebElement idError;
	public FlipkartLoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void EnteruserID() {
		UserName.sendKeys("8668399124");
	}
	public void EnterPassword () {
		password.sendKeys("241295");
	}
	
	public void ClickOnLogin() {
		login.click();
	}
public void newAccount() {
	NewAccount.click();

}
public void searchproduct() {
	search.sendKeys("laptop");
}
public String getErrorText() {
	String text =idError.getText();
	return text;
			
	}
	
	
	


}
