package Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;

public class Test_GUI {

    WebDriver driver;

    @Test
    public void launch_URL(){
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

    }

    @Test
    public void collection(){
        HashSet hs = new HashSet();
        System.out.println(hs.size());
    }
}
