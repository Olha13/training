package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchPage {
    private FirefoxDriver driver;

    public AmazonSearchPage(FirefoxDriver driver){
        this.driver = driver;
    }

    By searchFieldLocator = By.id("twotabsearchtextbox");
    By searchButton = By.cssSelector(".nav-input[value='Go']");


    //Set search product into Search Fieald
    public void setSearchProduct(String product){
        driver.findElement(searchFieldLocator).sendKeys(product);;
    }
    //Click on Search batton
    public void clickOnSearch(){
        driver.findElement(searchButton).click();
    }

    public CatalogPage findProduct(String product){
        this.setSearchProduct(product);
        this.clickOnSearch();
        return new CatalogPage(driver);
    }
}
