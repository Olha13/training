package com.ciklum.myProject;
import Pages.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testClass_1 extends testSettings{


    @Test
    public void test_1() throws InterruptedException {
Thread.sleep(5000);
        driver.findElement(By.cssSelector(".nav-line-2")).click();
Thread.sleep(3000);
        LoggedInPage log = new LoggedInPage((FirefoxDriver) driver);
Thread.sleep(1000);
        AmazonSearchPage search = log.logInToAmazon("test.matviienko@gmail.com", "123456Matviienko");
Thread.sleep(2000);
        CatalogPage catalog = search.findProduct("Oven");
Thread.sleep(5000);
        ProductPage product = catalog.klickOnProduct(1);
Thread.sleep(5000);
        Double p = product.getProductPrice();
        System.out.println("========================"+p);
Thread.sleep(5000);
        CardPage card = product.clickOnAddToCard();
        Double s = card.getSubtotalValue();

        System.out.print("========================"+s);
        Assert.assertEquals(p,s);
    }
}
