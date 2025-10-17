package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		//Create the driver object
				WebDriver Driver = new FirefoxDriver();
				//Open the page
				Driver.get("https://training-support.net/");
				//Verify using the page title
				System.out.println ("Page title is "+ Driver.getTitle());
				
				//Find and click the About us link
				Driver.findElement(By.linkText("About Us")).click();
				
				//Print the title of the page
				System.out.println ("New page title is"+ Driver.getTitle());
				
				
				//Close the browser
				Driver.quit();
			

			}

		

	}


