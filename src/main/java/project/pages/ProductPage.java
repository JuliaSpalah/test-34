package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

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

    public int getProductsThumbnailsCount(){
        return findElements(PRODUCT_THUMBNAIL_LOCATOR).size();
    }
}
