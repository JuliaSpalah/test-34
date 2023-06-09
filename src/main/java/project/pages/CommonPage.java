package project.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import project.base.BasePage;

import static project.constants.Locators.*;

public abstract class CommonPage extends BasePage {

    /**
     * клікає на лінку з назвою Brands
     */
    public void clickOnBrandsLink()
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        findElementAndClickWithScroll(BRANDS_LINK_LOCATOR);
    }

    public void clickOnMyAccount()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(MY_ACCOUNT_LINK_LOCATOR);
    }

    public void clickOnRegister()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(REGISTER_LINK_LOCATOR);
    }

    public void clickOnLogin()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(LOGIN_LINK_LOCATOR);
    }

    public void hoverOverDesktops()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndHover(DESKTOPS_NAVBAR_LOCATOR);
    }

    public void clickOnShowAllDesktops()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(SHOW_ALL_DESKTOPS_LOCATOR);
    }

    public String getCurrencySign()
            throws NoSuchElementException {
        return findElement(CURRENCY_SIGN_LOCATOR).getText();
    }

    public void clickOnCurrency()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(CURRENCY_DROPDOWN_LOCATOR);
    }

    public void clickOnEuro()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(EURO_CURRENCY_LOCATOR);
    }

    public void clickOnPoundSterling()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(POUND_STERLING_CURRENCY_LOCATOR);
    }

    public void clickOnCameras()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(CAMERAS_LOCATOR);
    }

    public String getAlertMessage()
            throws NoSuchElementException {
        return findElement(ALERT_MESSAGE_LOCATOR).getText();
    }


}
