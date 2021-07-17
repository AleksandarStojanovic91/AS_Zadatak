package tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.BasePage;
import pom.ProductsPage;

public class Shoppster extends BaseTest{

    @BeforeMethod
    public void startTest(){
        init("CHROME", 30);
    }

    @AfterMethod
    public void afterTest(){
        //tearDown();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.shoppster.com/sr-RS/");

        wdWait = new WebDriverWait(driver, 30);
        BasePage basePage = new BasePage(driver,wdWait);

        basePage.acceptCookies();
        basePage.selectCategory("F11/moda");

        ProductsPage productsPage = new ProductsPage(driver, wdWait);

        productsPage.setFilterCategory("Žene");
        pause(5);
        productsPage.setFilterColor("Crna");
        pause(5);
        productsPage.loadUnloadFilters("Prodavac");
        pause(1);
        productsPage.setFilterCheckbox("Prodavac", "Watch is Watch");


        //1. Assertacije
        //2. Ceo test parametrizovan (xml testng)
        //2.b paralelno
        //2.c multy browser
        //3. Dodati anotacije za allure
        //4. 1 page koji nije vec pokriven

    }

    //@Test
}
