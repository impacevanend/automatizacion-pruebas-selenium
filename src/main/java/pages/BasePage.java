package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver; //creando objeto WebDriver
    WebDriverWait wait; //objeto que se encarga de las esperas

    private static final int TIMEOUT = 10;

    //Constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

    }

    public WebElement findElement(By locator){
        //Espera que el elemento está presente
        waitForElementToBePresent(locator);
        return driver.findElement(locator);
    }

    public void click(By locator){
        waitForElementToBeClickable(locator);
        driver.findElement(locator).click();
    }

    public void type(By locator, String text){
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public boolean isDisplayed(By locator){
        try {
          return  findElement(locator).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void waitForElementToBePresent(By locator){

        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }

    public void waitForElementToBeClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }




}