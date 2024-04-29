package com.epam.training.student_maksym_hladii.task2.page;

import com.epam.training.student_maksym_hladii.task2.util.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YOPmailInboxPage extends AbstractPage {

    @FindBy(id = "refresh")
    private WebElement refreshInboxButton;

    private final By iframeLocator = By.name("ifmail");
    private final By totalEstimatedCostLabelLocator = By.xpath("//h3[contains(text(), 'USD')]");

    public YOPmailInboxPage(WebDriver driver) {
        super(driver);
    }

    public YOPmailInboxPage refreshInbox() {
        WaitUtils.waitFor(REFRESH_INBOX_TIMEOUT);
        refreshInboxButton.click();
        WaitUtils.waitFor(EMAIL_LOADING_TIMEOUT);
        return this;
    }

    public String getTotalEstimatedCost() {
        WaitUtils.waitForFrameToBeAvailableAndSwitchToIt(iframeLocator, driver, DEFAULT_WAIT_TIMEOUT);
        WebElement totalEstimatedCostLabel = driver.findElement(totalEstimatedCostLabelLocator);
        return totalEstimatedCostLabel.getText();
    }

}
