package project.tests;

import org.junit.Test;

import static org.testng.Assert.*;

public class Test2_1 extends BaseTest {
    @Test
    public void test() {
        mainPage.open();
        try {
            mainPage.clickOnMyAccount();
        } catch (Exception e) {
            fail("Can`t click on My Account");
        }
        try {
            mainPage.clickOnLogin();
        } catch (Exception e) {
            fail("Can`t click on Login");
        }

        try {
            registerPage.clickOnForgottenPassword();
        } catch (Exception e) {
            fail("Can`t click on Forgotten password");
        }

        try {
            accountPage.setEmail("john.snow@mail.com");
        } catch (Exception e) {
            fail("Can`t fill in an email");
        }

        try {
            accountPage.clickOnContinueButton();
        } catch (Exception e) {
            fail("Can`t click on Continue button");
        }
        try {
            accountPage.waitSeconds(1);
            accountPage.getAlertMessage();
            assertEquals(accountPage.getAlertMessage(), "Warning: The E-Mail Address was not found in our records!", "The alert message should be Warning: The E-Mail Address was not found in our records! ");
        } catch (Exception e) {
            fail("Can`t check an alert message");
        }

    }
}
