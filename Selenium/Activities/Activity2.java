package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		//Create the driver object
				WebDriver Driver = new FirefoxDriver();
				//Open the page
				Driver.get("https://training-support.net/webelements/login-form");
				//Verify using the page title
				System.out.println ("page title is "+ Driver.getTitle());
				
		
		// Find the username field and enter the username
        Driver.findElement(By.id("username")).sendKeys("admin");
        
        // Find the password field and enter the password
        Driver.findElement(By.id("password")).sendKeys("password");
        
        // Find the login button and click it
        Driver.findElement(By.xpath("//button[text()='Submit']")).click();
        
        // Print the confirmation message
        String message = Driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);
        
      //Close the browser
      		Driver.quit();
		

	}

}
