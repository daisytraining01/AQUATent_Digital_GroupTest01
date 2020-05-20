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

	  private AndroidDriver driver;

	  @BeforeTest
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "OPPO F15");
	    desiredCapabilities.setCapability("udid", "MBIN79RCUSHMV4PJ");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "9");
	    desiredCapabilities.setCapability("noReset", true);
	    desiredCapabilities.setCapability("fullReset", false);
	    desiredCapabilities.setCapability("appPackage", "com.android.vending");
	    desiredCapabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
	    desiredCapabilities.setCapability("automationName", "UiAutomator1");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }

	  @Test(priority=1)
	  public void sampleTest() throws InterruptedException {
		  
		  
		  MobileElement el1 = (MobileElement) driver.findElementById("com.android.vending:id/nested_parent_recycler_view");
		  el1.click();
		  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Search Google Play");
		  el2.click();
		  MobileElement el3 = (MobileElement) driver.findElementById("com.android.vending:id/search_bar_text_input");
		  el3.click();
		  el3.sendKeys("WordPress");
		  
		  Thread.sleep(100);
		  
		  MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
		  el7.click();
		  MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Join the beta\n");
		  el8.click();
		  MobileElement el9 = (MobileElement) driver.findElementById("com.android.vending:id/write_review_link");
		  el9.click();
		  
		  Thread.sleep(100);
		  
		  MobileElement el10 = (MobileElement) driver.findElementById("com.android.vending:id/review_text");
		  el10.sendKeys("Wordpress");
		  MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("4 stars unselected");
		  el11.click();
		  MobileElement el12 = (MobileElement) driver.findElementById("com.android.vending:id/post_review_button");
		  el12.click();
		  el12.click();
		  Thread.sleep(1000);
		  MobileElement el13 = (MobileElement) driver.findElementById("com.android.vending:id/secondary_button");
		  el13.click();
		  MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Options");
		  el14.click();
		  MobileElement el15 = (MobileElement) driver.findElementById("com.android.vending:id/title");
		  el15.click();


		  
		 /* MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
		  el8.click();
		  MobileElement el5 = (MobileElement) driver.findElementById("com.android.vending:id/write_review_link");
		  el5.click();
		  MobileElement el6 = (MobileElement) driver.findElementById("com.android.vending:id/review_text");
		  el6.sendKeys("WordPress");
		  MobileElement el7 = (MobileElement) driver.findElementById("com.android.vending:id/post_review_button");
		  el7.click();
		  MobileElement el81 = (MobileElement) driver.findElementByAccessibilityId("4 stars unselected");
		  el81.click();
		  MobileElement el9 = (MobileElement) driver.findElementById("com.android.vending:id/post_review_button");
		  el9.click();
		  MobileElement el10 = (MobileElement) driver.findElementById("com.android.vending:id/secondary_button");
		  el10.click();
		  MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Options");
		  el11.click();
		  MobileElement el12 = (MobileElement) driver.findElementById("com.android.vending:id/title");
		  el12.click();
		  MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
		  el13.click();*/
		  
		  
		 /* MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
		  el6.click();
		  MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		  el7.click();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Preethi Gowda\"]/android.widget.LinearLayout");
		  el8.click();
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		  
		  MobileElement el23 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
		  el23.click();
		  MobileElement el24 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		  el24.click();
		  el24.sendKeys("preethipreethu");
		  
		  Thread.sleep(100);*/


		 /* MobileElement btnLogin = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
			btnLogin.click();
			MobileElement inputEmail = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			inputEmail.click();

			Thread.sleep(1000);

			 MobileElement ela = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Preethi Gowda\"]/android.widget.LinearLayout");
			 ela.click();
			 ela.click();
			  Thread.sleep(100);
			  
			MobileElement btnEnterPassword = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
			btnEnterPassword.click();
			
			MobileElement input_Password = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			input_Password.sendKeys("preethipreethu");
			
			Thread.sleep(100);
			
			MobileElement btnNext = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
			btnNext.click();

			btnNext.click();
			
			Thread.sleep(1000);
			
			MobileElement btnContinue = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
			btnContinue.click();
			btnContinue.click();*/
			
			
			//Thread.sleep(100);
			
			/*MobileElement eli = (MobileElement) driver.findElementById("org.wordpress.android:id/quick_action_stats_button");
			eli.click();
			
			Thread.sleep(100);*/
			
		/*	MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[6]\r\n" + "");
			el6.click();
			
			Thread.sleep(100);
			MobileElement el7 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Drafts\"]/android.widget.TextView");
			el7.click();

			Thread.sleep(100);
			MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/button");
			el8.click();
			el8.click();
			
			Thread.sleep(100);*/
			
			/*MobileElement el6 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
			el6.click();
			MobileElement el7 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
			el7.click();
			
			Thread.sleep(100);*/
			
			/*MobileElement el11 = (MobileElement) driver.findElementById("android:id/button1");
			el11.click();*/
			
			/*MobileElement el6 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Drafts\"]/android.widget.TextView");
			el6.click();
			MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/button");
			el7.click();
			MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Post title. Empty\"]/android.widget.EditText");
			el8.sendKeys("Food");
			MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/menu_primary_action");
			el9.click();
			MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
			el10.click();
			MobileElement el11 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"More\"])[2]");
			el11.click();
			MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
			el12.click();
			el12.click();
			MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el13.click();
			MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el14.click();
			MobileElement el15 = (MobileElement) driver.findElementById("org.wordpress.android:id/avatar");
			el15.click();
			MobileElement el16 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
			el16.click();
			MobileElement el17 = (MobileElement) driver.findElementById("android:id/button1");
			el17.click();*/
			
			
			/*MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView");
			el15.click();
			MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView");
			el16.click();
			MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView");
			el17.click();
			MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView");
			el18.click();
			MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.TextView");
			el19.click();
			MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[11]/android.widget.TextView");
			el20.click();
			MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[12]/android.widget.TextView");
			el21.click();
			MobileElement el22 = (MobileElement) driver.findElementById("org.wordpress.android:id/save_insights");
			el22.click();
			MobileElement el23 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el23.click();*/

		  
			/*System.out.println("Adding blog post");
			
		  MobileElement el25 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_site_stats_text_view");
		  el25.click();
		  MobileElement el26 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
		  el26.click();

		  MobileElement el27 = (MobileElement) driver.findElementById("org.wordpress.android:id/row_stats");
		  el27.click();


		  
		  (new TouchAction(driver))
		  .press(PointOption.point(802,823))
		  .moveTo(PointOption.point(739,671))
		  .release()
		  .perform();
		  
		  
		MobileElement el12 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Add new stats card\"]/android.widget.LinearLayout/android.widget.ImageView");
		el12.click();
		MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView");
		el13.click();
		MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView");
		el14.click();
		MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView");
		el15.click();
		MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.TextView");
		el16.click();
		MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[11]/android.widget.TextView");
		el17.click();
		MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[12]/android.widget.TextView");
		el18.click();
		MobileElement el19 = (MobileElement) driver.findElementById("org.wordpress.android:id/save_insights");
		el19.click();
		MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
		el20.click();
		MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
		el21.click();
		MobileElement el22 = (MobileElement) driver.findElementById("org.wordpress.android:id/row_pages");
		el22.click();*/


		  //el9.click();

		  
		  /*MobileElement el7 = (MobileElement) driver.findElementById("com.android.vending:id/right_button");
		  el7.click();
		  el7.click();
		  MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout");
		  el8.click();
		  MobileElement el9 = (MobileElement) driver.findElementById("com.yammer.v1:id/tutorialPageImage");
		  el9.click();
		  (new TouchAction(driver))
		    .press({x: 907, y: 1211})
		    .moveTo({x: 73: y: 1211})
		    .release()
		    .perform()
		    
		  (new TouchAction(driver))
		    .press({x: 928, y: 1143})
		    .moveTo({x: 58: y: 1111})
		    .release()
		    .perform()
		    
		  MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout");
		  el10.click();
		  MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout");
		  el11.click();*/

		  
		  
		  /*
		  
		  MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.gm:id/conversation_list_folder_header");
		  el1.sendKeys("preethipreethu");
		  MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.gm:id/conversation_list_folder_header");
		  el2.click();
		  MobileElement el31 = (MobileElement) driver.findElementByAccessibilityId("Suggestion: preethipreethu20@gmail.com");
		  el31.click();
		  
		//  driver.im
		  
		  MobileElement el15 = (MobileElement) driver.findElementById("com.google.android.gm:id/conversation_list_folder_header");
		  el15.click();
		  MobileElement el25 = (MobileElement) driver.findElementByAccessibilityId("Suggestion: preethipreethu20@gmail.com");
		  el25.click();
		  MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.gm:id/overflow");
		  el5.click();
		  MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
		  el6.click();
		  MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView");
		  el7.click();
		  el7.sendKeys("Hi");
		  MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Send");
		  el8.click();
		  MobileElement el9 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"More options\"])[1]");
		  el9.click();
		  MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout");
		  el10.click();
		  MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Clear search text");
		  el11.click();
		  MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Back");
		  el12.click();


		  MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.gm:id/overflow");
		  el5.click();


		  MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("More options");
		  el4.click();
		  MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
		  el5.click();
		  MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView");
		  el6.click();
		  el6.sendKeys("Hi");
		  MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Send");
		  el7.click();
		  MobileElement el8 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"More options\"])[2]");
		  el8.click();
		  MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
		  el9.click();
		  MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Clear search text");
		  el10.click();
		  MobileElement el110 = (MobileElement) driver.findElementByAccessibilityId("Back");
		  el110.click();


		  MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.gm:id/item_list_card_secondary_action");
		  el2.click();
		  MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]");
		  el3.click();
		  MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.gm:id/conversation_topmost_overlay");
		  el4.click();
		  MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.gm:id/overflow");
		  el5.click();
		  MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
		  el6.click();
		  MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView");
		  el7.sendKeys("Hi");
		  MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Send");
		  el8.click();
		  MobileElement el9 = (MobileElement) driver.findElementById("conversation-header");
		  el9.click();
		  MobileElement el10 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"More options\"])[1]");
		  el10.click();
		  MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View");
		  el11.click();
		  MobileElement el12 = (MobileElement) driver.findElementById("android:id/navigationBarBackground");
		  el12.click();
		  MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[4]");
		  el13.click();
			  
		  MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("More options");
		  el14.click();
		  MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout");
		  el15.click();
		  MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("Clear search text");
		  el16.click();
		  MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("Back");
		  el17.click();
		  MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.gm:id/og_apd_internal_image_view");
		  el2.click();
		  MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Use uma usha umaushapree@gmail.com. 99+ unread emails.");
		  el3.click();
		  MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.gm:id/conversation_list_folder_header");
		  el4.click();
		  MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Suggestion: preethipreethu20@gmail.com");
		  el5.click();
	   
	  */}

	  /*@After
	  public void tearDown() {
	    driver.quit();
	  }*/
	}
