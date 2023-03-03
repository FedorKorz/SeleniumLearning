package pageobjects.Tests;

import pageobjects.TestComponents.BaseTest;
import pageobjects.TestComponents.CompleteOrder;
import pageobjects.TestComponents.LandingPage;
import pageobjects.TestComponents.ProductCatalogue;

import java.io.IOException;

public class StandaloneTest {

    public static void main(String[] args) throws IOException, InterruptedException {

        BaseTest baseTest = new BaseTest();
        LandingPage landPage = new LandingPage(baseTest.initializeDriver());
        landPage.goTo("https://rahulshettyacademy.com/client");
        ProductCatalogue catalogue = landPage.loginApplication("123@yandex.com", "7430156Fort@");
        catalogue.getItem("IPHONE 13 PRO");

        CompleteOrder completeOrder =  catalogue.moveToCart("IPHONE 13 PRO");
        completeOrder.proceedOrder();
        completeOrder.setCVV("732");
        completeOrder.setCountry("Georgia");

    }
}