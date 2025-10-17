package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project6 {
    public static void main(String[] args) {
        // Set path to chromedriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        WebElement directoryMenu = driver.findElement(By.id("menu_directory_viewDirectory"));

        // Verify visibility and clickability
        if (directoryMenu.isDisplayed() && directoryMenu.isEnabled()) {
            directoryMenu.click();

            // Verify heading
            WebElement heading = driver.findElement(By.xpath("//h1[text()='Search Directory']"));
            if (heading.isDisplayed()) {
                System.out.println("Test Failed: Heading not found.");
            }
        } else {
            System.out.println("Test Failed: Directory menu not clickable.");
        }

        // Close browser
        driver.quit();
    }
}



