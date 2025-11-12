package com.base;

import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
     public static WebDriver driver;
     public static Boolean flag= false;

     @BeforeClass(alwaysRun = true)
     public void setupClass() throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         System.out.println("Before class");
     }

//     @AfterClass(alwaysRun = true)
//     public void tearDown() {
//         if (driver != null) {
//             driver.quit();
//         }
//     }


    @BeforeMethod(alwaysRun = true)
    public void setup() throws InterruptedException {
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Before method Base");
       // Thread.sleep(2000);
    }

    @Test(alwaysRun = true)
    public void Testbox() throws InterruptedException {
       driver.findElement(By.xpath("//div[@class='card-body']/h5[text()='Elements']")).click();
        Thread.sleep(2000);
    }

    public static WebDriver getdriver()
    {return driver;}

    @AfterMethod(alwaysRun = true)
    public void teardown()
    {
        driver.quit();
        System.out.println("After method quiting driver");
    }

}
