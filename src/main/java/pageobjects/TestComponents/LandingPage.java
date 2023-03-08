package pageobjects.TestComponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents {
    WebDriver driver;
    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userPassword")
    WebElement password;

    @FindBy(id="login")
    WebElement submit;

    @FindBy(css="div[class='ng-star-inserted']")
    WebElement ErrorMessage;

    public String getErrorMessage() {
        waitForElemToAppear(ErrorMessage);
        System.out.println(ErrorMessage.getText());
        return ErrorMessage.getText();
    }

    public ProductCatalogue loginApplication(String email, String pass) {
        userEmail.sendKeys(email);
        password.sendKeys(pass);
        submit.click();
        return new ProductCatalogue(driver);
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/client");
    }
}