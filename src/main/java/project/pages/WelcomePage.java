package project.pages;

import org.openqa.selenium.WebElement;

import static project.constants.Locators.WELCOME_TITLE_LOCATOR;

public class WelcomePage extends CommonPage {
    public WebElement getTitleElement() {
        return findElement(WELCOME_TITLE_LOCATOR );
    }
}
