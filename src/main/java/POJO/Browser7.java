package POJO;

     import java.util.concurrent.TimeUnit;

     import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

     public class Browser7 {
    	 
	 public static WebDriver openbrowser () {
		 ChromeOptions options = new ChromeOptions();//class of Selenium
		 
	     options.addArguments("--disable-notifications");
	     options.addArguments("--headless");
		 
         System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");

	     WebDriver driver = new ChromeDriver ();//upcasting chrome driver to webdriver
	 
	      driver.get("https://kite.zerodha.com/");
	 
	       driver.manage().window().maximize();
	      //driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	 
	      return driver;
	
	
	
	}
}
