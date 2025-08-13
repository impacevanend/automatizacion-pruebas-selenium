package tests;

import config.BrowserType;
import config.WebDriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        driver = WebDriverFactory.createDriver(BrowserType.CHROME);
        driver.get("https://www.qualitystream-practice.com/");
    }

    @AfterAll
    static void afterAll() {
    driver.quit();
    }
}
