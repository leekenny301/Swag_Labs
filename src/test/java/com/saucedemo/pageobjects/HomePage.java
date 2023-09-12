package com.saucedemo.pageobjects;

import com.saucedemo.framework.BasePage;
import com.saucedemo.utils.PageURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = ".app_logo") private WebElement header;
    @FindBy(id = "shopping_cart_container") private WebElement btnShoppingCart;

    // Add to Cart btn
    @FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement btnBackpackAdd;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket") private WebElement btnJacketAdd;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt") private WebElement btnTShirtAdd;

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(PageURL.HOME_URL.getPageURL());
    }

    // Getter
    public WebElement getHeader(){
        return header;
    }
    public WebElement getBtnShoppingCart(){
        return btnShoppingCart;
    }

    // Actions
    public void clickBtnShoppingCart(){
        btnShoppingCart.click();
    }
    public void clickBtnBackpackAdd(){
        btnBackpackAdd.click();
    }
    public void clickBtnJacketAdd(){
        btnJacketAdd.click();
    }
    public void clickBtnTShirtAdd(){
        btnTShirtAdd.click();
    }
}
