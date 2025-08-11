package clase1;

import org.junit.jupiter.api.*;

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

    @Test
    void login() {
        System.out.println("This is the login test");
    }
    @Test
    void verifyAboutPage() {
        System.out.println("This is the login test");
    }

    @Test
    void logout() {
        System.out.println("This is the login test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("----> This is the after all");
    }
}
