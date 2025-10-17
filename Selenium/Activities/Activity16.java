package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		//Create the driver object
				WebDriver Driver = new FirefoxDriver();
				//Open the page
				Driver.get("https://training-support.net/webelements/selects");
				//Verify using the page title
				System.out.println ("page title is "+ Driver.getTitle());
				
				 // Find the dropdown and create a Select object
		        Select dropdown=new Select(Driver.findElement(By.cssSelector("select.h-10")));

		        // Select the second option using visible text
		        dropdown.selectByVisibleText("One");
		        // Print the selected option
		        System.out.println(dropdown.getFirstSelectedOption().getText());

		        // Select the third option using index
		        dropdown.selectByIndex(2);
		        // Print the selected option
		        System.out.println(dropdown.getFirstSelectedOption().getText());

		        // Select the fourth option using value attribute
		        dropdown.selectByValue("three");
		        // Print the selected option
		        System.out.println(dropdown.getFirstSelectedOption().getText());

		        // Get all the option and Print them to the console
		        System.out.println("All the options:");
		        for(WebElement option : dropdown.getOptions()){;
		            System.out.println(option.getText());
		        }

				
				//Close the browser
				Driver.quit();

	}

}
