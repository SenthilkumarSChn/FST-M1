package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {
    public static void main(String[] args) {
    	// Step a: Open a browser
        WebDriver driver = new ChromeDriver();
        try {
            // a. Open the browser to the login page of OrangeHRM
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();

            // b. Find and select the username and password fields
            WebElement usernameField = driver.findElement(By.id("txtUsername"));
            WebElement passwordField = driver.findElement(By.id("txtPassword"));

            // c. Enter login credentials
            usernameField.sendKeys("Admin");
            passwordField.sendKeys("admin123");

            // d. Click login
            WebElement loginButton = driver.findElement(By.id("btnLogin"));
            loginButton.click();

            // e. Verify that the homepage has opened
            boolean isDashboardVisible = driver.findElement(By.id("welcome")).isDisplayed();
            if (isDashboardVisible) {
                System.out.println("Login successful. Dashboard is visible.");
            } else {
                System.out.println("Login failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // f. Close the browser
            driver.quit();
        }
    }
}



