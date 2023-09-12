package com.saucedemo.utils;

public enum VerificationMsg {
    LOCKED_OUT_MSG("Epic sadface: Sorry, this user has been locked out."),
    WRONG_PASSWORD_MSG("Epic sadface: Username and password do not match any user in this service"),
    COMPLETE_ORDER_MSG("Thank you for your order!"),
    ;

    private final String verificationMsg;

    VerificationMsg(String errorMsg) {
        this.verificationMsg = errorMsg;
    }

    public String getVerificationMsg() {
        return this.verificationMsg;
    }
}
