package com.saucedemo.pageobjects;

import com.saucedemo.framework.BasePage;
import com.saucedemo.utils.PageURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutTwoPage extends BasePage {

    @FindBy(id = "finish") private WebElement btnFinish;
    public CheckoutTwoPage(WebDriver driver) {
        super(driver);
        driver.get(PageURL.CHECKOUT_TWO_URL.getPageURL());
    }

    // Actions
    public void clickBtnFinish(){
        btnFinish.click();
    }
}
