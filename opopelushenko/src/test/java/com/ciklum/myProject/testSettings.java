package com.ciklum.myProject;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by opop on 11/24/2016.
 */
public class testSettings {

    WebDriver driver;

    @Before
    public void doBeforeTest(){

        System.setProperty("webdriver.gecko.driver", "D:\\Training\\opopelushenko\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

//      Implicit waits:
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

//      Explicit waits:
//      WebDriverWait wait = new WebDriverWait(driver, 10);
//      wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("header__logo")));
    }

    @After
        public void doAfterTest() {
            driver.quit();
    }
}
