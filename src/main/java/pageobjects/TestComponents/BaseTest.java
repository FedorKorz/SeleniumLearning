package pageobjects.TestComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
    public LandingPage landPage;

    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/java/pageobjects/Resources/GlobalData.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        switch (browserName) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                this.driver = new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.firefoxdriver().setup();
                this.driver = new EdgeDriver();
            }

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }


    public LandingPage launchApplication() throws IOException {
        System.out.println("I've just started");
        landPage = new LandingPage(initializeDriver());
        landPage.goTo();
        return landPage;
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}

