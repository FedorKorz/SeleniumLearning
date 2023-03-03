package pageobjects.TestComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\user\\IdeaProjects\\SeleniumLearning\\src\\main\\java\\pageobjects\\Resources\\GlobalData.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        switch (browserName) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                this.driver = new ChromeDriver();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                FirefoxDriver driver = new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.firefoxdriver().setup();
                EdgeDriver driver = new EdgeDriver();
            }
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public void launchApplication() throws IOException {
        driver = initializeDriver();
    }
}
