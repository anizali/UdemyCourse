package com.ea.test.seleniumTest;

import com.ea.framework.base.BrowserType;
import com.ea.framework.base.DriverContext;
import com.ea.framework.base.FrameworkInitialize;
import com.ea.test.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends FrameworkInitialize {


    @Before
    public void Initialize() {
        InitilizeBrowser(BrowserType.FireFox);
        DriverContext.Browser.GoToURL("http://executeautomation.com/demosite/Login.html");


    }

    @Test
    public void Login() {
        CurrentPage = GetInstance(LoginPage.class);

        CurrentPage.As(LoginPage.class).Login("Admin", "admin");

    }
}
