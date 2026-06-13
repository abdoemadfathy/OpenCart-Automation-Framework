package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage
{
    WebDriver driver ;
    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By logOutLocator = By.linkText("Logout");
    By continueLocator = By.linkText("Continue");

    public void clickLogoutBtn() {
        driver.findElement(logOutLocator).click();
    }

    public void clickContinueBtn()
    {
        driver.findElement(continueLocator).click();
    }

}
