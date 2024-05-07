package com.epam.training.student_maksym_hladii.task2.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdBlocker {

    private static final String GOOGLE_AD_FRAGMENT_IDENTIFIER = "#google_vignette";

    private static final long WAIT_TIMEOUT = 10000;

    private static final By OUTER_IFRAME_LOCATOR = By.id("aswift_6");
    private static final By INNER_IFRAME_LOCATOR = By.id("ad_iframe");
    private static final By DISMISS_BUTTON_LOCATOR = By.xpath("//div[@id='dismiss-button']");

    public static boolean isGoogleAdPresent(String url) {
        return url.endsWith(GOOGLE_AD_FRAGMENT_IDENTIFIER);
    }

    public static void dismissGoogleAd(WebDriver driver) {
        if (driver.findElements(OUTER_IFRAME_LOCATOR).size() != 0) {
            WaitUtils.waitForFrameToBeAvailableAndSwitchToIt(OUTER_IFRAME_LOCATOR, driver, WAIT_TIMEOUT);

            if (driver.findElements(DISMISS_BUTTON_LOCATOR).size() != 0) {
                WaitUtils.waitForPresenceOfElementLocatedBy(DISMISS_BUTTON_LOCATOR, driver, WAIT_TIMEOUT).click();
            } else if (driver.findElements(INNER_IFRAME_LOCATOR).size() != 0) {
                WaitUtils.waitForFrameToBeAvailableAndSwitchToIt(INNER_IFRAME_LOCATOR, driver, WAIT_TIMEOUT);
                WaitUtils.waitForPresenceOfElementLocatedBy(DISMISS_BUTTON_LOCATOR, driver, WAIT_TIMEOUT).click();
            }

            driver.switchTo().defaultContent();
        }
    }

}
