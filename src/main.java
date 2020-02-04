import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class main {
    public static WebDriver driver;

    @BeforeClass
    public static void browserSetup()
    {
       // System.setProperty("chrome.driver","C:\\Windows\\chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("http://www.tizag.com/javascriptT/javascriptalert.php"); robot class screenshot
        //driver.get("https://www.gmail.com");//javascript text entry
        driver.get("https://www.youtube.com/");
    }

    public static int a ;
    public void d()
    {
// can't call the non static method in static method
    }

    @AfterClass
    public static void tearDown()
    {
        driver.close();
    }



}


