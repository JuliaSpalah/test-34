package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import project.base.BasePage;

public class CommonPage extends BasePage {

    /**
     * повертає елемент з id content
     */
    public WebElement getContent() throws NoSuchElementException {
        return findElement(By.xpath("//*[@id='content']"));
    }

    /**
     * клікає на лінку з назвою Brands
     */
    public void clickOnBrandsLink()
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        findElementAndClickWithScroll(By.xpath("//a[text()='Brands']"));
    }

    public void clickOnMyAccount()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(By.xpath("//span[text()='My Account']"));
    }

    public void clickOnRegister()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(By.xpath("//a[@class='dropdown-item' and text()='Register']"));
    }

    public void clickOnLogin()
            throws NoSuchElementException, ElementClickInterceptedException {
        findElementAndClick(By.xpath("//a[@class='dropdown-item' and text()='Login']"));
    }


}
