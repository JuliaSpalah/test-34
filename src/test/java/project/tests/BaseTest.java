package project.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import project.base.WebDriverProvider;
import project.pages.MainPage;
import project.pages.ProductPage;
import project.pages.RegisterPage;
import project.pages.WelcomePage;

import static org.testng.Assert.fail;

public class BaseTest {

    private final WebDriverProvider webDriverProvider = new WebDriverProvider();
    private final MainPage mainPage = new MainPage();
    private final ProductPage productPage = new ProductPage();
    private final RegisterPage registerPage = new RegisterPage();
    private final WelcomePage welcomePage = new WelcomePage();


    @Before
    public void setup() {
        webDriverProvider.setup();
        mainPage.setWebDriverProvider(webDriverProvider);
        productPage.setWebDriverProvider(webDriverProvider);
        registerPage.setWebDriverProvider(webDriverProvider);
        welcomePage.setWebDriverProvider(webDriverProvider);
    }

    @After
    public void dispose() {
        webDriverProvider.dispose();
    }

    @Test
    public void testClickOnBrands() {
        // викликаєм функцію openMainPage у змінної MainPage
        mainPage.open();
        try {
            mainPage.clickOnBrandsLink();
        } catch (Exception e) {
            fail("Can't click on 'Brands page'");
        }

        String[] brands = {"Apple", "Canon", "Hewlett-Packard", "HTC", "Palm", "Sony"};
        for (String brand : brands) {
            try {
                productPage.getBrandLink(brand);
            } catch (NoSuchElementException e) {
                fail("Brand " + brand + " wasn't found on product page");
            }
        }
    }

    @Test
    public void testClickOnMyAccount() {
        mainPage.open();
        try {
            mainPage.clickOnMyAccount();
            mainPage.clickOnRegister();
        } catch (Exception e) {
            fail("Can't click on 'My Account' and then 'Register' buttons");
        }

        try {
            registerPage.setFirstName("John");
            registerPage.setLastName("Snow");
            registerPage.setEmail("john.snow@mail.com");
            registerPage.setPassword("K0zadereza#123");
        } catch (Exception e) {
            fail("Can`t fill in user credentials");
        }

        try {
            registerPage.checkAgreeCheckbox();
        } catch (Exception e) {
            fail("Can't check an Agree checkbox");
        }

        try {
            registerPage.clickOnContinueButton();
        } catch (Exception e) {
            fail("Can`t click on button Continue");
        }

        try {
            welcomePage.getTitleElement();
        } catch (NoSuchElementException e) {
            fail("There was no 'Welcome' title found on page");
        }
    }
}
