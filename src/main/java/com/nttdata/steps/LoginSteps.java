package com.nttdata.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.nttdata.page.LoginPage;

public class LoginSteps {
    private final WebDriverWait wait;
    private WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(String user, String password) {
        driver.findElement(LoginPage.userInput).sendKeys(user);
        driver.findElement(LoginPage.passInput).sendKeys(password);
        driver.findElement(LoginPage.loginButton).click();
    }
}