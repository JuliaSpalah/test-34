package project.tests;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import static org.testng.Assert.fail;

public class Test1 extends BaseTest{
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
