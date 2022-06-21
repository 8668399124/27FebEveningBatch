package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.screenshot;

public class TestListeners extends BaseTest implements ITestListener{
   public void onTestStart(ITestResult result){
	   System.out.println("Test Has Satarted");
   }
   
   public void onTestFailure(ITestResult result) {
	   try {
		screenshot.Screen(driver, result.getName());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void onTestSuccess(ITestResult result) {
	   System.out.println(result.getName() + "test success");
   }
  public void onTestSkipped(ITestResult result)  {
	  System.out.println(result.getName() + "test skipped");
  }
   
   
}
