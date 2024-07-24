package org.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    //By Locators
    private final By emailInputLocator = By.name("email");
    private final By passwordInputLocator = By.name("password");
    private final By loginButtonLocator = By.xpath("//input[@type='submit']");
    private final By forgottenPasswordLinkLocation = By.linkText("Forgotten Password");
    private final By logoutLinkLocator = By.linkText("Logout");

    //constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //methods
    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void clickForgottenPasswordButton() {
        WebElement forgottenPasswordButton = driver.findElement(forgottenPasswordLinkLocation);
        forgottenPasswordButton.click();
    }

    public void clickLogoutButton(){
        WebElement logoutButton = driver.findElement(logoutLinkLocator);
        logoutButton.click();
    }

    public boolean checkForgottenPasswordButton(){
        return driver.findElement(forgottenPasswordLinkLocation).isDisplayed();
    }

    public boolean checkLogoutButton(){
        return driver.findElement(logoutLinkLocator).isDisplayed();
    }

    public void login(String email, String password){
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public String getForgottenPasswordUrl(){
        String forgotPasswordUrl = driver.getCurrentUrl();
        return forgotPasswordUrl;
    }


}
