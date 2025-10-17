package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		//Create the driver object
				WebDriver Driver = new FirefoxDriver();
				//Open the page
				Driver.get(" https://training-support.net/webelements/dynamic-controls");
				//Verify using the page title
				System.out.println ("page title is "+ Driver.getTitle());
				
				//Find the checkbox input element.
				WebElement checkbox = Driver.findElement(By.id("checkbox"));
				
				// Find the toggle button and click it
		        Driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
				
		        // Check if it is displayed on the page
		        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
		        // Click the button again
		        Driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		        // Check if it is displayed on the page
		        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

		        // Close the browser
		        Driver.quit();
		    }
		}