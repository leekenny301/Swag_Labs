package com.saucedemo.testcases.logintests;

import com.saucedemo.framework.BaseTest;
import com.saucedemo.utils.VerificationMsg;
import com.saucedemo.utils.TestData;
import org.testng.annotations.Test;

public class LoginLockedOutUserTest extends BaseTest {
    @Test
    public void test(){
        loginPage.setTxtUsername(TestData.LOCKED_OUT_USER.getData());
        loginPage.setTxtPassword(TestData.PASSWORD.getData());
        loginPage.clickBtnLogin();
        assertElementDisplayed(loginPage.getMsgError());
        assertElementContainsText(loginPage.getMsgError(), VerificationMsg.LOCKED_OUT_MSG.getVerificationMsg());
    }
}
