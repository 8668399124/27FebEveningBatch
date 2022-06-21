package POM;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import com.google.common.cache.Weigher;

public class instagramLoginPage {
@FindBy(xpath="//input[@name='username']")private WebElement id;
@FindBy(xpath="//input[@aria-label='Password']")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement login;


  public instagramLoginPage (WebDriver driver) {
	PageFactory.initElements( driver,this);
}
   public void EnteruserId() {
	id.sendKeys("");
	}
   public void EnterPassword() {
	password.sendKeys("");

}
   public void ClickOnLogin() {
	    login.click();
}

   //WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));
	//wait.until(ExpectedConditions.visibilityOf(login));


}
