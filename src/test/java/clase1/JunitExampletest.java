package clase1;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JunitExampletest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("----> This is the before all");
    }


    @BeforeEach
    void setUp() {
        System.out.println("-> This is the BeforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("-> This is the AfterEach");
    }

    @Order(1)
    @Test
    void login() {
        System.out.println("This is the login test");
    }

    @Order(2)
    @DisplayName("ABOUT_001 - This test verify the about image an titel.")
    @Test
    void verifyAboutPage() {
        System.out.println("This is about test");
    }

    @Order(3)
    @Disabled
    @DisplayName("HEADER_001 - This test version header (BUG#2471)")
    @Test
    void verifyHeaderPager() {
        System.out.println("This is header test");
    }

    @Order(4)
    @Test
    void logout() {
        System.out.println("This is the login test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("----> This is the after all");
    }
}
