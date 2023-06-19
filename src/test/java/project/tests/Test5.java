package project.tests;

import org.junit.Test;

import static org.testng.Assert.*;

public class Test5 extends BaseTest {
    @Test
    public void test() {
        mainPage.open();

        try {
            mainPage.clickOnCameras();
        } catch (Exception e) {
            fail("Can`t click on Cameras");
        }
        try {
            assertTrue(productPage.getProductAmount() == 2, "Products Cameras thumbnails count should be equals 2");
        } catch (Exception e) {
            fail("Can`t count the products");
        }

        try {
            assertEquals(productPage.getOldPriceCanon(), 122.00, "An old price should be 122.00");
        } catch (Exception e) {
            fail("Can`t get an old price");
        }

        assertEquals(productPage.getFirstProductNewPrice(), 98.00, "The new price should be 98.00");

        assertEquals(productPage.getSecondProductTaxPrice(), 80.00, "The tax price should be 80.00");

    }
}
