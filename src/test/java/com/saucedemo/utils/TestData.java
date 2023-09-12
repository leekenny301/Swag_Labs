package com.saucedemo.utils;

public enum TestData {
    STD_USER("standard_user"),
    LOCKED_OUT_USER("locked_out_user"),
    PASSWORD("secret_sauce"),
    WRONG_PASSWORD("wrong_password"),
    FIRSTNAME("Kenny"),
    LASTNAME("Lee"),
    POSTALCODE("12345"),
    ;

    private final String credentials;
    TestData(String credentials) {
        this.credentials = credentials;
    }
    public String getData(){
        return this.credentials;
    }
}
