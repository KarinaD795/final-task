package final_task.amazon;

import core.CoreTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MainPage;
import static core.Constants.*;


public class SuccessSignInTest extends CoreTest {

    @Test
    @Description("Test for successful authorization")
    public void successLoginTest() {
        new MainPage(BASE_URL)
                .clickSignIn()
                .enterUserName(USER_NAME)
                .clickOnContinueBtn()
                .enterPassword(PASSWORD)
                .clickOnSubmit()
                .getUserNameMainPage()
                .contains(LOGGED_USER);
    }

}
