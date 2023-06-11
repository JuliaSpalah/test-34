package project.tests;

import org.junit.After;
import org.junit.Before;
import project.base.WebDriverProvider;
import project.pages.MainPage;
import project.pages.ProductPage;
import project.pages.RegisterPage;
import project.pages.WelcomePage;

public class BaseTest {

    protected final WebDriverProvider webDriverProvider = new WebDriverProvider();
    protected final MainPage mainPage = new MainPage();
    protected final ProductPage productPage = new ProductPage();
    protected final RegisterPage registerPage = new RegisterPage();
    protected final WelcomePage welcomePage = new WelcomePage();


    @Before
    public void setup() {
        webDriverProvider.setup();
        mainPage.setWebDriverProvider(webDriverProvider);
        productPage.setWebDriverProvider(webDriverProvider);
        registerPage.setWebDriverProvider(webDriverProvider);
        welcomePage.setWebDriverProvider(webDriverProvider);
    }

    @After
    public void dispose() {
        webDriverProvider.dispose();
    }
}
