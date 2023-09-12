package com.saucedemo.testcases.producttests;

import com.saucedemo.framework.BaseTest;
import com.saucedemo.utils.TestData;
import com.saucedemo.utils.VerificationMsg;
import org.testng.annotations.Test;

public class CheckoutCompleteTest extends BaseTest {
    @Test
    public void test(){
        loginPage.setTxtUsername(TestData.STD_USER.getData());
        loginPage.setTxtPassword(TestData.PASSWORD.getData());
        loginPage.clickBtnLogin();

        homePage.waitForElementToBeClickable(homePage.getBtnShoppingCart());
        homePage.clickBtnBackpackAdd();
        homePage.clickBtnJacketAdd();
        homePage.clickBtnTShirtAdd();
        homePage.clickBtnShoppingCart();
        assertElementSize(cartPage.getCartItems(), 3);
        cartPage.clickBtnCheckout();

        checkoutOnePage.waitForElementToAppear(checkoutOnePage.getBtnContinue());
        checkoutOnePage.setTxtFirstName(TestData.FIRSTNAME.getData());
        checkoutOnePage.setTxtLastName(TestData.LASTNAME.getData());
        checkoutOnePage.setTxtPostalCode(TestData.POSTALCODE.getData());
        checkoutOnePage.clickBtnContinue();

        checkoutTwoPage.clickBtnFinish();

        assertElementDisplayed(checkoutCompletePage.getCheckoutCompleteContainer());
        assertElementText(checkoutCompletePage.getCompleteOrderMsg(), VerificationMsg.COMPLETE_ORDER_MSG.getVerificationMsg());
    }
}
