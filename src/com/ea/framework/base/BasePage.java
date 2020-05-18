package com.ea.framework.base;


public class BasePage {


    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance)
    {
        try
        {
            return (TPage)this;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
