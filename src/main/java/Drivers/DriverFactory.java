package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    private final DriverType driverType;
    private boolean isHeadless =  false;

    public DriverFactory(DriverType driverType, boolean isHeadless) {
        this.driverType = driverType;
        this.isHeadless = isHeadless;
    }

    public WebDriver getDriver() {
        switch (driverType) {
            case CHROME:
                return  getChromeDriver();
            case FIREFOX:
                return  getFirefoxDriver();
            case EDGE:
                return  getEdgeDriver();
        }
        return null;
    }

    private ChromeDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        if (isHeadless) {
            options.addArguments("--headless");
        }
        return new ChromeDriver(options);
    }

    private FirefoxDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();
        if (isHeadless) {
            options.addArguments("--headless");
        }
        return new FirefoxDriver(options);
    }

    private EdgeDriver getEdgeDriver() {
        EdgeOptions options = new EdgeOptions();
        if (isHeadless) {
            options.addArguments("--headless");
        }
        return new EdgeDriver(options);
    }
}
