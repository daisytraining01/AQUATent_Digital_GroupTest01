package Sample.NextGene;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

/**
 * Unit test for simple App.
 */
public class TestCaseOne_WordPress_Emulator 
{
	
	 private AndroidDriver driver;
	 
	@BeforeTest
	
	 public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "Android SDK build for x86");
	    desiredCapabilities.setCapability("udid", "emulator-5554");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "10");
	    desiredCapabilities.setCapability("automationName", "UiAutomator1");
	    desiredCapabilities.setCapability("appPackage", "org.wordpress.android");
	    desiredCapabilities.setCapability("appActivity", "org.wordpress.android.ui.WPLaunchActivity");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }
	
	//Priyadharshini
	@Test(priority=1)
	public void sampleTestNgWordPressSignUpTest() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/create_site_button");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/signup_email");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el3.click();
	    Thread.sleep(2000);
	    MobileElement el01 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
	    el01.click();
	    
	    MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el5.sendKeys("susilamaheswari@gmail.com");
	    MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el6.click();
	    Thread.sleep(5000);
	    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
        el8.click();
        Thread.sleep(5000);
        MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
        el9.sendKeys("Monika10#");
        Thread.sleep(5000);
        MobileElement e1l1 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
        e1l1.click();
        MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
        el10.click();
        Thread.sleep(3000);
        System.out.println("Signed in Successfully");
        MobileElement el15 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
        el15.click();
       
        MobileElement el61 = (MobileElement) driver.findElementById("org.wordpress.android:id/avatar");
        el61.click();
        MobileElement el62 = (MobileElement) driver.findElementById("org.wordpress.android:id/row_my_profile");
        el62.click();
        System.out.println("Clicked My Profile");
        MobileElement el63 = (MobileElement) driver.findElementById("org.wordpress.android:id/first_name_row");
        el63.click();
        MobileElement el64 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el64.clear();
        MobileElement el65 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el65.sendKeys("Priya");
        MobileElement el66 = (MobileElement) driver.findElementById("android:id/button1");
        el66.click();
        System.out.println("Firstname updated");
        MobileElement el67 = (MobileElement) driver.findElementById("org.wordpress.android:id/last_name_row");
        el67.click();
        MobileElement el68 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el68.clear();
        MobileElement el69 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el69.sendKeys("G");
        MobileElement el160 = (MobileElement) driver.findElementById("android:id/button1");
        el160.click();
        System.out.println("Last Name Updated");
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[1]");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el19.clear();
        MobileElement el110 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el110.sendKeys("Aqua Tent");
        MobileElement el111 = (MobileElement) driver.findElementById("android:id/button1");
        el111.click();
        System.out.println("Public profile updated");
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.TextView");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el13.clear();
        MobileElement el131 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el131.sendKeys("Together everyone achieves more");
        MobileElement el14 = (MobileElement) driver.findElementById("android:id/button1");
        el14.click();
        System.out.println("About me Updated");
        MobileElement el115 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        el115.click();
        
        MobileElement el126 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
	    el126.click();
	    MobileElement el127 = (MobileElement) driver.findElementById("android:id/button1");
	    el127.click();
	    System.out.println("Logged Out");
	    Thread.sleep(3000);
	    System.out.println("Execution Completed Successfully");
  
	  }
	
	//Priyadharshini
	@Test(priority=2)
	public void sampleWordPressLoginTest() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el4.sendKeys("susilamaheswari@gmail.com");
	    MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
	    el6.click();
	    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el8.sendKeys("Monika10#");
	    MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
        el10.click();
	    System.out.println("Navigating to Notifications");
	    MobileElement el74 = (MobileElement) driver.findElementByAccessibilityId("Notifications. Manage your notifications.");
	    el74.click();
	    MobileElement el75 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout");
	    el75.click();
	    MobileElement el76 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
	    el76.click();
	    MobileElement el77 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
	    el77.click();
	    Thread.sleep(3000);
	    System.out.println("Navigating to following sites");
	    MobileElement el88 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
	    el88.click();
	    MobileElement el99 = (MobileElement) driver.findElementByAccessibilityId("Edit tags and sites");
	    el99.click();
	    Thread.sleep(2000);
	    MobileElement el110 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Followed sites\"]/android.widget.TextView");
	    el110.click();
	    Thread.sleep(2000);
	    MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
	    el11.click();
	    Thread.sleep(4000);
	    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
	    el12.click();
	    MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
	    el13.click();
	    Thread.sleep(2000);
	    MobileElement el14 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
	    el14.click();
	    MobileElement el61 = (MobileElement) driver.findElementById("org.wordpress.android:id/avatar");
        el61.click();
    
	    MobileElement el16 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
	    el16.click();
	    MobileElement el17 = (MobileElement) driver.findElementById("android:id/button1");
	    el17.click();
	    System.out.println("Logged out");
	    Thread.sleep(3000);
	    System.out.println("Execution Completed Successfully");
       }
	
	/*//Maheswari
	   @Test(priority=3)
	      public void sampleTest() throws Exception {
	      
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/create_site_button");
	        el1.click();
	        MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/signup_email");
	        el2.click();
	        MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	        el3.click();
	        Thread.sleep(5000);
	        MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
	        el4.click();
	        MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	        el5.click();
	        Thread.sleep(5000);
	        MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	        el6.sendKeys("susilamaheswari@gmail.com");
	        Thread.sleep(5000);
	        MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	        el7.click();
	        Thread.sleep(5000);
	        MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
	        el8.click();
	        MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	        el9.click();
	        Thread.sleep(5000);
	        MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	        el10.sendKeys("Monika10#");
	        Thread.sleep(5000);
	        MobileElement el11 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	        el11.click();
	        Thread.sleep(10000);
	        MobileElement el110 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	        el110.click();
	        Thread.sleep(5000);
            
	        MobileElement el77 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
		    el77.click();
		    Thread.sleep(3000);
	        MobileElement el13 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
	        el13.click();
	        Thread.sleep(5000);
	        MobileElement el14 = (MobileElement) driver.findElementById("org.wordpress.android:id/filter_list_button");
	        el14.click();
	        Thread.sleep(5000);
	        MobileElement el15 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Select a Tag or Site, Pop Up Window\"]/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
	        el15.click();
	        Thread.sleep(5000);
	        MobileElement el16 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"discover\"]/android.widget.TextView");
	        el16.click();
	        Thread.sleep(5000);
	        MobileElement el17 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"likes\"]/android.widget.TextView");
	        el17.click();
	        Thread.sleep(5000);
	        MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("saved");
	        el18.click();
	        Thread.sleep(5000);
	        MobileElement el19 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
	        el19.click();
	        Thread.sleep(5000);
	        MobileElement el145 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
		    el145.click();
		    Thread.sleep(2000);
		    MobileElement el61 = (MobileElement) driver.findElementById("org.wordpress.android:id/avatar");
	        el61.click();
	      
		    MobileElement el166 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
		    el166.click();
		    MobileElement el177 = (MobileElement) driver.findElementById("android:id/button1");
		    el177.click();
	        Thread.sleep(9000);
	        System.out.println("Execution completed");
	       }
	
	 
	   
	//Pavithra
	   @Test(priority=4)
		public void deletePost() throws InterruptedException {

		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			MobileElement btnLogin = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
			btnLogin.click();
			 MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			    el2.click();
			    Thread.sleep(5000);
			    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
			    el3.click();
			    MobileElement el4 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			    el4.sendKeys("pavithra12111993@gmail.com");
			    MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
			    el5.click();
			    MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
			    el6.click();
			    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			    el7.click();
			    Thread.sleep(3000);
			    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
			    el8.sendKeys("Sunshine@12");
			    Thread.sleep(5000);
			    MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
			    el9.click();
			    Thread.sleep(5000);
			    MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		        el10.click();
		        Thread.sleep(5000);
			System.out.println("Deleting the blog post");
			Thread.sleep(1000);
			MobileElement btnBlogpost = (MobileElement) driver
					.findElementById("org.wordpress.android:id/my_site_blog_posts_text_view");
			btnBlogpost.click();
			MobileElement btnMore = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout");
			btnMore.click();
			MobileElement btnBin = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
			btnBin.click();
			MobileElement deletedpost = (MobileElement) driver.findElementById("org.wordpress.android:id/title");
			System.out.println("Deleted a blog post");
			//Assert.assertFalse(deletedpost.isDisplayed());
			Thread.sleep(2000);
			driver.navigate().back();
			MobileElement btnProfile = (MobileElement) driver.findElementById("org.wordpress.android:id/avatar");
			btnProfile.click();
			System.out.println("Clicked on profile button");
			MobileElement btnLogout = (MobileElement) driver
					.findElementById("org.wordpress.android:id/me_login_logout_text_view");
			btnLogout.click();
			MobileElement btnLogout_popup = (MobileElement) driver.findElementById("android:id/button1");
			btnLogout_popup.click();
			System.out.println("logged out of app");

		}*/
	   
	   
	   

	@AfterTest
	public void tearDown() {
	    driver.quit();
	  }
}



