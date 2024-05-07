package com.epam.training.student_maksym_hladii.task2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YOPmailHomePage extends AbstractPage {

    private static final String GOOGLE_CLOUD_URL = "https://yopmail.com/en/";

    @FindBy(xpath = "//a[@href='email-generator']")
    private WebElement generateRandomEmailButton;

    public YOPmailHomePage(WebDriver driver) {
        super(driver);
    }

    public YOPmailHomePage openPage() {
        driver.get(GOOGLE_CLOUD_URL);
        return this;
    }

    public YOPmailEmailGeneratorPage generateRandomEmail() {
        generateRandomEmailButton.click();
        return new YOPmailEmailGeneratorPage(driver);
    }

}
