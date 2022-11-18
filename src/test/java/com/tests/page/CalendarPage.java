package com.tests.page;

import com.codeborne.selenide.SelenideElement;
import com.tests.base.BaseSelenideTest;

import static com.codeborne.selenide.Selenide.$x;

public class CalendarPage extends BaseSelenideTest {
    public SelenideElement getOptionPlace() {
        return $x("//select[@name='city']//option//following::option[1]");
    }
    public SelenideElement getOptionTopic() {
        return $x("//select[@name='tag']//option//following::option[24]");
    }

    public SelenideElement getFirstEvent() {
        return $x("//following::article[1]//h2//a");
    }
}
