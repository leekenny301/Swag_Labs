package com.saucedemo.testcases.logintests;

import com.saucedemo.framework.BaseTest;
import com.saucedemo.utils.TestData;
import org.testng.annotations.Test;

public class LoginSuccessfulTest extends BaseTest {
    @Test
    public void test(){
        loginPage.setTxtUsername(TestData.STD_USER.getData());
        loginPage.setTxtPassword(TestData.PASSWORD.getData());
        loginPage.clickBtnLogin();
        assertElementDisplayed(homePage.getHeader());
        assertElementDisplayed(homePage.getBtnShoppingCart());
    }
}
