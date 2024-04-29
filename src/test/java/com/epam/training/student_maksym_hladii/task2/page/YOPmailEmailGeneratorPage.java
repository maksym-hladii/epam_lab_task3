package com.epam.training.student_maksym_hladii.task2.page;

import com.epam.training.student_maksym_hladii.task2.util.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YOPmailEmailGeneratorPage extends AbstractPage {

    private final By generatedEmailLocator = By.id("geny");

    @FindBy(xpath = "//span[text()='Check Inbox']/parent::button")
    private WebElement checkInboxButton;

    public YOPmailEmailGeneratorPage(WebDriver driver) {
        super(driver);
    }

    public String getEmail() {
        WebElement generatedEmail =
                WaitUtils.waitForPresenceOfElementLocatedBy(generatedEmailLocator, driver, DEFAULT_WAIT_TIMEOUT);
        return generatedEmail.getText();
    }

    public YOPmailInboxPage clickCheckInbox() {
        checkInboxButton.click();
        return new YOPmailInboxPage(driver);
    }

}
