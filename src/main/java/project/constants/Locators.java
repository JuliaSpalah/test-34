package project.constants;

import org.openqa.selenium.By;

public class Locators {
    public static final By BRANDS_LINK_LOCATOR = By.xpath("//a[text()='Brands']");
    public static final By MY_ACCOUNT_LINK_LOCATOR = By.xpath("//span[text()='My Account']");
    public static final By REGISTER_LINK_LOCATOR = By.xpath("//a[@class='dropdown-item' and text()='Register']");
    public static final By LOGIN_LINK_LOCATOR = By.xpath("//a[@class='dropdown-item' and text()='Login']");
    public static final By WELCOME_TITLE_LOCATOR = By.xpath("//title[text()='Welcome']");
    public static final By FIRST_NAME_INPUT_LOCATOR = By.id("input-firstname");
    public static final By LAST_NAME_INPUT_LOCATOR = By.id("input-lastname");
    public static final By EMAIL_INPUT_LOCATOR = By.id("input-email");
    public static final By PASSWORD_INPUT_LOCATOR = By.id("input-password");
    public static final By CHECKBOX_AGREE_LOCATOR = By.xpath("//input[@name='agree']");
    public static final By CONTINUE_BUTTON_LOCATOR = By.xpath("//button[text()='Continue']");
    public static final By DESKTOPS_NAVBAR_LOCATOR = By.xpath("//div[@id='narbar-menu']//a[text()='Desktops']");
    public static final By SHOW_ALL_DESKTOPS_LOCATOR = By.xpath("//div[@id='narbar-menu']//a[text()='Show All Desktops']");
    public static final By SHOW_OPTION_SELECTED_VALUE_LOCATOR = By.xpath("//div[label[text()='Show']]//option[@selected]");
    public static final By SORT_BY_OPTION_SELECTED_VALUE_LOCATOR = By.xpath("//div[label[text()='Sort By']]//option[@selected]");
    public static final By PRODUCT_THUMBNAIL_LOCATOR = By.xpath("//div[@class='product-thumb']");


}