///////////


/*//Sumida
@Test(priority=4)

public void sampleTest1() throws InterruptedException {

  MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");

  el1.click();

  Thread.sleep(5000);
  
  MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el4.sendKeys("susilamaheswari@gmail.com");
	    MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
	    el6.click();
	    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el8.sendKeys("Monika10#");
	    MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
     el10.click();

  MobileElement e1l2 = (MobileElement) driver.findElementById("com.google.android.gms:id/credential_primary_label");

  e1l2.click();

  Thread.sleep(5000);

  MobileElement e1l3 = (MobileElement) driver.findElementById("org.wordpress.android:id/dismiss_button");

  e1l3.click();

  Thread.sleep(5000);

  MobileElement el64 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[3]");

  el64.click();

  Thread.sleep(5000);

  MobileElement el65 = (MobileElement) driver.findElementByAccessibilityId("Notification Settings");

  el65.click();

  Thread.sleep(5000);

  MobileElement el66 = (MobileElement) driver.findElementById("android:id/switch_widget");

  el66.click();

  Thread.sleep(5000);

  MobileElement el77 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");

  el77.click();

  Thread.sleep(5000);

  MobileElement el88 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");

  el88.click();

  Thread.sleep(5000);
  MobileElement el155 = (MobileElement) driver.findElementByAccessibilityId("Me");
	 el155.click();
  MobileElement el61 = (MobileElement) driver.findElementById("org.wordpress.android:id/avatar");
     el61.click();
	 MobileElement el166 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
	 el166.click();
	 MobileElement el177 = (MobileElement) driver.findElementById("android:id/button1");
	 el177.click();
  

  System.out.println("sampleTest1: Successfully disabled notifications on Pending Drafts");

}
*/
/*//Sumidha
@Test(priority=5)

public void sampleTest2() throws InterruptedException {

MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");

el1.click();

Thread.sleep(5000);
  
  MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el4.sendKeys("susilamaheswari@gmail.com");
	    MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
	    el6.click();
	    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el8.sendKeys("Monika10#");
	    MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
     el10.click();
     MobileElement el77 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
	    el77.click();
	    Thread.sleep(3000);
MobileElement el62 = (MobileElement) driver.findElementById("com.google.android.gms:id/credential_primary_label");

el62.click();

Thread.sleep(5000);

MobileElement el63 = (MobileElement) driver.findElementById("org.wordpress.android:id/dismiss_button");

el63.click();

Thread.sleep(5000);

  MobileElement el1954 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");

  el1954.click();

  Thread.sleep(5000);

  MobileElement el1955 = (MobileElement) driver.findElementByAccessibilityId("show more");

  el1955.click();

  Thread.sleep(5000);

  MobileElement el496 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");

  el496.click();

  Thread.sleep(5000);

  MobileElement el787 = (MobileElement) driver.findElementByAccessibilityId("show more");

  el787.click();

  Thread.sleep(5000);

  MobileElement el88 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView");

  el88.click();
  
  MobileElement el877 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");

  el877.click();

  Thread.sleep(5000);

  MobileElement el898 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");

  el898.click();

  Thread.sleep(5000);
  MobileElement el61 = (MobileElement) driver.findElementById("org.wordpress.android:id/avatar");
     el61.click();
	 MobileElement el166 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
	 el166.click();
	 MobileElement el177 = (MobileElement) driver.findElementById("android:id/button1");
	 el177.click();
  System.out.println("sampleTest2: Successfully disabled notifications on Pending Drafts");

}*/
