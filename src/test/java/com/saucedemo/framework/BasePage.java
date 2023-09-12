package com.saucedemo.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private static final Duration TIMEOUT = Duration.ofSeconds(5);
    private static final Duration SLEEP = Duration.ofMillis(200);
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, TIMEOUT, SLEEP);
        PageFactory.initElements(this.driver, this);
    }

    public void waitForElementToAppear(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForElementToDisappear(WebElement webElement) {
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
