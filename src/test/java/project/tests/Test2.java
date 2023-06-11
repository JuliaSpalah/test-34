package project.tests;

import org.junit.Test;

import static org.testng.Assert.*;

public class Test2 extends BaseTest {
    @Test
    public void hoverOverDesktops() {
        mainPage.open();
        try {
            mainPage.hoverOverDesktops();
            mainPage.clickOnShowAllDesktops();
        } catch (Exception e) {
            fail("Can`t hover over Desktops and click on Show All Desktops");
        }

        try {
            assertEquals(productPage.getShowDropdownSelectedValue(), 10, "Show dropdown value is not 10");
            assertEquals(productPage.getSortByDropdownSelectedValue(), "Default", "Sort By dropdown value is not default");
            assertTrue(productPage.getProductsThumbnailsCount() <= 10, "Products thumbnails count should be less or equals 10");

        } catch (Exception e) {
            fail("Can`t check dropdown values");
        }

    }
}
