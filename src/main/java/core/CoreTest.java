package core;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


abstract public class CoreTest {
    private void initDriver() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.headless = true;
    }

    @BeforeTest
    public void startWebDriver() {
        initDriver();
    }

    @AfterTest
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }
}
