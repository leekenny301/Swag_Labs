package com.saucedemo.pageobjects;

import com.saucedemo.framework.BasePage;
import com.saucedemo.utils.PageURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage {

    @FindBy(id = "checkout_complete_container") private WebElement checkoutCompleteContainer;
    @FindBy(css = ".complete-header") private WebElement completeOrderMsg;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        driver.get(PageURL.CHECKOUT_COMPLETE_URL.getPageURL());
    }

    // Getter
    public WebElement getCheckoutCompleteContainer(){
        return checkoutCompleteContainer;
    }
    public WebElement getCompleteOrderMsg(){
        return completeOrderMsg;
    }
}
