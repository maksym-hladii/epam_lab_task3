package com.epam.training.student_maksym_hladii.task2.driver;

import com.epam.training.student_maksym_hladii.task2.util.AdBlocker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class DriverListener implements WebDriverListener {

    private final WebDriver driver;

    public DriverListener(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void afterClick(WebElement element) {
        WebDriverListener.super.afterClick(element);
        if (AdBlocker.isGoogleAdPresent(driver.getCurrentUrl())) AdBlocker.dismissGoogleAd(driver);
    }

}
