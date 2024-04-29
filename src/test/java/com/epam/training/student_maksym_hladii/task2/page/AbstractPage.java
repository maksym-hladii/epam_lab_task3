package com.epam.training.student_maksym_hladii.task2.page;

import com.epam.training.student_maksym_hladii.task2.util.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected WebDriver driver;

    protected final long DEFAULT_WAIT_TIMEOUT = 10000;
    protected final long REFRESH_INBOX_TIMEOUT = 3000;
    protected final long EMAIL_LOADING_TIMEOUT = 1000;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectDroplistOption(String droplistOptionDefaultLocator, String option) {
        By droplistOptionLocator = By.xpath(String.format(droplistOptionDefaultLocator, option));
        WebElement droplistOption =
                WaitUtils.waitForElementToBeClickableBy(droplistOptionLocator, driver, DEFAULT_WAIT_TIMEOUT);
        droplistOption.click();
        WaitUtils.waitForInvisibilityOf(droplistOption, driver, DEFAULT_WAIT_TIMEOUT);
    }

}
