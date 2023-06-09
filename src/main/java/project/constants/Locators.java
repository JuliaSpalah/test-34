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
    public static final By EMAIL_INPUT_REGISTER_PAGE_LOCATOR = By.id("input-email");
    public static final By PASSWORD_INPUT_LOCATOR = By.id("input-password");
    public static final By CHECKBOX_AGREE_LOCATOR = By.xpath("//input[@name='agree']");
    public static final By CONTINUE_BUTTON_LOCATOR = By.xpath("//button[text()='Continue']");
    public static final By DESKTOPS_NAVBAR_LOCATOR = By.xpath("//div[@id='narbar-menu']//a[text()='Desktops']");
    public static final By SHOW_ALL_DESKTOPS_LOCATOR = By.xpath("//div[@id='narbar-menu']//a[text()='Show All Desktops']");
    public static final By SHOW_OPTION_SELECTED_VALUE_LOCATOR = By.xpath("//div[label[text()='Show']]//option[@selected]");
    public static final By SORT_BY_OPTION_SELECTED_VALUE_LOCATOR = By.xpath("//div[label[text()='Sort By']]//option[@selected]");
    public static final By PRODUCT_THUMBNAIL_LOCATOR = By.xpath("//div[@class='product-thumb']");
    public static final By SHOW_DROPDOWN_LOCATOR = By.xpath("//div[label[text()='Show']]//select");
    public static final By SHOW_DROPDOWN_ITEM_25_LOCATOR = By.xpath("//div[label[text()='Show']]//option[text()='25']");
    public static final By PAGES_SHOWN_LOCATOR = By.xpath("//*[@id='content']//div[@class='col-sm-6 text-end']");
    public static final By SORT_BY_DROPDOWN_LOCATOR = By.xpath("//div[label[text()='Sort By']]//select");
    public static final By SORT_BY_ORDER_NAME_AZ_LOCATOR = By.xpath("//div[label[text()='Sort By']]//option[text()='Name (A - Z)']");
    public static final By PRODUCT_NAME_LOCATOR = By.xpath("//div[@class='product-thumb']//div[@class='description']//a");
    public static final By SORT_BY_ORDER_PRICE_LOW_TO_HIGH_LOCATOR = By.xpath("//div[label[text()='Sort By']]//option[text()='Price (Low > High)']");
    public static final By PRODUCT_PRICES_LOCATOR = By.xpath("//div[@class='product-thumb']//div[@class='description']//span[@class='price-new']");
    public static final By CURRENCY_DROPDOWN_LOCATOR = By.xpath("//span[@class='d-none d-md-inline' and text()='Currency']");
    public static final By CURRENCY_SIGN_LOCATOR = By.xpath("//a[span[text()='Currency']]//strong");
    public static final By IPHONE_LOCATOR = By.xpath("//div[@class='product-thumb']//a[text()='iPhone']");
    public static final By PRODUCT_PRICE_LOCATOR = By.xpath("//h2/span[@class='price-new']");
    public static final By EURO_CURRENCY_LOCATOR = By.xpath("//a[text()='€ Euro']");
    public static final By POUND_STERLING_CURRENCY_LOCATOR = By.xpath("//a[text()='£ Pound Sterling']");
    public static final By CAMERAS_LOCATOR = By.xpath("//a[@class='nav-link' and text()='Cameras']");
    public static final By PRODUCT_THUMBNAILS_CAMERAS_LOCATOR = By.xpath("//div[@class='product-thumb']");
    public static final By OLD_PRICE_LOCATOR = By.xpath("//span[@class='price-old']");
    public static final By NEW_PRICE_FIRST_PRODUCT_LOCATOR = By.xpath("//div[h4/a[text()='Canon EOS 5D'] and @class='description']//span[@class='price-new']");
    public static final By PRICE_TAX_SECOND_PRODUCT_LOCATOR = By.xpath("//div[h4/a[text()='Nikon D300'] and @class='description']//span[@class='price-tax']");
    public static final By FORGOTTEN_PASSWORD_LOCATOR = By.xpath("//a[@class='list-group-item' and text()='Forgotten Password']");
    public static final By EMAIL_INPUT_FORGOTTEN_PASSWORD_LOCATOR = By.xpath("//*[@id='input-email']");
    public static final By CONTINUE_BUTTON_FORGOTTEN_PASSWORD_LOCATOR = By.xpath("//button[text()='Continue']");
    public static final By ALERT_MESSAGE_LOCATOR = By.xpath("//div[@id='alert']//div");



}
