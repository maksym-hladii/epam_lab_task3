package com.epam.training.student_maksym_hladii.task2.page;

import com.epam.training.student_maksym_hladii.task2.util.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YOPmailHomePage extends AbstractPage {

    private static final String GOOGLE_CLOUD_URL = "https://yopmail.com/en/";

    @FindBy(xpath = "//a[@href='email-generator']")
    private WebElement generateRandomEmailButton;

    private final By outerIFrameLocator = By.id("aswift_6");
    private final By innerIFrameLocator = By.id("ad_iframe");
    private final By dismissButtonLocator = By.xpath("//div[@id='dismiss-button']");

    public YOPmailHomePage(WebDriver driver) {
        super(driver);
    }

    public YOPmailHomePage openPage() {
        driver.get(GOOGLE_CLOUD_URL);
        return this;
    }

    public YOPmailEmailGeneratorPage generateRandomEmail() {
        generateRandomEmailButton.click();
        dismissGoogleAdsIfPresent();
        return new YOPmailEmailGeneratorPage(driver);
    }

    private void dismissGoogleAdsIfPresent() {
        if (driver.findElements(outerIFrameLocator).size() != 0) {
            WaitUtils.waitForFrameToBeAvailableAndSwitchToIt(outerIFrameLocator, driver, DEFAULT_WAIT_TIMEOUT);
            if (driver.findElements(dismissButtonLocator).size() != 0) {
                WaitUtils.waitForPresenceOfElementLocatedBy(dismissButtonLocator, driver, DEFAULT_WAIT_TIMEOUT).click();
            } else if (driver.findElements(innerIFrameLocator).size() != 0) {
                WaitUtils.waitForFrameToBeAvailableAndSwitchToIt(innerIFrameLocator, driver, DEFAULT_WAIT_TIMEOUT);
                WaitUtils.waitForPresenceOfElementLocatedBy(dismissButtonLocator, driver, DEFAULT_WAIT_TIMEOUT).click();
            }
            driver.switchTo().defaultContent();
        }
    }

}
