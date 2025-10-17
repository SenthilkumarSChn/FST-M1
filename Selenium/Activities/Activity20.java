package Activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {

	
		public static void main(String[] args) {
			//Create the driver object
			WebDriver Driver = new FirefoxDriver();
			
			//Create a Webdriverwait object
			WebDriverWait WebDriverWait = new WebDriverWait(Driver, Duration. ofSeconds(10));
			//Open the page
			Driver.get(" https://training-support.net/webelements/alerts");
			//Verify using the page title
			System.out.println ("page title is "+ Driver.getTitle());
			
			//Find and click the button to open the alert
			Driver.findElement(By.id("prompt")). click();
			
			//Switch focus to teh prompt alert and print the text
			Alert promptAlert = Driver.switchTo().alert();
			System.out.println(promptAlert.getText());
			
			//Type awesome in the alert
			promptAlert.sendKeys("Awesome");
			
			//Click OK
			promptAlert.accept();
			
			//Print the message
			System.out.println(Driver.findElement(By.id("result")).getText());
			
			//Close the browser
			Driver.quit();
	}

}
