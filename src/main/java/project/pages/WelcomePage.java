package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WelcomePage extends CommonPage {
    public WebElement getTitleElement() {
        return findElement(By.xpath("//title[text()='Welcome']"));
    }
}
