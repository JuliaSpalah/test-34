package project.tests;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class Test3 extends BaseTest {
    @Test
    public void test() {
        mainPage.open();
        try {
            mainPage.hoverOverDesktops();
            mainPage.clickOnShowAllDesktops();
        } catch (Exception e) {
            fail("Can`t hover over Desktops and click on Show All Desktops");
        }

        try {
            productPage.clickOnSortByDropDown();
            productPage.clickOnSortByDropDownNameAZ();
        } catch (Exception e) {
            fail("Can`t select dropdown Name A - Z");
        }
        List<String> productNames = productPage.getProductNames();
        // new ArrayList - зробили копію ліста productNames і поклали його в ліст sortedProductNames
        List<String> sortedProductNames = new ArrayList<>(productNames);
        // відсортували копію ліста productNames
        Collections.sort(sortedProductNames, String::compareToIgnoreCase);
        assertEquals(productNames, sortedProductNames, "Product names are not sorted in alphabetic order");

        try {
            productPage.clickOnSortByDropDown();
            productPage.clickOnSortByDropDownPriceLowToHigh();
        } catch (Exception e) {
            fail("Can`t select dropdown Price High>Low");
        }
        List<Double> productPrices = productPage.getProductPrices();
        List<Double> sortedProductPrices = new ArrayList<>(productPrices);
        Collections.sort(sortedProductPrices);
        assertEquals(productPrices, sortedProductPrices, "Product prices are not sorted from low to high");
    }

}
