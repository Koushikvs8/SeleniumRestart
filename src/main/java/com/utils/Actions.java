package com.utils;

import com.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions extends BaseTest {
static WebDriver driver=BaseTest.getdriver();
    public static WebElement find(By locater)
    {
        return driver.findElement(locater);
    }

    public static void clickByWait(By locater)
    {   try {
        find(locater).click();
       // Waits.waitForClickable(BaseTest.getdriver() ,locater).click();
     } catch (Exception e) {
       System.out.println("unable to click the element" + locater);
       throw new RuntimeException("unable to click the element due to error "+e.getMessage());
    }

    }

    public static Boolean isDisplayed(By locater) {

        try {
            flag=Waits.waitForVisible(BaseTest.getdriver() ,locater).isDisplayed();
        }
        catch (Exception e) {
            System.out.println("the element is not visible" + locater);
            throw new RuntimeException("unable to click the element due to error "+e.getMessage());
        }
      return flag;
    }
}
