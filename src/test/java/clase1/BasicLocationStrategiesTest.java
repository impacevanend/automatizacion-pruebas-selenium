package clase1;

import org.junit.jupiter.api.BeforeAll;
import pages.HomePage;
import tests.BaseTest;

public class BasicLocationStrategiesTest extends BaseTest {
    static HomePage homePage;

    @BeforeAll
    static void initPage() {

        homePage = new HomePage(driver);
    }



}
