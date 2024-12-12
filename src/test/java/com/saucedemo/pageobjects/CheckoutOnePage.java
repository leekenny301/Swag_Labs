package com.saucedemo.pageobjects;

import com.saucedemo.framework.BasePage;
import com.saucedemo.utils.PageURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOnePage extends BasePage {
    @FindBy(id = "first-name") private WebElement txtFirstName;
    @FindBy(id = "last-name") private WebElement txtLastName;
    @FindBy(id = "postal-code") private WebElement txtPostalCode;
    @FindBy(id = "continue") private WebElement btnContinue;


    public CheckoutOnePage(WebDriver driver) {
        super(driver);
        driver.get(PageURL.CHECKOUT_ONE_URL.getPageURL());
    }

    // Getters
    public WebElement getBtnContinue(){
        return btnContinue;
    }

    // Setters
    public void setTxtFirstName(String firstName){
        txtFirstName.sendKeys(firstName);
    }
    public void setTxtLastName(String lastName){
        txtLastName.sendKeys(lastName);
    }
    public void setTxtPostalCode(String postalCode){
        txtPostalCode.sendKeys(postalCode);
    }

    // Actions
    public void clickBtnContinue(){
        btnContinue.click();
    }
}
