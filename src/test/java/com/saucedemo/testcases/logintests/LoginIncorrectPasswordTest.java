package com.saucedemo.testcases.logintests;

import com.saucedemo.framework.BaseTest;
import com.saucedemo.utils.VerificationMsg;
import com.saucedemo.utils.TestData;
import org.testng.annotations.Test;

public class LoginIncorrectPasswordTest extends BaseTest {
    @Test
    public void test(){
        loginPage.setTxtUsername(TestData.STD_USER.getData());
        loginPage.setTxtPassword(TestData.WRONG_PASSWORD.getData());
        loginPage.clickBtnLogin();
        assertElementDisplayed(loginPage.getMsgError());
        assertElementContainsText(loginPage.getMsgError(), VerificationMsg.WRONG_PASSWORD_MSG.getVerificationMsg());
    }
}
