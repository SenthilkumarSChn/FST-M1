package Examples;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Project9{
//Declare class objects
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		//INitilaize driver and wait
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// open the page
		driver.get("https://alchemy.hguy.co/lms/");
			}
			@Test
			public void CompleteALesson() {
				
				//login to enroll
				driver.findElement(By.linkText("My Account")).click();
				driver.findElement(By.linkText("Login")).click();
				driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
				driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
				driver.findElement(By.id("wp-submit")).click();
						
				//c. & d. Find the navigation bar and Select the menu item that says “All Courses” and click it
				WebElement navElement = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
				navElement.click();
				
				//e. Select any course and open it.
				driver.findElement(By.xpath("//a[@class='btn btn-primary'][1]")).click();
				
				
				
				//f. Click on a lesson in the course. Verify the title of the course.
				driver.findElement(By.className("ld-item-title")).click();
				String headingString = driver.getTitle();
				System.out.println("title of the course: "+headingString);
				
				Assert.assertEquals(headingString, "Developing Strategy – Alchemy LMS");
				
				//g. Click the Mark Complete button on the page (if available).
				
				List<WebElement> markCompleteButtonElement = driver.findElements(By.className("learndash_mark_complete_button"));
				if(!markCompleteButtonElement.isEmpty()) {
					System.out.println("Mark as complete button is present");
					markCompleteButtonElement.get(0).click();
				}
				else {
					System.out.println("Mark Complete button not found");
				}
				
				
				
			}
			
			
		//Browser clean up function
		@AfterClass
		public void tearDOwn() {
			//close the browser
			driver.quit();
		}
}




