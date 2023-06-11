package project.tests;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import static org.testng.Assert.fail;

public class Test0 extends BaseTest{

    @Test
    public void testClickOnBrands() {
        // викликаєм функцію openMainPage у змінної MainPage
        mainPage.open();
        try {
            mainPage.clickOnBrandsLink();
        } catch (Exception e) {
            fail("Can't click on 'Brands page'");
        }

        String[] brands = {"Apple", "Canon", "Hewlett-Packard", "HTC", "Palm", "Sony"};
        for (String brand : brands) {
            try {
                productPage.getBrandLink(brand);
            } catch (NoSuchElementException e) {
                fail("Brand " + brand + " wasn't found on product page");
            }
        }
    }
}
