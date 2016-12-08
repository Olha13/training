package com.ciklum.myProject;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class testClass_1 extends testSettings{

    @Test(timeout = 8000)
    public void test_1() throws InterruptedException {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oven");
        driver.findElement(By.cssSelector(".nav-input[value='Go']")).click();

//        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Thread.sleep(6000);

        List<WebElement> element = driver.findElements(By.cssSelector(".s-item-container"));
        int m = element.size();
        System.out.print("=======================" + m);
        assert m == 32;


    }
}
