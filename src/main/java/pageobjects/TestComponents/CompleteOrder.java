package pageobjects.TestComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CompleteOrder extends AbstractComponents {

    @FindBy(css = "button[routerlink*='cart']")
    WebElement cart;

    @FindBy(xpath = "//button[text()='Buy Now']")
    WebElement buyBtn;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    WebElement CVV;

    @FindBy(css =  "*[placeholder='Select Country']")
    WebElement inputCountry;


    public CompleteOrder(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void proceedOrder() throws InterruptedException {
        Thread.sleep(3000L);
        cart.click();
        buyBtn.click();
    }

    public void setCVV(String code) {
        CVV.sendKeys(code);
    }

    public void setCountry(String country) {
        inputCountry.sendKeys(country);
    }


}
