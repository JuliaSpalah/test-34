package project.pages;

public class MainPage extends CommonPage {

    /**
     * відкриває основну сторінку
     */
    public void open() {
        driverProvider.getDriver().get("https://demo.opencart.com/");
    }
}