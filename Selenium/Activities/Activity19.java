package Activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19 {

	public static void main(String[] args) {
		//Create the driver object
		WebDriver Driver = new FirefoxDriver();
		
		//Create a Webdriverwait object
		WebDriverWait WebDriverWait = new WebDriverWait(Driver, Duration. ofSeconds(10));
		//Open the page
		Driver.get(" https://training-support.net/webelements/alerts");
		//Verify using the page title
		System.out.println ("page title is "+ Driver.getTitle());
		
		//Find and click the button to open alert
		Driver.findElement(By.id("confirm")). click();
		//Switch focus to the alert
		Alert confirmAlert = Driver. switchTo().alert();
		
		//Print the text in the alert
		String alertText  =confirmAlert.getText();
		System.out.println("Text in alert: + alertText");
		
		//Close the alert by clicking OK
		confirmAlert.accept();
		
		//Close the alert by clikcing Cancel
		//confirmAlert.dismiss();
		//Close the browser
		Driver.quit();
	

}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
	


