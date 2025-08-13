package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.QSCreditCardsPage;

public class QSCreditCardTest extends BaseTest{


    static HomePage homePage;
    static QSCreditCardsPage creditCardsPage;

    @BeforeAll
    static void initPageObjects() {
        homePage = new HomePage(driver);
        creditCardsPage = new QSCreditCardsPage(driver);

        homePage.clicOnCreditCardLink();
        creditCardsPage.enterPassword();
    }

    @Test
    void creditCardsImagesPresent() {
        Assertions.assertTrue(creditCardsPage.areCreditCardsPresent(),
                "Failed: Credit cards images are not present");
    }
    @Test
    void areCreditCardsDetailsCorrect(){

        //En otra clase veremos cómo parametrizar este Test
        String type = "diamond";
        creditCardsPage.selectCreditCard(type);

        String expectedText = "Interés: 18.81% Anual Fee: $550";
        String ccDetails = creditCardsPage.getCreditCardDetails();

        System.out.println("Expected: " + expectedText +"\n Current: "+ccDetails);

        Assertions.assertEquals(expectedText,ccDetails, "CC details are incorrect");
    }

}
