package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class HomeTest extends BaseTest{

    static HomePage homePage;

    @BeforeAll
    static void initPage() {
        homePage = new HomePage(driver);
    }

    @Test
    void verifyYoutubeIconHeader() {
        boolean isYtbIconPresent = homePage.isHeaderYtbIconDisplayed();
        Assertions.assertTrue(isYtbIconPresent, "Failed: Youtube Icon is not present in the Header");
    }

    @Test
    void verifyFiltersArePresent() {
        Assertions.assertTrue(homePage.areFiltersPresent(), "Failed: Filters links are not present");
    }
}
