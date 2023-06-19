package project.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;

import static project.constants.Locators.*;

public class AccountPage extends CommonPage{

    public void setEmail(String email)
    throws NoSuchElementException {
        findElementAndSendKeys(EMAIL_INPUT_FORGOTTEN_PASSWORD_LOCATOR, email);
    }

    public void clickOnContinueButton()
    throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(CONTINUE_BUTTON_FORGOTTEN_PASSWORD_LOCATOR);
    }

}
