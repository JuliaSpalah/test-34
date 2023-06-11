package project.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import project.base.BasePage;

import static project.constants.Locators.*;

public class CommonPage extends BasePage {

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


}
