package appium.vivo;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class KaustubhTestng {
	
	private AndroidDriver<MobileElement> driver;
	
	@BeforeMethod
	
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "VIVO 1913");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "9");
	    desiredCapabilities.setCapability("udid", "962839dd");
	    desiredCapabilities.setCapability("appPackage", "org.wordpress.android");
	    desiredCapabilities.setCapability("appActivity", ".ui.posts.PostsActivity");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
	  }
	
	@Test
	
	  public void sampleTest() throws InterruptedException {
	    MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
	    el1.click();
	    Thread.sleep(5000);
	    MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_site_button_text");
	    el2.click();
	    Thread.sleep(5000);
	    MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el3.sendKeys("kaustubh.art.blog");
	    Thread.sleep(5000);
	    MobileElement el4 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el4.click();
	    Thread.sleep(5000);
	    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
	    el5.sendKeys("kaustubhshahane");
	    Thread.sleep(5000);
	    MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
	    el6.sendKeys("Kaustubh88$$");
	    Thread.sleep(5000);
	    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el7.click();
	    Thread.sleep(5000);
	    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el8.click();
	    Thread.sleep(5000);
	    MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_site_blog_posts_text_view");
	    el9.click();
	    Thread.sleep(5000);
	    MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Drafts");
	    el10.click();
	    Thread.sleep(5000);
	    MobileElement el11 = (MobileElement) driver.findElementById("org.wordpress.android:id/button");
	    el11.click();
	    Thread.sleep(5000);
	    MobileElement el12 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Post title. Empty\"]/android.widget.EditText");
	    el12.sendKeys("JUnit TestNG");
	    Thread.sleep(5000);
	    MobileElement el13 = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"block-list\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	    el13.sendKeys("This is my JUnit TestNG programme.");
	    Thread.sleep(10000);
	    MobileElement el14 = (MobileElement) driver.findElementById("org.wordpress.android:id/menu_primary_action");
	    el14.click();
	    Thread.sleep(10000);
	    MobileElement el15 = (MobileElement) driver.findElementById("android:id/button1");
	    el15.click();
	    Thread.sleep(10000);
	    MobileElement el16 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Published\"]/android.widget.TextView");
	    el16.click();
	    Thread.sleep(10000);
	    
	  }
	
	@AfterMethod
	
	  public void tearDown() {
	    driver.quit();
	  }
	
	
	

}
