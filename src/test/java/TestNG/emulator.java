package TestNG;





import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.touch.offset.PointOption;



public class emulator {



private AndroidDriver<MobileElement> driver;



@BeforeTest

public void setUp() throws MalformedURLException {

DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

desiredCapabilities.setCapability("deviceName", "Android SDK built for x86");

desiredCapabilities.setCapability("platformName", "Android");

desiredCapabilities.setCapability("platformVersion", "7");

desiredCapabilities.setCapability("udid", "emulator-5554");

desiredCapabilities.setCapability("appPackage", "com.android.vending");

desiredCapabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");



URL remoteUrl = new URL("http://localhost:4723/wd/hub");



driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);

  }



@Test(priority=1)

public void sampleTest() throws InterruptedException {





MobileElement el1 = (MobileElement) driver.findElementById("com.android.vending:id/nested_parent_recycler_view");

el1.click();

Thread.sleep(30000);

MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Search Google Play");

el2.click();

Thread.sleep(30000);

MobileElement el3 = (MobileElement) driver.findElementById("com.android.vending:id/search_bar_text_input");

el3.click();

Thread.sleep(30000);

el3.sendKeys("WordPress");



Thread.sleep(10000);



MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");

el7.click();

Thread.sleep(10000);

MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Join the beta\n");

el8.click();

Thread.sleep(10000);

MobileElement el9 = (MobileElement) driver.findElementById("com.android.vending:id/write_review_link");

el9.click();



Thread.sleep(10000);



MobileElement el10 = (MobileElement) driver.findElementById("com.android.vending:id/review_text");

el10.sendKeys("Wordpress");

Thread.sleep(10000);

MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("4 stars unselected");

el11.click();

Thread.sleep(10000);

MobileElement el12 = (MobileElement) driver.findElementById("com.android.vending:id/post_review_button");

el12.click();

Thread.sleep(10000);

MobileElement el13 = (MobileElement) driver.findElementById("com.android.vending:id/secondary_button");

el13.click();

MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Options");

el14.click();

MobileElement el15 = (MobileElement) driver.findElementById("com.android.vending:id/title");

el15.click();

}

}


