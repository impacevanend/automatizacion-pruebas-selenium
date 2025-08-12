package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QSCreditCardsPage extends BasePage{
    //input password
    By inputPassword_Locator = By.name("password");

    //Credit cards
    By diamondCC_Locator = By.xpath("//img[contains(@src,'QStream+Diamond+Credit+Card1.png')]");
    By goldenCC_Locator = By.xpath("//img[contains(@src,'QStream+Golden+Credit+Card1.png')]");
    By platinumCC_Locator = By.xpath("//img[contains(@src,'QStream+Platinum+Credit+Card1.png')]");

    //Forms Locator
    By selectCreditCardType_Locator = By.id("cardType");
    By creditCardDetailsLabel_Locator = By.id("cardDetails");


    public QSCreditCardsPage(WebDriver driver) {
        super(driver);
    }

    public void enterPassword(){
        waitForElementToBeClickable(inputPassword_Locator);
        if(isDisplayed(inputPassword_Locator)){
            String password = "qa123";
            type(inputPassword_Locator, password);
            //We need to submit
            submit(inputPassword_Locator);
        }else {
            System.out.println("Password input was not present");
        }
    }

    public boolean areCreditCardsPresent(){
        boolean diamondCreditCard = isDisplayed(diamondCC_Locator);
        boolean goldenCreditCard = isDisplayed(goldenCC_Locator);
        boolean platinumCreditCard = isDisplayed(platinumCC_Locator);
        System.out.println("Is diamond credit cart present" + diamondCreditCard);

        System.out.println("Is gold credit cart present" + goldenCreditCard);

        System.out.println("Is platinum credit cart present" + platinumCreditCard);

        return diamondCreditCard && goldenCreditCard && platinumCreditCard;
    }

    public void selectCreditCard(String creditCardType){
        // We need to scroll to the select first
        scrollIntoView(selectCreditCardType_Locator);
        //Finding the select web element
        WebElement selectElement = findElement(selectCreditCardType_Locator);
        Select select = new Select(selectElement);
        //Selecting credit card card by value
        select.selectByValue(creditCardType);
    }



    public String getCreditCardDetails() {
        String details = getText(creditCardDetailsLabel_Locator);
        System.out.println("Credit card details: " + details);
        return details;
    }


}