package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4 {
    public static void main(String[] args) {
    	// Step a: Open a browser
        WebDriver driver = new ChromeDriver();
        try {
            // a. Open OrangeHRM and login
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();

            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            // b. Click on PIM
            Thread.sleep(2000); // wait for page to load
            driver.findElement(By.xpath("//span[text()='PIM']")).click();

            // c. Click Add button
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[text()='Add']")).click();

            // d. Fill in employee details
            Thread.sleep(2000);
            driver.findElement(By.name("firstName")).sendKeys("John");
            driver.findElement(By.name("lastName")).sendKeys("Doe");

            // Save
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // e. Go back to Employee List
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[text()='Employee List']")).click();

            // Optional: Verify employee creation (basic check)
            Thread.sleep(2000);
            WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
            searchBox.sendKeys("John");

            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // f. Close browser
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}


