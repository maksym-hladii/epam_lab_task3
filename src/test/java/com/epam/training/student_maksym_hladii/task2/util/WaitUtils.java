package com.epam.training.student_maksym_hladii.task2.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public static void waitForInvisibilityOf(WebElement webElement, WebDriver driver, long timeout) {
        new WebDriverWait(driver, Duration.ofMillis(timeout))
                .until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void waitForFrameToBeAvailableAndSwitchToIt(By by, WebDriver driver, long timeout) {
        new WebDriverWait(driver, Duration.ofMillis(timeout))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }

    public static WebElement waitForPresenceOfElementLocatedBy(By by, WebDriver driver, long timeout) {
        return new WebDriverWait(driver, Duration.ofMillis(timeout))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static WebElement waitForElementToBeClickableBy(By by, WebDriver driver, long timeout) {
        return new WebDriverWait(driver, Duration.ofMillis(timeout))
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitFor(long timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread.sleep() was not successful...");
        }
    }

}
