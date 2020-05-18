package wordPress_testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class wordPress_testNG {


  private AndroidDriver<MobileElement> driver;

  @BeforeMethod
public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("deviceName", "Android SDK built for x86");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "10");
    desiredCapabilities.setCapability("udid", "emulator-5554");
    desiredCapabilities.setCapability("appPackage", "org.wordpress.android");
    desiredCapabilities.setCapability("appActivity", "org.wordpress.android.ui.posts.PostsActivity");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
  }

  @Test(priority =1)
  public void sampleTest1() throws InterruptedException {
    MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
    el1.click();
    Thread.sleep(5000);
    MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.gms:id/credential_primary_label");
    el2.click();
    Thread.sleep(5000);
    MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/dismiss_button");
    el3.click();
    Thread.sleep(5000);
    MobileElement el4 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[3]");
    el4.click();
    Thread.sleep(5000);
    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Notification Settings");
    el5.click();
    Thread.sleep(5000);
    MobileElement el6 = (MobileElement) driver.findElementById("android:id/switch_widget");
    el6.click();
    Thread.sleep(5000);
    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
    el7.click();
    Thread.sleep(5000);
    MobileElement el8 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
    el8.click();
    Thread.sleep(5000);
    
    System.out.println("sampleTest1: Successfully disabled notifications on Pending Drafts");
  }
  
  @Test(priority = 2)
  public void sampleTest2() throws InterruptedException {
	MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
	el1.click();
	Thread.sleep(5000);
	MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.gms:id/credential_primary_label");
	el2.click();
	Thread.sleep(5000);
	MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/dismiss_button");
	el3.click();
	Thread.sleep(5000);
    MobileElement el4 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
    el4.click();
    Thread.sleep(5000);
    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("show more");
    el5.click();
    Thread.sleep(5000);
    MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");
    el6.click();
    Thread.sleep(5000);
    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("show more");
    el7.click();
    Thread.sleep(5000);
    MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");
    el8.click();
    
    System.out.println("sampleTest2: Successfully disabled notifications on Pending Drafts");
  }

  @AfterMethod
public void tearDown() {
    driver.quit();
  }
}
