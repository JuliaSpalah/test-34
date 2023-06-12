package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import project.utils.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

import static project.constants.Locators.*;

public class ProductPage extends CommonPage {

    public WebElement getBrandLink(String brand) throws NoSuchElementException {
        return findElement(By.xpath("//*[@id='content']//a[text()='" + brand + "']"));
    }

    public int getShowDropdownSelectedValue()
            throws NoSuchElementException, NumberFormatException {
        return Integer.parseInt(findElement(SHOW_OPTION_SELECTED_VALUE_LOCATOR).getText());
    }

    public String getSortByDropdownSelectedValue()
            throws NoSuchElementException {
        return findElement(SORT_BY_OPTION_SELECTED_VALUE_LOCATOR).getText();
    }

    public int getProductsThumbnailsCount() {
        return findElements(PRODUCT_THUMBNAIL_LOCATOR).size();
    }

    public void clickOnShowDropDown()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(SHOW_DROPDOWN_LOCATOR);
    }

    public void clickOnShowDropDownItem25()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(SHOW_DROPDOWN_ITEM_25_LOCATOR);
    }

    public String getPagesShownText()
            throws NoSuchElementException {
        return findElement(PAGES_SHOWN_LOCATOR).getText();
    }

    public void clickOnSortByDropDown()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(SORT_BY_DROPDOWN_LOCATOR);
    }

    public void clickOnSortByDropDownNameAZ()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(SORT_BY_ORDER_NAME_AZ_LOCATOR);

    }

    // #3 6
    public void clickOnSortByDropDownPriceLowToHigh()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(SORT_BY_ORDER_PRICE_LOW_TO_HIGH_LOCATOR);

    }

    // #3 5
    // findElements вертає List вебелементів, стрім перетворює ліст вебелементів у стрім вебелементів
    // функція map витягує з кожного елемента текст за допомогою функції getText, яка належить до класу WebElement
    // далі за допомогою функції collect перетворюємо stream в ліст
    public List<String> getProductNames() {
        return findElements(PRODUCT_NAME_LOCATOR)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public List<Double> getProductPrices() {
        return findElements(PRODUCT_PRICES_LOCATOR)
                .stream()
                .map(WebElement::getText)
                .map(StringUtils::removeDollarSign)
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }

}
