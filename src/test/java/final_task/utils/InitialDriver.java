package final_task.utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static core.Constants.BASE_URL;

public class InitialDriver {
    @BeforeClass
    public void openBrowser(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        ChromeOptions options = ChromeOptionsProvider.getChromeOptions();
        Configuration.browserCapabilities = options;
        Selenide.open(BASE_URL);
    }

    @AfterClass
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
