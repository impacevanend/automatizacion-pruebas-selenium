package clase1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import tests.BaseTest;
import utils.Utility;

import static tests.BaseTest.driver;

public class CssSelectorStrategiesTest extends BaseTest {

    static HomePage homePage;

    @BeforeAll
    static void initPage() {
        homePage = new HomePage(driver);
        homePage.clickOnCoursesLink();
    }

    @Test
    void testTagName() {
        By tagName_Locator = By.cssSelector("input");
        WebElement element = driver.findElement(tagName_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Tag name y atributo


    @Test
    void testTagNameAttr() {
        By inputName_Locator = By.cssSelector("input[type]");
        WebElement element = driver.findElement(inputName_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Tag name + atributo con valor
    @Test
    void testTagNameAttrValue() {
        By inputEmail_Locator = By.cssSelector("input[type='email']");
        WebElement element = driver.findElement(inputEmail_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Id usando el numeral
    @Test
    void testID() {
        By inputEmail_Locator = By.cssSelector("#email");
        WebElement element = driver.findElement(inputEmail_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Tag + id usando #
    @Test
    void testTagID() {
        By inputEmail_Locator = By.cssSelector("input#email");
        WebElement element = driver.findElement(inputEmail_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Class unsando .
    @Test
    void testClass() {
        By image_Locator = By.cssSelector(".thumbnail");
        WebElement element = driver.findElement(image_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    // Tag y class usando .
    @Test
    void testTagClass() {
        By image_Locator = By.cssSelector("img.thumbnail");
        WebElement element = driver.findElement(image_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Usando * (cualquier elemento)
    @Test
    void testAnyElement() {
        By label_Locator = By.cssSelector("*[class='label']");
        WebElement element = driver.findElement(label_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Padre-hijo relationship
    @Test
    void testFatherSon() {
        By form_Locator = By.cssSelector("div>form");
        WebElement element = driver.findElement(form_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Relación hermanos (siblings)
    @Test
    void testSiblings() {
        By table_Locator = By.cssSelector("form+table");
        WebElement element = driver.findElement(table_Locator);
        Utility.printElementInfo("table", element);
    }

    //Relación de sucesor
    @Test
    void testSucsessor() {
        By inputName_Locator = By.cssSelector("div[class='sqs-block-content'] input");
        WebElement element = driver.findElement(inputName_Locator);
        Utility.printElementInfo("table", element);
    }

    //Restriciones de las funiones no se pueden ejecutar sobre el texto visible.
    //Partial match ends with - $=
    @Test
    void testEndsWith() {
        By btnAdicionarCurso_Locator = By.cssSelector("button[type$='tton']");
        WebElement element = driver.findElement(btnAdicionarCurso_Locator);
        Utility.printElementInfo("Botón adicionar curso", element);
    }

    //Partial Match Starts with - ^=
    @Test
    void testStartsWith() {
        By inputName_Locator = By.cssSelector("*[name^='nam']");
        WebElement element = driver.findElement(inputName_Locator);
        Utility.printElementInfo("Botón adicionar curso", element);
    }

    //Partial Match - Contains Word - ~= (debe ser la palabra completa. Es muy importante)
    @Test
    void testContainsWord() {
        By checkboxJava_Locator = By.cssSelector("input[value~='Java']");
        WebElement element = driver.findElement(checkboxJava_Locator);
        Utility.printElementInfo("CheckBox Java", element);
    }


    //Multiples atributos con valor
    @Test
    void testMultipleAttrValue() {
        By inputName_Locator = By.cssSelector("input[type='text'][name='name']");
        WebElement element = driver.findElement(inputName_Locator);
        Utility.printElementInfo("Input Name", element);
    }

    //Logical OR (coma) ,
    @Test
    void testLogicalOR() {
        By InputName_Locator = By.cssSelector("input,*[type='email']");
        WebElement element = driver.findElement(InputName_Locator);
        Utility.printElementInfo("Checkbox_Java_Locator", element);
    }

    //Using not() function
    @Test
    void testNotFunction() {
        By InputLastName_Locator = By.cssSelector("input:not([id='name'])");
        WebElement element = driver.findElement(InputLastName_Locator);
        Utility.printElementInfo("InputLastName_Locator", element);
    }








}
