package clase1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import tests.BaseTest;
import utils.Utility;

public class BasicLocationStrategiesTest extends BaseTest {
    static HomePage homePage;

    @BeforeAll
    static void initPage() {
        homePage = new HomePage(driver);
        homePage.clickOnCoursesLink();
    }

    @Test
    void testId() {
        By inputName_Locator = By.id("name");
        WebElement element = driver.findElement(inputName_Locator);

        Utility.printElementInfo("input name", element);
    }

    @Test
    void testName() {
        By inputEmail_Locator = By.name("email");
        WebElement element = driver.findElement(inputEmail_Locator);
        Utility.printElementInfo("input email", element);
    }

    @Test
    void testClassName() {
        By imageThumbnail_Locator = By.className("thumbnail");
        WebElement element = driver.findElement(imageThumbnail_Locator);
        Utility.printElementInfo("Image thumbnail", element);
    }

    @Test
    void testTagName() {
        By table_Locator = By.tagName("table");
        WebElement element = driver.findElement(table_Locator);
        Utility.printElementInfo("table", element);
    }

    @Test
    void testLinkText() {
        By appointmentLink_Locator = By.linkText("Go to Appointment Page");
        WebElement element = driver.findElement(appointmentLink_Locator);
        Utility.printElementInfo("Appointment link", element);
    }

    @Test
    void testPartialLinkTest() {
        By appointmentLink_Locator = By.partialLinkText("Go to");
        WebElement element = driver.findElement(appointmentLink_Locator);
        Utility.printElementInfo("Appointment link", element);
    }
}
