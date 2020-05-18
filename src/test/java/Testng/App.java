package Testng.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App {
	

  private AndroidDriver driver;

  @BeforeMethod
public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("deviceName", "honor 9i");
    desiredCapabilities.setCapability("udid", "G9UDU18205006729");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "8.0.0");
    desiredCapabilities.setCapability("automationName", "UiAutomator1");
    desiredCapabilities.setCapability("appPackage", "com.wt.apkinfo");
    desiredCapabilities.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() throws Exception {
	  
	  Thread.sleep(5000);
	  
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


  }

	
@AfterMethod
public void tearDown() {
    driver.quit();
  }
}


