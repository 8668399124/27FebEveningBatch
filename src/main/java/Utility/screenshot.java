package Utility;

    import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

//import POJO.Browser7;

     public class screenshot {
      public static void Screen (WebDriver driver,String filename) throws Exception {
    	 
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File ("D:\\programs\\KiteZerodha\\src\\test\\resources\\Screenshotproject\\"+filename+".png");
	
	FileHandler.copy(source, destination);
	
}
 public static String date() {
	 DateTimeFormatter dtf= DateTimeFormatter .ofPattern("yyyy-mm-dd HH-mm-ss");//format the time and date time as required
	 LocalDateTime currentTime =LocalDateTime.now();//return current time
	 String d=dtf.format(currentTime);//format the time given my now() method to required format and return string
	 return d;
 }
      
      
      
      
       
       
}
