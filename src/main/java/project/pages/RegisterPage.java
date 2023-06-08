package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;

public class RegisterPage extends CommonPage {

    public void setFirstName(String firstName) {
        findElementAndSendKeys(By.id("input-firstname"), firstName);
    }

    public void setLastName(String lastName) {
        findElementAndSendKeys(By.id("input-lastname"), lastName);
    }

    public void setEmail(String email) {
        findElementAndSendKeys(By.id("input-email"), email);
    }

    public void setPassword(String password) {
        findElementAndSendKeys(By.id("input-password"), password);
    }

    public void checkAgreeCheckbox()
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        findElementAndClickWithScroll(By.xpath("//input[@name='agree']"));
    }

    public void clickOnContinueButton()
            throws NoSuchElementException, ElementClickInterceptedException, InterruptedException {
        findElementAndClickWithScroll(By.xpath("//button[text()='Continue']"));
    }
}
