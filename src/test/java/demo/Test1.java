package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Test1 {

	public AndroidDriver<MobileElement> driver;
	public DesiredCapabilities dc;
	URL url;

	@BeforeTest
	public void openApp() throws MalformedURLException {

		dc = new DesiredCapabilities();
		dc.setCapability("automationName", "UiAutomator1");
		dc.setCapability("deviceName", "Galaxy M30s"); // Android Emulator
		dc.setCapability("udid", "RZ8N11E1RBZ");
		dc.setCapability("platformName", "Android");

		dc.setCapability("platformVersion", "10");

		dc.setCapability("appPackage", "org.wordpress.android");
		dc.setCapability("appActivity", "org.wordpress.android.ui.posts.PostsActivity");
		url = new URL("http://127.0.0.1:4723/wd/hub");

		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		 driver = new AndroidDriver<MobileElement>(url, dc);
		
		 System.out.println("Wordpress Application invoked successfully");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void addBlogPosts() throws InterruptedException {

		

		String Message = "GoGood morning";

		MobileElement btnLogin = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
		btnLogin.click();
		MobileElement inputEmail = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		inputEmail.click();

		Thread.sleep(1000);

		MobileElement btnEmailId = (MobileElement) driver.findElementByXPath(
				"//android.widget.LinearLayout[@content-desc=\"pavithra senthilkumar\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]");
		btnEmailId.click();
		MobileElement btnEnterPassword = (MobileElement) driver
				.findElementById("org.wordpress.android:id/login_enter_password");
		btnEnterPassword.click();
		MobileElement input_Password = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		input_Password.sendKeys("Sunshine@12");
		MobileElement btnNext = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		btnNext.click();

		Thread.sleep(1000);
		MobileElement btnContinue = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		btnContinue.click();

		System.out.println("Adding blog post");

		(new TouchAction(driver)).tap(PointOption.point(955, 2022)).perform();
		MobileElement btnBlog = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView");
		btnBlog.click();
		MobileElement el9 = (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Post title. Empty\"]/android.widget.EditText");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Post title. Empty\"]/android.widget.EditText");
		el10.sendKeys("Greetings");
		Thread.sleep(1000);
		MobileElement el11 = (MobileElement) driver.findElementByXPath(
				"//android.widget.ScrollView[@content-desc=\"block-list\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
		Thread.sleep(1000);
		el11.sendKeys(Message);

		System.out.println("Added a blog post");

		MobileElement btnpublish = (MobileElement) driver
				.findElementById("org.wordpress.android:id/menu_primary_action");
		btnpublish.click();
		MobileElement btnPublishNow = (MobileElement) driver.findElementById("android:id/button1");
		btnPublishNow.click();

		Thread.sleep(1000);

		MobileElement btnBlogPost = (MobileElement) driver
				.findElementById("org.wordpress.android:id/my_site_blog_posts_text_view");
		btnBlogPost.click();

		Thread.sleep(3000);
	}

	@AfterTest
	public void Logout() throws InterruptedException {

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
		driver.closeApp();
		Thread.sleep(3000);

	}

	

}
