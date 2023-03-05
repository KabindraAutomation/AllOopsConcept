package com.MyTest;

import com.myPage.HomePage;
import com.myPage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
   // public LoginPage loginPage;

    @Test(priority = 1, enabled = false)
    public void verifyLoginPageTitleTest(){
//        loginPage = new LoginPage(driver);
//        String title = loginPage.getLoginPageTitle();
    String title = page.getInstance(LoginPage.class).getLoginPageTitle();
        System.out.println(title);
        Assert.assertEquals(title, "HubSpot Login");
    }

    @Test(priority = 2, enabled = false)
    public void verifyLoginPageHeader(){
        String headerTitle = page.getInstance(LoginPage.class).getLoginPageHeader();
        System.out.println(headerTitle);
        Assert.assertEquals(headerTitle, "Don't have an account?");
    }
    @Test(priority = 3)
    public void doLoginTest(){
        HomePage homepage = page.getInstance(LoginPage.class).
                doLogin("kabindradecoding@gmail.com", "K@le.Dai1122");
        String headerHome = homepage.getHomePageHeader();
        Assert.assertEquals(headerHome,"setup-guide-components.checklist.titleSimplified");
    }
}
