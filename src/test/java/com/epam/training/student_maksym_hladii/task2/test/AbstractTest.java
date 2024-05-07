package com.epam.training.student_maksym_hladii.task2.test;

import com.epam.training.student_maksym_hladii.task2.driver.DriverListener;
import com.epam.training.student_maksym_hladii.task2.driver.DriverSingleton;
import com.epam.training.student_maksym_hladii.task2.driver.WebDrivers;
import com.epam.training.student_maksym_hladii.task2.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public abstract class AbstractTest {

    protected static WebDriver driver;

    protected final Logger logger = LogManager.getRootLogger();

    protected static final String SEARCH_INPUT = "testdata.search.input";
    protected static final String SEARCH_RESULT = "testdata.search.result";

    protected static ComputeEngineFormData computeEngineFormData;
    protected static ComputeEngineResultForm computeEngineResultForm;
    protected static EmailEstimateFormData emailEstimateFormData;

    @BeforeAll
    public static void setEnvironmentProperty() {
        System.setProperty("environment", "dev");
    }

    @BeforeAll
    public static void browserSetUp() {
        driver = DriverSingleton.getDriver(WebDrivers.CHROME);

        DriverListener driverListener = new DriverListener(driver);
        driver = new EventFiringDecorator<>(driverListener).decorate(driver);
    }

    @AfterAll
    public static void browserTearDown() {
        DriverSingleton.quitDriver();
    }

    @BeforeAll
    public static void clearEnvironmentProperty() {
        System.clearProperty("environment");
    }

}
