package project.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;

import static project.constants.Locators.*;

public class MainPage extends CommonPage {

    /**
     * відкриває основну сторінку
     */
    public void open() {
        driverProvider.getDriver().get("https://demo.opencart.com/");
    }

    public void clickOnIphone()
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {

        findElementAndClickWithScroll(IPHONE_LOCATOR);
    }
}