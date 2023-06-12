package project.base;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected final int SCROLL_TIMEOUT_SECONDS = 1;

    protected WebDriverProvider driverProvider;

    public void setWebDriverProvider(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    protected WebElement findElement(By by) throws NoSuchElementException {
        return driverProvider.getDriver().findElement(by);
    }

    protected List<WebElement> findElements(By by)  {
        return driverProvider.getDriver().findElements(by);
    }

    protected WebElement findElementAndClick(By by)
            throws NoSuchElementException, ElementClickInterceptedException {
        WebElement element = findElement(by);
        element.click();
        return element;
    }

    protected WebElement findElementAndClickWithScroll(By by)
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        WebElement element = findElement(by);
        scrollToElement(element);
        element.click();
        return element;
    }

    protected WebElement findElementAndSendKeys(By by, CharSequence... keys) throws NoSuchElementException {
        WebElement element = findElement(by);
        element.sendKeys(keys);
        return element;
    }

    protected WebElement findElementAndSendKeysWithScroll(By by, CharSequence... keys)
            throws NoSuchElementException, InterruptedException {
        WebElement element = findElement(by);
        scrollToElement(element);
        element.sendKeys(keys);
        return element;
    }

    protected WebElement scrollToElement(WebElement element) throws InterruptedException {
        driverProvider.getJavaScriptExecutor().executeScript("arguments[0].scrollIntoView(true);", element);
        TimeUnit.SECONDS.sleep(SCROLL_TIMEOUT_SECONDS);
        return element;
    }

    protected WebElement findElementAndHover(By by){
        WebElement element = findElement(by);
        Actions actions = new Actions(driverProvider.getDriver());
        actions.moveToElement(element).perform();
        return element;
    }




}
