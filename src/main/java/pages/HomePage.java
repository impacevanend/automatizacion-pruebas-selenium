package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Filter;

public class HomePage extends BasePage {

    //Header links locators

    By qsCreditCardLink_Locator = By.cssSelector("div.header-nav-wrapper a[href='/qualitystream-credit-cards']");
    By headerYoutubeIcon_Locatro = By.cssSelector("div.header-actions.header-actions--right a[aria-label='YouTube']");
    By coursePageLink_Locator = By.cssSelector("div.header-nav-wrapper a[href='/formpage']");
    By webElementTestLink_Locator = By.cssSelector("div.header-nav-wrapper a[href='/webelements-test']");

    //Filters
    By bottomsLink_Locator = By.xpath("//a[@href='/shop/bottoms']");
    By topsLink_Locator    = By.xpath("//a[@href='/shop/tops']");
    By allLinks_Locator    = By.xpath("//a[@href='/shop']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderYtbIconDisplayed(){
        boolean isDisplayed = isDisplayed(headerYoutubeIcon_Locatro);
        System.out.println("Is Youtube Icon present:" + isDisplayed);
        return isDisplayed;
    }

    public  boolean areFiltersPresent(){
        boolean topLinkIsPresent = isDisplayed(topsLink_Locator);
        boolean bottomLinkIsPresent = isDisplayed(bottomsLink_Locator);
        System.out.println("Top link is present: " + topLinkIsPresent);
        System.out.println("Bottom link is present: " + bottomLinkIsPresent);
        return topLinkIsPresent && bottomLinkIsPresent;
    }

    public void clicOnCreditCardLink(){
        click(qsCreditCardLink_Locator);
    }


}
