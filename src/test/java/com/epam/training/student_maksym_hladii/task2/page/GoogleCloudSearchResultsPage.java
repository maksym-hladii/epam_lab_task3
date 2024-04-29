package com.epam.training.student_maksym_hladii.task2.page;

import com.epam.training.student_maksym_hladii.task2.util.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleCloudSearchResultsPage extends AbstractPage {

    public GoogleCloudSearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPricingCalculatorPage clickSearchResult(String searchResultTitle) {
        By searchResultLocator = By.xpath(
                "//a[text()='" + searchResultTitle + "' and contains(@href, 'calculator-legacy')]"
        );
        WebElement searchResult =
                WaitUtils.waitForElementToBeClickableBy(searchResultLocator, driver, DEFAULT_WAIT_TIMEOUT);
        searchResult.click();
        return new GoogleCloudPricingCalculatorPage(driver);
    }

}
