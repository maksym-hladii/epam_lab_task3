package com.epam.training.student_maksym_hladii.task2.driver;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton() {
    }

    public static WebDriver getDriver(WebDrivers webDriverIdentifier) {
        if (driver == null) {
            driver = DriverFactory.getDriver(webDriverIdentifier);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
