package TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ApkAppInfo {
	
	static AndroidDriver<MobileElement> driver;
	
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("noReset", "true");
		cap.setCapability("fullReset", "false");
		cap.setCapability("no",true);
		//cap.setCapability("newCommandTimeout", 100000);
        cap.setCapability("deviceName", "OPPO F15");
        cap.setCapability("udid", "MBIN79RCUSHMV4PJ");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9");
       
        cap.setCapability("automationName", "UiAutomator1");
       
        cap.setCapability("appPackage", "com.wt.apkinfo");
        cap.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");
        
        URL ur=new URL("http://127.0.0.1:4723/wd/hub");
        
        driver=new AndroidDriver<MobileElement>(ur,cap);
	}
	
	
	@Test
	public void main() throws MalformedURLException {
		
        System.out.print("Application Running");
	
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Search");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.wt.apkinfo:id/searchEdit");
        el2.sendKeys("AirDroid");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Applications list\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]");
        el3.click();

        
        
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Share");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el5.click();
        
        
        
        MobileElement el31 = (MobileElement) driver.findElementByAccessibilityId("System Details");
        el31.click();
        MobileElement el41 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        el41.click();

        
        (new TouchAction(driver))
		  .press(PointOption.point(807,671))
		  .moveTo(PointOption.point(750,608))
		  .release()
		  .perform();
        
        MobileElement el51 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el51.click();
       
            
          MobileElement el42 = (MobileElement) driver.findElementByAccessibilityId("Back");
          el42.click();
        
	}
	
	@AfterTest
	public void test2() {		
		
		MobileElement el2 = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Applications list\"]/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView[1]");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Back");
		el3.click();

		System.out.print("Application Done");
		
		
	}

}
