package Examples;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Project2 {
	    public static void main(String[] args) {
	        // Step a: Open a browser
	        WebDriver driver = new ChromeDriver();

	        // Step b: Navigate to the URL
	        driver.get("http://alchemy.hguy.co/orangehrm/");

	        // Step c: Get the URL of the header image
	        WebElement headerImage = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	        String imageUrl = headerImage.getAttribute("src");

	        // Step d: Print the URL to the console
	        System.out.println("Header Image URL: " + imageUrl);

	        // Step e: Close the browser
	        driver.quit();
	    }
	}


