package com.myPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    //abstract method we will define
    WebDriver driver;
    WebDriverWait wait;

    //create a Constructor // In Java abstract class constructor are allows to create in Java.
    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 15);

    }

    //Now defining the abstract method. WithOut Method body. Just a signature only
    //in every this these kinds of method should be there
    public abstract String getPageTitle();

    public abstract String getPageHeader(By locator);

    public abstract WebElement getElement(By locator);

    public abstract void waitForElementPresent(By locator);

    public abstract void waitForPageTitle(String title);

    public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
        try {
            return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
