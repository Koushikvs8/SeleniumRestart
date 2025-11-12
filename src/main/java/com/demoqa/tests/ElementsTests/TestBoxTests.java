package com.demoqa.tests.ElementsTests;

import com.base.BaseTest;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.TestBoxPage;
import com.demoqa.tests.DemoQaBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.utils.Waits.waitForVisible;

public class TestBoxTests extends BaseTest {


    @Test(alwaysRun = true)
    public void Testbox(){
        HomePage homePage = new HomePage(getdriver());
        homePage.goToElements();
    }

}

