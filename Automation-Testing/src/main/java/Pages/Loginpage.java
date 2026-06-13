package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    WebDriver driver;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By emailLocateor = By.id("input-email");
    By passwordLocator = By.id("input-password");
    By loginBtnLocator =By.xpath("//button[@class=\"btn btn-primary\"]");

    By forgetPasswprdLocator = By.linkText("Forgotten Password");
    By continueLocator = By.xpath("//button[@class=\"btn btn-primary\"]");

    // Methods
    public void setEmail(String email) {
        driver.findElement(emailLocateor).sendKeys(email);
    }

    public void setPassword(String pass) {
        driver.findElement(passwordLocator).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtnLocator).click();
    }

    public void clickForgottenPassword() {
        driver.findElement(forgetPasswprdLocator).click();
    }

    public void clickContinueInForgettenPassword()
    {
        driver.findElement(continueLocator).click();
    }

    public void login(String email, String pass) {
        setEmail(email);
        setPassword(pass);
        clickLogin();
    }
}
