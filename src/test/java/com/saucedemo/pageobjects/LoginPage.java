package com.saucedemo.pageobjects;

import com.saucedemo.framework.BasePage;
import com.saucedemo.utils.PageURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement txtUsername;
    @FindBy(id = "password")
    private WebElement txtPassword;
    @FindBy(id = "login-button")
    private WebElement btnLogin;
    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement msgError;

    public LoginPage(WebDriver driver) {
        super(driver);
        driver.get(PageURL.LOGIN_URL.getPageURL());
    }

    // Getter
    public WebElement getMsgError() {
        return msgError;
    }

    // Actions
    public void setTxtUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }
}
