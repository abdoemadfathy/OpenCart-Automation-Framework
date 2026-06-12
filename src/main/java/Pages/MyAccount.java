package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount
{
    WebDriver driver ;

    public MyAccount(WebDriver driver)
    {
        this.driver = driver;
    }

    By editMyAccountLocator = By.linkText("Edit your account information");

   public void clickEditMyAccount()
   {
       driver.findElement(editMyAccountLocator).click();
   }

}
