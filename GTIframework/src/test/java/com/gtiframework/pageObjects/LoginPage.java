package com.gtiframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //all elements of login page goes here

    @FindBy (name = "name")
    WebElement userEmail;

    @FindBy (name="pass")
    @CacheLookup
    WebElement password;

    @FindBy (name ="op")
    @CacheLookup
    WebElement btn_login;

    //action to enter email
    public void setUserEmail (String email)
    {
        userEmail.sendKeys(email);

    }
    public void getEmail()
    {
        userEmail.getText();

    }

    public void setPassword(String pass)
    {
        password.sendKeys(pass);
    }

    public void clearEmailField()
    {
        userEmail.clear();
    }

    public void clearPasswordField()
    {
        password.clear();
    }

    public void login_btn()
    {
        btn_login.click();
    }


}
