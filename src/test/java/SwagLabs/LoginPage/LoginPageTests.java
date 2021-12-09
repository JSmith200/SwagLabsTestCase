package SwagLabs.LoginPage;

import SwagLabs.SwagGlobalSettings;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class LoginPageTests extends SwagGlobalSettings {

    @Test
    @DisplayName("Login with valid data")
    public void testLogin(){
        driver.findElement(By.id(LoginPageSetting.loginElementById))
                .sendKeys(LoginPageSetting.login);
        driver.findElement(By.id(LoginPageSetting.passElementById))
                .sendKeys(LoginPageSetting.password);
        driver.findElement(By.id(LoginPageSetting.loginButton))
                .click();

        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }
    @Test
    @DisplayName("Login w/o login data")
    public void testLoginNoLogin(){
        driver.findElement(By.id(LoginPageSetting.loginElementById))
                .sendKeys("");
        driver.findElement(By.id(LoginPageSetting.passElementById))
                .sendKeys(LoginPageSetting.password);
        driver.findElement(By.id(LoginPageSetting.loginButton))
                .click();

        assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
    }
    @Test
    @DisplayName("Login w/o Pass data")
    public void testLoginNoPass(){
        driver.findElement(By.id(LoginPageSetting.loginElementById))
                .sendKeys(LoginPageSetting.login);
        driver.findElement(By.id(LoginPageSetting.passElementById))
                .sendKeys("");
        driver.findElement(By.id(LoginPageSetting.loginButton))
                .click();

        assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
    }
    @Test
    @DisplayName("Login w/o login/pass data")
    public void testLoginNoPassNoLogin(){
        driver.findElement(By.id(LoginPageSetting.loginElementById))
                .sendKeys("");
        driver.findElement(By.id(LoginPageSetting.passElementById))
                .sendKeys("");
        driver.findElement(By.id(LoginPageSetting.loginButton))
                .click();

        assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
    }
}