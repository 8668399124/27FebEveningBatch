package POJO;

  import java.util.concurrent.TimeUnit;

//       import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
         import org.openqa.selenium.chrome.ChromeDriver;

       public class Browser8 {
	   public static WebDriver openbrowser () {
		
		 System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver ();//upcasting chrome driver to webdriver
		 
		 driver.get("https://www.flipkart.com/");
		 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		 return driver;
}
}