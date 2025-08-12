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
}
