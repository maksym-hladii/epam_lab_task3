package com.epam.training.student_maksym_hladii.task2.test;

import com.epam.training.student_maksym_hladii.task2.driver.DriverSingleton;
import com.epam.training.student_maksym_hladii.task2.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

public abstract class AbstractTest {

    protected static WebDriver driver;

    protected final Logger logger = LogManager.getRootLogger();

    protected static final String SEARCH_INPUT = "testdata.search.input";
    protected static final String SEARCH_RESULT = "testdata.search.result";

    protected static ComputeEngineFormData computeEngineFormData;
    protected static ComputeEngineResultForm computeEngineResultForm;
    protected static EmailEstimateFormData emailEstimateFormData;

    @BeforeAll
    public static void setSystemProperties() {
        System.setProperty("browser", "chrome");
        System.setProperty("environment", "dev");
    }

    @BeforeAll
    public static void browserSetUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterAll
    public static void browserTearDown() {
        DriverSingleton.quitDriver();
    }

    @BeforeAll
    public static void clearSystemProperties() {
        System.clearProperty("browser");
        System.clearProperty("environment");
    }

}
