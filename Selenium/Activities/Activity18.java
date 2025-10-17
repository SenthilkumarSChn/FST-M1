package Activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity18 {

	public static void main(String[] args) {
		//Create the driver object
				WebDriver Driver = new FirefoxDriver();
				
				//Create a Webdriverwait object
				WebDriverWait WebDriverWait = new WebDriverWait(Driver, Duration. ofSeconds(10));
				//Open the page
				Driver.get(" https://training-support.net/webelements/alerts");
				//Verify using the page title
				System.out.println ("page title is "+ Driver.getTitle());
				
				//Find the button to open a SIMPLE alert and click it.
				Driver.findElement(By.id("simple")).click();
				
				//Switch focus to the alert
				Alert simpleAlert = Driver.switchTo().alert();
				
				//Print the text from the alert
				System.out.println(simpleAlert.getText());
				
				//Close the alert
				simpleAlert.accept();
				
				//Print the message
				System.out.println(Driver.findElement(By.id("result")).getText());
				
			
				//Close the browser
				Driver.quit();
			

	}

}
