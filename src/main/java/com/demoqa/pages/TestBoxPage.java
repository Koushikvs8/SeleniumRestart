package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBoxPage extends ElementsPage{

    WebDriver driver;
    public TestBoxPage(WebDriver driver)
    {
        super(driver);
    }

    By testBoxOption= By.xpath("//*[text()='Text Box']");



}
