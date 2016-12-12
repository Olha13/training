package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by opop on 12/12/2016.
 */
public class LoggedInPage {

    FirefoxDriver driver;

    By emailLocator = By.cssSelector("#ap_email");
    By passwordLocator = By.cssSelector("#ap_password");
    By signInLocator = By.cssSelector("#signInSubmit");

    public LoggedInPage (FirefoxDriver driver){
        this.driver = driver;
    }
    //Set userName in textbox
    public void setEmail(String strEmail){
        driver.findElement(emailLocator).sendKeys(strEmail);;
    }

    //Set password in textbox
    public void setPassword(String strPassword){
        driver.findElement(passwordLocator).sendKeys(strPassword);
    }
    //Click on login button
    public void clickOnSignIn(){
        driver.findElement(signInLocator).click();
    }

    public  AmazonSearchPage  logInToAmazon(String strMail,String strPasword){
        //Fill user name
        this.setEmail(strMail);
        //Fill password
        this.setPassword(strPasword);
        //Click Login button
        this.clickOnSignIn();
    return new AmazonSearchPage(driver);
    }

}
