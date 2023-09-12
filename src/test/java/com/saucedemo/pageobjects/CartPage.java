package com.saucedemo.pageobjects;

import com.saucedemo.framework.BasePage;
import com.saucedemo.utils.PageURL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ".cart_item") private List<WebElement> cartItems;
    @FindBy(id = "checkout") private WebElement btnCheckout;

    public CartPage(WebDriver driver){
        super(driver);
        driver.get(PageURL.CART_URL.getPageURL());
    }

    // Getter
     public List<WebElement> getCartItems(){
        return cartItems;
     }

    // Actions
     public void clickBtnCheckout(){
        btnCheckout.click();
     }
}
