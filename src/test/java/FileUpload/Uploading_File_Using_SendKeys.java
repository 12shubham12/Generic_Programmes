package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Uploading_File_Using_SendKeys {
        public static WebDriver driver;
        public static String baseUrl;


        public static void main(String args[]){
            System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            baseUrl = "https://cgi-lib.berkeley.edu/ex/fup.html"; // Replace with your file upload URL
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseUrl);
            // Replace "path/to/your/file.txt" with the actual path of the file you want to upload
            String filePath = "C:\\Users\\Shubham Raj\\Desktop\\All Automation\\BRM_NEW\\important_programmes\\pom.xml";
            // Find the file input element and send the file path
            WebElement fileInput = driver.findElement(By.name("upfile")); // Replace with the actual file input element's id
            fileInput.sendKeys(filePath);
            //NOTE: sendKeys will only work if type="file" in inspect element
        }
}
