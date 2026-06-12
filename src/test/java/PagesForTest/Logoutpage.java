package PagesForTest;
import Base.BaseClass;
import Pages.HomePage;
import Pages.Loginpage;
import Pages.LogoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Logoutpage extends BaseClass
{
    @Test
    public void logOut() throws InterruptedException {
       HomePage home = new HomePage(driver);
       Loginpage loginPage = new Loginpage(driver);
       LogoutPage logoutPage = new LogoutPage(driver);

       home.clickMyAccount();
       home.clickLogin();
       loginPage.login("aem30208@gmail.com" , "qwer1234er");
       Thread.sleep(3000);
       logoutPage.clickLogoutBtn();
       Thread.sleep(3000);
       logoutPage.clickContinueBtn();
       Thread.sleep(2000);
   }

}
