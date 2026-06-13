package PagesForTest;

import Base.BaseClass;
import Pages.HomePage;
import Pages.Loginpage;
import Pages.MyAccount;
import org.testng.annotations.Test;

public class MyAccount_Test extends BaseClass
{
    @Test
    public void EditMyAccount() throws InterruptedException
    {
        HomePage home = new HomePage(driver);
        Loginpage loginPage = new Loginpage(driver);
        MyAccount myAccount = new MyAccount(driver);

        home.clickMyAccount();
        home.clickLogin();
        loginPage.login("aem30208@gmail.com", "qwer1234er");
        Thread.sleep(3000);
        myAccount.clickEditMyAccount();
        Thread.sleep(3000);
    }
}
