package Activities;

import org.openqa.selenium.NoSuchElementException;
	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.options.UiAutomator2Options;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

	public class Activity1 {
	    // Driver Declaration
	    AndroidDriver driver;

	    // Set up method
	    @BeforeClass
	    public void setUp() throws MalformedURLException, URISyntaxException {
	        // Desired Capabilities
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("android");
	        options.setAutomationName("UiAutomator2");
	        options.setApp("C:/Users/SSruthi/.appium/Calculator.apk");
	        options.noReset();

	        // Server Address
	        URL serverURL = new URI("http://localhost:4723").toURL();

	        // Driver Initialization
	        driver = new AndroidDriver(serverURL, options);
	    }

	    // Test method
	    @Test
	    public void multiplyTest() {
	        // Perform the calculation
	    	//Find and tap the number 5
	        driver.findElement(AppiumBy.id("digit_5")).click();
	        
	        //Find and tap multiply bbutton
	        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
	        
	        //Find and tap the number 8
	        driver.findElement(AppiumBy.id("digit_8")).click();
	        
	        //Find and tap the equals button
	        driver.findElement(AppiumBy.accessibilityId("equals")).click();

	        // Find the result
	        String result = driver.findElement(AppiumBy.id("result")).getText();

	        // Assertion
	        Assert.assertEquals(result, "40");
	    }


	    // Tear down method
	    @AfterClass
	    public void tearDown() {
	        // Close the app
	        driver.quit();
	    }
	}


