package project.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider {
    protected WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public JavascriptExecutor getJavaScriptExecutor() {
        return (JavascriptExecutor) driver;
    }

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void dispose() {
        driver.quit();
    }
}
