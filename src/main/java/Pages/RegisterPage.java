package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage
{
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstNameLocator = By.id("input-firstname");
    By lastNameLocator = By.id("input-lastname");
    By emailLocator =By.id("input-email");
    By passwordLocator = By.id("input-password");
    By privacyLocator = By.name("agree");
    By continueLocator = By.xpath("//button[@class=\"btn btn-primary\"]");
    By getContinueLocator2 = By.linkText("Continue");

    // Methods
    public void setFirstNameLocator(String firstName) {
        driver.findElement(firstNameLocator).sendKeys(firstName);
    }

    public void setLastNameLocator(String lastName) {
        driver.findElement(lastNameLocator).sendKeys(lastName);
    }

    public void setEmailLocator(String email) {
        driver.findElement(emailLocator).sendKeys(email);
    }

    public void setPasswordLocator(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void setPrivacyLocator() {
        driver.findElement(privacyLocator).click();
    }

    public void setContinueLocator() {
        driver.findElement(continueLocator).click();
    }

    public void setGetContinueLocator2() {
        driver.findElement(getContinueLocator2).click();
    }

    public void Register (String firstName , String lastName , String email , String password) throws InterruptedException {
        setFirstNameLocator(firstName);
        Thread.sleep(2000);
        setLastNameLocator(lastName);
        Thread.sleep(2000);
        setEmailLocator(email);
        Thread.sleep(2000);
        setPasswordLocator(password);
        Thread.sleep(2000);
        setPrivacyLocator();
        Thread.sleep(2000);
        setContinueLocator();
        Thread.sleep(2000);
        setGetContinueLocator2();
    }

}
