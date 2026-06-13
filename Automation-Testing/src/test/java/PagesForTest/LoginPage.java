package PagesForTest;

import Base.BaseClass;
import Pages.HomePage;
import Pages.Loginpage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPage extends BaseClass {

    @Test
    public void LoginWithValidData() throws InterruptedException {

        HomePage home = new HomePage(driver);
        Loginpage loginPage = new Loginpage(driver);

        home.clickMyAccount();
        home.clickLogin();
        loginPage.login("aem30208@gmail.com", "qwer1234er");
        Thread.sleep(3000);
    }

    @Test
    public void LoginWithInvalidEmail() throws InterruptedException {

        HomePage home = new HomePage(driver);
        Loginpage loginPage = new Loginpage(driver);

        home.clickMyAccount();
        home.clickLogin();
        loginPage.login("abdoooo123@gmail.com", "qwer1234er");
        Thread.sleep(3000);
    }

    @Test
    public void LoginWithInvalidPassword() throws InterruptedException {

        HomePage home = new HomePage(driver);
        Loginpage loginPage = new Loginpage(driver);

        home.clickMyAccount();
        home.clickLogin();
        loginPage.login("aem30208@gmail.com", "qwer34er");
        Thread.sleep(3000);
    }

    @Test
    public void verifyTheFunctionalityOfTheForgottenPasswordLink() throws InterruptedException {

        HomePage home = new HomePage(driver);
        Loginpage loginPage = new Loginpage(driver);

        home.clickMyAccount();
        home.clickLogin();
        loginPage.setEmail("aem30208@gmail.com");
        Thread.sleep(2000);
        loginPage.clickForgottenPassword();
        Thread.sleep(2000);
        loginPage.setEmail("aem30208@gmail.com");
        Thread.sleep(2000);
        loginPage.clickContinueInForgettenPassword();
        Thread.sleep(3000);
    }

}
