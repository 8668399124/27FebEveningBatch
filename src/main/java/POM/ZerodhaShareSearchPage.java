package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaShareSearchPage {
	@FindBy(xpath = "//input[@type='text']")private WebElement Search;
	@FindBy(xpath="(//span[@class='tradingsymbol'])[1]")private WebElement TATA;
	@FindBy(xpath ="(//button[@type=\"button\"])[1]")private WebElement Buy;
	@FindBy(xpath="(//label[@class='su-radio-label'])[5]")private WebElement NSE;
	@FindBy(xpath="(//label[@class='su-radio-label'])[10]")private WebElement MIS;
	@FindBy(xpath="//input[@label='Qty.']")private WebElement quantity;
	@FindBy(xpath="(//label[@class='su-radio-label'])[12]")private WebElement market;
	@FindBy(xpath="//button[@type='submit']")private WebElement sharebuy;
	public ZerodhaShareSearchPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterShare(String share) {
		Search.click();
		Search.sendKeys(share);
	}
	public void ClickByButtonShare(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(TATA).perform();
		a.moveToElement(Buy);
		a.click();
		a.perform();
	}
	public void clickOnNSE() {
	NSE.click();
	}
	
	public void clickOnMIS() {
		MIS.click();
	}
	public void enterQuantity() {
		quantity.sendKeys("20");
	}
	public void selectMarket() {
		market.click();
	}
	public void buyShare() {
		sharebuy.click();
	}
	
	
}
