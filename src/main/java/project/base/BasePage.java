package project.base;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected final int SCROLL_TIMEOUT_SECONDS = 1;

    protected WebDriverProvider driverProvider;

    public void setWebDriverProvider(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    public WebElement findElement(By by) throws NoSuchElementException {
        return driverProvider.getDriver().findElement(by);
    }

    public WebElement findElementAndClick(By by)
            throws NoSuchElementException, ElementClickInterceptedException {
        WebElement element = findElement(by);
        element.click();
        return element;
    }

    public WebElement findElementAndClickWithScroll(By by)
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        WebElement element = findElement(by);
        scrollToElement(element);
        element.click();
        return element;
    }

    public WebElement findElementAndSendKeys(By by, CharSequence... keys) throws NoSuchElementException {
        WebElement element = findElement(by);
        element.sendKeys(keys);
        return element;
    }

    public WebElement findElementAndSendKeysWithScroll(By by, CharSequence... keys)
            throws NoSuchElementException, InterruptedException {
        WebElement element = findElement(by);
        scrollToElement(element);
        element.sendKeys(keys);
        return element;
    }

    public WebElement scrollToElement(WebElement element) throws InterruptedException {
        driverProvider.getJavaScriptExecutor().executeScript("arguments[0].scrollIntoView(true);", element);
        TimeUnit.SECONDS.sleep(SCROLL_TIMEOUT_SECONDS);
        return element;
    }
}
