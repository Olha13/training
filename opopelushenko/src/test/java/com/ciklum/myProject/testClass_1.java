package com.ciklum.myProject;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class testClass_1 {


    @Test
    public void test_1() {
       System.setProperty("webdriver.gecko.driver", "D:\\Training\\opopelushenko\\src\\test\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com.ua/");
        driver.quit();
    }
    @Test
    public void test_2() {
        System.setProperty("webdriver.gecko.driver", "D:\\Training\\opopelushenko\\src\\test\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://start.duckduckgo.com/");

        driver.findElement(By.xpath(".//*[@id='search_form_input_homepage']")).sendKeys("ромашка");
        driver.findElement(By.xpath(".//*[@id='search_button_homepage']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("header__logo")));

        List<WebElement> element = driver.findElements(By.xpath(".//*[@id='links']/div"));
        int dim = element.size();
        System.out.print("Count of elements: " + dim);
        assert dim == 32;
        driver.quit();

    }
}
