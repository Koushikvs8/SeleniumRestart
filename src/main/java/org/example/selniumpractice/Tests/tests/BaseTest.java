package org.example.selniumpractice.Tests.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
     public static WebDriver driver;


     @BeforeClass(alwaysRun = true)
     public void setup() throws InterruptedException {
         driver=new ChromeDriver();
         driver.get("https://demoqa.com/text-box");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     }

@AfterMethod(alwaysRun = true)
public void tearDown(){
         driver.quit();
}


}
