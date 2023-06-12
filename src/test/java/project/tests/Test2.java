package project.tests;

import org.junit.Test;

import static org.testng.Assert.*;

public class Test2 extends BaseTest {
    @Test
    public void hoverOverDesktopsTest() {
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

        try {
            productPage.clickOnShowDropDown();
            productPage.clickOnShowDropDownItem25();

        } catch (Exception e) {
            fail("Fail to select dropdown item");
        }
        assertTrue(productPage.getProductsThumbnailsCount() <= 25, "Products thumbnails count should be less or equals 25");
        assertTrue(productPage.getProductsThumbnailsCount() == 12, "Products thumbnails count should be equals 12");

        try {
            assertEquals(productPage.getPagesShownText(), "Showing 1 to 12 of 12 (1 Pages)", "Text should be Showing 1 to 12 of 12 (1 Pages)");
        } catch (Exception e) {
            fail("Can`t get pages shown text");
        }

    }
}
