package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ProductPage extends CommonPage {

    public WebElement getBrandLink(String brand) throws NoSuchElementException {
        return getContent().findElement(By.xpath("//a[text()='" + brand + "']"));
    }
}
