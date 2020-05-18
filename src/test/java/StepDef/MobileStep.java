package StepDef;

import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class MobileStep {
	public static AndroidDriver<MobileElement> driver = null;

	@Given("^I am able to launch the app successfully$")
	public void i_am_able_to_launch_the_app_successfully() throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1606");
		cap.setCapability("udid", "37655905");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability("appPackage", "com.wt.apkinfo");
		cap.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");
		Thread.sleep(3000);
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("Application invoked Successfully");

	    
	}

	@When("^I searched for API Demos app$")
	public void i_searched_for_API_Demos_app() throws Throwable {
		System.out.print("Application Running");
		Thread.sleep(5000);
	        
	    driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
	    Thread.sleep(5000);
	    
	    driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Back']").click();
	
	}
	
	@Then("^App is displayed and I clicked on that app$")
	public void app_is_displayed_and_I_clicked_on_that_app() throws Throwable
	{
		System.out.println("API Demos app clicked successfully ");
		
	    Thread.sleep(5000);
	    	
	    
	    	}

	
	
}

