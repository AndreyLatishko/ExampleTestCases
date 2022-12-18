package com.tests.base;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class WebDriverFactory{
    private static WebDriverManager driverManager;
    public static WebDriverManager setUP(String name) {
        switch (name){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                Configuration.browser = "chrome";
                Configuration.browserSize = "1920x1080";
                Configuration.timeout = 40;
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                Configuration.browser = "opera";
                Configuration.browserSize = "390x844";
                // browserSize for Iphone12Pro
                Configuration.timeout = 10;
                break;
            default:
                throw new RuntimeException("Incorrect browser");
        }
        return WebDriverManager.getInstance();
    }

}
