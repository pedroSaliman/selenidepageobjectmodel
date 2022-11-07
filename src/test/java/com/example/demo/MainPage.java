package com.example.demo;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {

    private SelenideElement element = $x("//input[@name='Email']");

    private SelenideElement password = $x("//input[@value='admin']");

    private SelenideElement logLoginButton = $x("//button[@type='submit']");

    public SelenideElement bars = $x("//i[contains(@class, 'fa-bars')]");

    
    public void info(String name,String pass){
        element.clear();
        element.setValue(name);
        password.clear();
        password.setValue(pass);
        logLoginButton.click();
    }

}
