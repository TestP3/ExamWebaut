package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {
    public static By userInput = By.cssSelector("#field-email");
    public static By passInput = By.cssSelector("#field-password");
    public static By loginButton = By.cssSelector("#submit-login");
}