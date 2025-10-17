package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project7 {
    public static void main(String[] args) {
    	// Step a: Open a browser
        WebDriver driver = new ChromeDriver();

        try {
            // Step a: Open OrangeHRM and login
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();

            // Login
            driver.findElement(By.id("txtUsername")).sendKeys("Admin");
            driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            driver.findElement(By.id("btnLogin")).click();

            // Step b: Click "My Info"
            driver.findElement(By.id("menu_pim_viewMyDetails")).click();

            // Step c: Click "Qualifications"
            driver.findElement(By.linkText("Qualifications")).click();

            // Step d: Add Work Experience
            driver.findElement(By.id("addWorkExperience")).click();
            driver.findElement(By.id("experience_employer")).sendKeys("TechCorp");
            driver.findElement(By.id("experience_jobtitle")).sendKeys("Software Engineer");
            driver.findElement(By.id("experience_from_date")).sendKeys("2020-01-01");
            driver.findElement(By.id("experience_to_date")).sendKeys("2023-12-31");
            driver.findElement(By.id("btnWorkExpSave")).click();

            // Step e: Close browser
            Thread.sleep(3000); // Wait to observe result
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
            driver.quit();
        }
    }
}



