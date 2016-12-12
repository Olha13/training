package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by opop on 12/12/2016.
 */
public class CardPage {
    private FirefoxDriver driver;

    public CardPage(FirefoxDriver driver){
        this.driver = driver;
    }
    By subtotalValueofOrder = By.cssSelector(".a-size-medium.a-color-price.sc-price.sc-white-space-nowrap.sc-price-sign");

    public double getSubtotalValue(){
        String totalPrice = driver.findElement(subtotalValueofOrder).getText();
        totalPrice = totalPrice.replaceAll("\\,|\\$|\\ ","");
        return Double.parseDouble(totalPrice);

    }
}
