//https://www.youtube.com/watch?v=sF3GglTxQ3o
package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Uploading_File_Using_RobotClass {

    public static WebDriver driver;

    public static void main(String args[]) throws AWTException {

        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Open the website with the file upload functionality
        driver.get("https://www.filemail.com/share/upload-file");

        // driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);

        // Locate the file input element
        WebElement uploadButton = driver.findElement(By.xpath("//label[@id='addBtn']"));

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("arguments[0].click();", uploadButton);
         */
        //or
        uploadButton.click();

        //Using Robot Class to upload the file
        Robot rb = new Robot();
        rb.delay(3000); //providing the delay time for page to load completely

        //Script Copying the file to clipboard
        StringSelection ss = new StringSelection("C:/Users/Shubham Raj/Desktop/All Automation/BRM_NEW/important_programmes/pom.xml");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        //Script to paste the location of file path with filename
        rb.keyPress(KeyEvent.VK_CONTROL);//Pressing the control key
        rb.keyPress(KeyEvent.VK_V);//Doing Paste action
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_V);//releasing the Paste action
        rb.keyRelease(KeyEvent.VK_CONTROL);//releasing Control key
        rb.delay(2000);

        //Pressing the Enter button
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);//releasing the Enter key

        // Close the browser
        driver.quit();
    }
}
