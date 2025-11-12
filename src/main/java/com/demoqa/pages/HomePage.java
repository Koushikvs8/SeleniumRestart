package com.demoqa.pages;

import com.base.BasePage;
import com.utils.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    By elements = By.xpath("//div[@class='card-body']/h5[text()='Elements']");

    public void goToElements () {
        driver.findElement(elements).click();
    }




}
