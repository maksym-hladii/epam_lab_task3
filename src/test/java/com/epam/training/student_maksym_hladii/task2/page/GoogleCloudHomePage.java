package com.epam.training.student_maksym_hladii.task2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleCloudHomePage extends AbstractPage {

    private static final String GOOGLE_CLOUD_URL = "https://cloud.google.com/";

    @FindBy(xpath = "//div[@class='ND91id LLv0lb']")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchField;


    public GoogleCloudHomePage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudHomePage openPage() {
        driver.get(GOOGLE_CLOUD_URL);
        return this;
    }

    public GoogleCloudHomePage clickSearchIcon() {
        searchIcon.click();
        return this;
    }

    public GoogleCloudSearchResultsPage searchFor(String searchInput) {
        searchField.clear();
        searchField.sendKeys(searchInput);
        searchField.submit();
        return new GoogleCloudSearchResultsPage(driver);
    }

}
