package PagesForTest;

import Base.BaseClass;
import Pages.HomePage;
import Pages.Loginpage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class Registerpage extends BaseClass {

    @Test
    public void Register() throws InterruptedException {

        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage (driver);

        home.clickMyAccount();
        home.clcikRegister();
        registerPage.Register("Abdo","Emad","abdoemdfathy1@gmail.com","qwer1234er");
        Thread.sleep(3000);
    }

    @Test
    public void RegisterWithSameEmail() throws InterruptedException {

        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage (driver);

        home.clickMyAccount();
        home.clcikRegister();
        registerPage.Register("Abdo","Emad","abdoemdfathy1@gmail.com","qwer1234er");
        Thread.sleep(3000);
    }

    @Test
    public void RegisterWithFirstNameFieldEmpty() throws InterruptedException {

        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage (driver);

        home.clickMyAccount();
        home.clcikRegister();
        registerPage.Register("","Emad","abdoemdfathy1@gmail.com","qwer1234er");
        Thread.sleep(3000);
    }

    @Test
    public void  invalidEmailAddressFormat() throws InterruptedException {

        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage (driver);

        home.clickMyAccount();
        home.clcikRegister();
        registerPage.Register("Abdo","Emad","abdoemdfathy1@gmail","qwer1234er");
        Thread.sleep(3000);
    }

    @Test
    public void  PrivacyPolicyCheckboxIsNotSelectedBydDefault() throws InterruptedException {

        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage (driver);

        home.clickMyAccount();
        home.clcikRegister();
        registerPage.setFirstNameLocator("Abdoo");
        registerPage.setLastNameLocator("ahmed");
        registerPage.setEmailLocator("mo@gmail.com");
        registerPage.setPasswordLocator("123456");
        registerPage.setContinueLocator();
        Thread.sleep(3000);
    }

    @Test
    public void  ErrorMessageAppearWhenNotAgreeingToThePrivacyPolicy() throws InterruptedException {

        HomePage home = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage (driver);

        home.clickMyAccount();
        home.clcikRegister();
        registerPage.setFirstNameLocator("Abdoo");
        registerPage.setLastNameLocator("ahmed");
        registerPage.setEmailLocator("m1o@gmail.com");
        registerPage.setPasswordLocator("123456");
        Thread.sleep(3000);
        registerPage.setContinueLocator();
        Thread.sleep(3000);
    }





}
