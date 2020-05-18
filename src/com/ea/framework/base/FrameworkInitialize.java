package com.ea.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base{


    public void InitilizeBrowser (BrowserType type)
    {

        WebDriver driver = null;
        switch (type)
        {
            case Chrome:
                System.setProperty("webdriver.gecko.driver","tools/geckodriver" );
                driver = new ChromeDriver();
                break;
            case FireFox:
                System.setProperty("webdriver.gecko.driver","tools/geckodriver" );
                driver = new FirefoxDriver();
                break;

        }

        DriverContext.setDriver(driver);

        DriverContext.Browser = new Browser(driver);


    }

}
