package project.tests;

import org.junit.Test;
import project.pages.CommonPage;

import static org.testng.Assert.*;

public class Test4 extends BaseTest {

    @Test
    public void test() {
        mainPage.open();

        try {
            assertEquals(mainPage.getCurrencySign(), "$", "Currency sign is incorrect");
        } catch (Exception e) {
            fail("Can not get currency sign");
        }

        try {
            mainPage.clickOnIphone();
        } catch (Exception e) {
            fail("Can`t click on iPhone");
        }

        try {
            assertEquals(productPage.getProductPrice(), 123.20, "The price is incorrect");
        } catch (Exception e) {
            fail("Can`t verify the price in USD");
        }

        try {
            productPage.clickOnCurrency();
            productPage.clickOnEuro();
        } catch (Exception e) {
            fail("Can`t select EUR currency");
        }

        try {
            assertEquals(productPage.getProductPrice(), 112.65, "The price is incorrect");
        } catch (Exception e) {
            fail("Can`t verify the price in EUR");
        }

        try {
            productPage.clickOnCurrency();
            productPage.clickOnPoundSterling();
        } catch (Exception e) {
            fail("Can`t select GBP currency");
        }

        try{
            assertEquals(productPage.getProductPrice(), 100.54, "The price is incorrect");
        }catch (Exception e){
            fail("Can`t verify the price in GBP");
        }


    }
}
