package clase1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSAbout_TestTest {

    @Test
    void verifyAboutPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qualitystream-practice.com/");
        driver.manage().window().maximize();

        By aboutLink_locator = By.xpath("//div[@class='header-nav']//a[@href='/about']");
        By aboutImage_Locator = By.xpath("//img[contains(@src,'IMG_0481.JPG')]");

        driver.findElement(aboutLink_locator).click();

        String expectedURL = "https://www.qualitystream-practice.com/about";
        String currentURL = driver.getCurrentUrl();

        System.out.println("current URL: " + currentURL + "| expeted URL: " + expectedURL);

        Assertions.assertEquals(expectedURL, currentURL, "Error: La URL actual no coincide con la eperada.");

        boolean isImagePresent = driver.findElement(aboutImage_Locator).isDisplayed();

        Assertions.assertTrue(isImagePresent,"Image not present.");

        driver.quit();




    }
}
