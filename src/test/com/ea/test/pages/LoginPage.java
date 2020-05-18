package com.ea.test.pages;

import com.ea.framework.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends Base {

    public LoginPage() {

    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;



    public void Login(String userName, String password)
    {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.submit();
    }
}
