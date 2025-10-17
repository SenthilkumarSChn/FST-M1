package stepDefinitions;


	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.ExpectedConditions;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class TSHomepageSteps extends BaseClass {
		@Given("user is on the TS homepage")
		public void openTSHomepage() throws Throwable {
			// Open the browser
			driver.get("https://training-support.net");
			assertEquals(driver.getTitle(), "Training Support");
		}

		@When("the user clicks on the About Us link")
		public void clickButton() throws Throwable {
			driver.findElement(By.linkText("About Us")).click();
		}

		@Then("they are redirected to another page")
		public void verifyaboutPage() {
			//Wait for the new page to load
			wait.until(ExpectedConditions.titleContains("About"));
			//Assertion
			assertEquals("About Training Support", driver.getTitle());
		}
	}


