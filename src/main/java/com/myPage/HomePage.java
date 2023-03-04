package com.myPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private By header = By.xpath("//i18n-string[normalize-space()='Steps to get started with HubSpot']");


    public WebElement getHeader() {
        return getElement(header);
    }

    //Page action:
    public String getHomePageTitle(){
        return getPageTitle();
    }
    public String getHomePageHeader(){
        return getPageHeader(header);
    }
}
