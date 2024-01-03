package taking_Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Screenshot_Program {

        public static void main(String[] args) {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            // Initialize ChromeDriver
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            // Navigate to the website
            driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

            // Capture screenshot
            File screenshotFile = ((org.openqa.selenium.TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
            // Save the screenshot to a file
            String destinationPath =
                    "C:/Users/Shubham Raj/Desktop/All Automation/BRM_NEW/gui_Automation/src/test/java/Screenshots_Folder/screenshot.png";
            try {
                Files.copy(screenshotFile.toPath(), new File(destinationPath).toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Close the browser
            driver.quit();
    }
}