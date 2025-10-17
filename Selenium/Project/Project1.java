package Examples;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	public class Project1 {
		WebDriver driver;
		
		
		public void setUp() {
			driver=new FirefoxDriver();
			driver.get("http://alchemy.hguy.co/orangehrm");
			System.out.println("The title of the page is: "+driver.getTitle());
		}
		
		@Test
		public void homePageTest() {
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		}
		
		@AfterClass
		public void closePageTest() {
			driver.quit();
		
		}
	}


