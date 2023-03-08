package pageobjects.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobjects.TestComponents.BaseTest;
import pageobjects.TestComponents.CompleteOrder;
import pageobjects.TestComponents.ProductCatalogue;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SubmitOrderTest extends BaseTest {

    @Test
    public void submitOrder() throws InterruptedException, IOException {
        ProductCatalogue catalogue = launchApplication().loginApplication("rahul", "123123123");

        catalogue.getItem("IPHONE 13 PRO");
        CompleteOrder completeOrder = catalogue.moveToCart("IPHONE 13 PRO");
        completeOrder.proceedOrder();
        completeOrder.setCVV("732");
        completeOrder.setCountry("Georgia");
    }
}