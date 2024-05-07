package com.epam.training.student_maksym_hladii.task2.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriver(WebDrivers webDriverIdentifier) {
        switch (webDriverIdentifier) {
            case EDGE -> {
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            }
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            default -> {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
        }
    }

}
