package com.saucedemo.framework;

import com.saucedemo.pageobjects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

import static org.testng.Assert.assertEquals;

public abstract class BaseTest {
    private static WebDriver driver;
    protected static LoginPage loginPage;
    protected static HomePage homePage;
    protected static CartPage cartPage;
    protected static CheckoutOnePage checkoutOnePage;
    protected static CheckoutTwoPage checkoutTwoPage;
    protected static CheckoutCompletePage checkoutCompletePage;


    @BeforeClass
    protected void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        checkoutOnePage = new CheckoutOnePage(driver);
        checkoutTwoPage = new CheckoutTwoPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);
    }

    @AfterClass
    protected void afterTest(){
        if (driver != null){
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            } finally {
                driver.close();
                driver.quit();
            }
        }
    }

    protected void assertElementDisplayed(WebElement webElement) {
        Assert.assertTrue(webElement.isDisplayed());
    }

    protected void assertElementEnabled(WebElement webElement) {
        Assert.assertTrue(webElement.isEnabled());
    }

    protected void assertElementSelected(WebElement webElement) {
        Assert.assertTrue(webElement.isSelected());
    }

    protected void assertElementText(WebElement webElement, String expectedText) {
        assertEquals(webElement.getText(), expectedText);
    }

    protected void assertElementContainsText(WebElement webElement, String expectedText) {
        String actualText = webElement.getText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    protected void assertElementAttributeValue(WebElement webElement, String attribute, String expectedValue) {
        String actualValue = webElement.getAttribute(attribute);
        assertEquals(actualValue, expectedValue);
    }

    protected void assertElementSize(List<WebElement> webElement, int elementSize){
        assertEquals(webElement.size(), elementSize);
    }

    protected void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

}
