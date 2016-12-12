package Pages;

import Pages.CardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by opop on 12/12/2016.
 */
public class ProductPage {
    private FirefoxDriver driver;

    public ProductPage(FirefoxDriver driver){
        this.driver = driver;
    }

    By AddToCardLocator = By.id("add-to-cart-button");
    By ProductPriceLocator = By.id("priceblock_ourprice");
    By GoToCardAfterBuying = By.cssSelector("#hlb-view-cart-announce");
    By addToYourOrder = By.cssSelector("#siNoCoverage-announce");

    public Double getProductPrice(){
        String priceText = driver.findElement(ProductPriceLocator).getText();
        priceText = priceText.replaceAll("\\,|\\$|\\ ","");
        Double price = Double.parseDouble(priceText);
        return price;
    }

    public CardPage clickOnAddToCard() throws InterruptedException {
        driver.findElement(AddToCardLocator).click();
        Thread.sleep(3000);

        if (driver.findElement(addToYourOrder).isDisplayed()) {
            driver.findElement(addToYourOrder).click();
        }
        else {
        }
        Thread.sleep(3000);
        driver.findElement(GoToCardAfterBuying).click();
        return new CardPage(driver);
    }
}