package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Project5 {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // a. Open the OrangeHRM page and login
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            // b. Click on "My Info"
            driver.findElement(By.xpath("//span[text()='My Info']")).click();

            // c. Click the Edit button (usually a pencil icon or similar)
            driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();

            // d. Fill in the fields
            WebElement firstName = driver.findElement(By.name("firstName"));
            WebElement lastName = driver.findElement(By.name("lastName"));
            WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input"));
            WebElement nationalityDropdown = driver.findElement(By.xpath("//label[text()='Nationality']/following::div[1]"));
            WebElement dob = driver.findElement(By.xpath("//label[text()='Date of Birth']/following::input[1]"));

            firstName.clear();
            firstName.sendKeys("John");

            lastName.clear();
            lastName.sendKeys("Doe");

            genderMale.click();

            nationalityDropdown.click();
            driver.findElement(By.xpath("//span[text()='Indian']")).click();

            dob.clear();
            dob.sendKeys("1990-01-01"); // Adjust format if needed

            // e. Click Save
            driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

        } finally {
            // f. Close the browser
            driver.quit();
        }
    }
}


