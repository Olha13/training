package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by opop on 12/12/2016.
 */
public class CatalogPage {
    private FirefoxDriver driver;

    public CatalogPage(FirefoxDriver driver){
        this.driver = driver;
    }

    public ProductPage klickOnProduct(int n){
        driver.findElement(By.xpath(".//*[@id='s-results-list-atf']/li["+n+"]")).click();
        return new ProductPage(driver);
    }
}
