package pageobjects.TestComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductCatalogue extends AbstractComponents {

    WebDriver driver;

    public ProductCatalogue(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".mb-3")
    List<WebElement> products;

    @FindBy(css = ".card-body button:last-of-type")
    By productsBy = By.cssSelector(".mb-3");

    @FindBy(css = ".ng-animating")
    WebElement spinner;

    By popupMessage = By.id("toast-container");

    public WebElement getItem(String item) {
        waitForElemToAppear(productsBy);
        return products.stream().filter(product -> product.findElement(By.cssSelector("b"))
                .getText().equals(item)).findFirst().orElse(null);
    }

    public CompleteOrder moveToCart(String item) {
        getItem(item).findElement(By.cssSelector(".card-body button:last-of-type")).click();
        waitForElemToAppear(popupMessage);
        waitForElementToDisappear(spinner);
        return new CompleteOrder(driver);
    }


}
