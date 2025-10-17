package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Project8 {
    public static void main(String[] args) {
        // Set path to your ChromeDriver
                WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        try {
            // Step 1: Open OrangeHRM and login
            driver.get("https://opensource-demo.orangehrmlive.com/");
            driver.findElement(By.id("txtUsername")).sendKeys("Orange");
            driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
            driver.findElement(By.id("btnLogin")).click();

            // Step 2: Click on "Apply Leave"
            driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
            driver.findElement(By.id("menu_leave_applyLeave")).click();

            //Step 3: Fill in leave form
            WebElement leaveType = driver.findElement(By.id("applyleave_txtLeaveType"));
            leaveType.sendKeys("Annual Leave");

            driver.findElement(By.id("applyleave_txtFromDate")).clear();
            driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2025-10-15");

            driver.findElement(By.id("applyleave_txtToDate")).clear();
            driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2025-10-16");

            driver.findElement(By.id("applyleave_txtComment")).sendKeys("Family trip");

            // Step 4: Click Apply
            driver.findElement(By.id("applyBtn")).click();

            // Step 5: Navigate to "My Leave" to verify
            driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();

        } finally {
            // Optional: Close the browser after a delay
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
            driver.quit();
        }
    }
}


