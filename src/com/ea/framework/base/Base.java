package com.ea.framework.base;

import org.openqa.selenium.support.PageFactory;

public class Base extends BasePage{

    public static BasePage CurrentPage;

    public <TPage extends Base> TPage GetInstance(Class<TPage> page)
    {
        Object obj = PageFactory.initElements(DriverContext.Driver,page);
        return page.cast(obj);
    }

}
