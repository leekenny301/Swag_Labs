package com.saucedemo.utils;

public enum PageURL {
    LOGIN_URL("https://www.saucedemo.com/"),
    HOME_URL("https://www.saucedemo.com/inventory.html"),
    CART_URL("https://www.saucedemo.com/cart.html"),
    CHECKOUT_ONE_URL("https://www.saucedemo.com/checkout-step-one.html"),
    CHECKOUT_TWO_URL("https://www.saucedemo.com/checkout-step-two.html"),
    CHECKOUT_COMPLETE_URL("https://www.saucedemo.com/checkout-complete.html");

    ;

    private final String pageURL;
    PageURL(String pageURL) {
        this.pageURL = pageURL;
    }
    public String getPageURL(){
        return this.pageURL;
    }
}
