package project.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;

import static project.constants.Locators.*;

public class RegisterPage extends CommonPage {

    public void setFirstName(String firstName) {
        findElementAndSendKeys(FIRST_NAME_INPUT_LOCATOR, firstName);
    }

    public void setLastName(String lastName) {
        findElementAndSendKeys(LAST_NAME_INPUT_LOCATOR, lastName);
    }

    public void setEmail(String email) {
        findElementAndSendKeys(EMAIL_INPUT_LOCATOR, email);
    }

    public void setPassword(String password) {
        findElementAndSendKeys(PASSWORD_INPUT_LOCATOR, password);
    }

    public void checkAgreeCheckbox()
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        findElementAndClickWithScroll(CHECKBOX_AGREE_LOCATOR);
    }

    public void clickOnContinueButton()
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        findElementAndClickWithScroll(CONTINUE_BUTTON_LOCATOR);
    }
}
