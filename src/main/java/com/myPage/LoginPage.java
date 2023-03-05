package com.myPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //defining page locator by using By locator
    private By emailId = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.xpath("//button[@id='loginBtn']");
    private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");


    //Encapsulation--> getters, these are my public getter
    public WebElement getEmailId() {
        return getElement(emailId);
    }

    public WebElement getPassword() {
        return getElement(password);
    }

    public WebElement getLoginButton() {
        return getElement(loginButton);
    }

    public WebElement getHeader() {
        return getElement(header);
    }
    public String getLoginPageTitle(){
        return getPageTitle();
    }
    public String getLoginPageHeader(){
        return getPageHeader(header);
    }

    public HomePage doLogin(String username, String password){
        getEmailId().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return getInstance(HomePage.class);
    }
    //Overloading Concept
    public void doLogin(){
        getEmailId().sendKeys();
        getPassword().sendKeys();
        getLoginButton().click();

    }
    //username: kabindra@gmail.com
    public void doLogin(String userCred) {
        if (userCred.contains("username")) {
            getEmailId().sendKeys(userCred.split(":")[1].trim());
        } else if (userCred.contains("password")) {
            getEmailId().sendKeys(userCred.split(":")[1].trim());
        }
        getLoginButton().click();


    }
}

