package com.utils;

import com.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits  {
    public static WebDriverWait wait;
    public static final int TIME_OUT =10;


    public static WebElement waitForVisible(WebDriver driver ,By locator) {
        wait=new WebDriverWait(driver , Duration.ofSeconds(TIME_OUT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static  WebElement waitForClickable(WebDriver driver ,By locator) {
        wait=new WebDriverWait(driver , Duration.ofSeconds(TIME_OUT));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}
