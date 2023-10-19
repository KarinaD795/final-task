package final_task.amazon.test_cases;

import com.codeborne.selenide.Configuration;
import final_task.amazon.pages.LoginPage;
import final_task.amazon.pages.ProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;


public class LoginTest {

    @BeforeMethod
    public void before() {
        Configuration.timeout = 10000;
        open("https://www.amazon.com/");
    }

    @Test
    public void successLoginTest() {
        new LoginPage().clickSignIn();
        sleep(3000);
        new LoginPage().enterUserName("karinagrva@gmail.com");
        new LoginPage().clickContinue();
        sleep(3000);
        new LoginPage().enterPassword("varvareskii&!T50");
        new LoginPage().clickSubmit();
        sleep(3000);
        new ProfilePage().getUserName("Karina");
    }
}
