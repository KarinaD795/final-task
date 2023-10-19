package final_task.amazon;

import core.CoreTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MainPage;
import static core.Constants.*;

public class FailedEmailTest extends CoreTest {

    @Test
    @Description("Test with invalid email")
    public void loginWithIncorrectEmail() {
        new MainPage(BASE_URL)
                .clickSignIn()
                .enterUserName(INVALID_USER)
                .clickContinueWithoutRedirect()
                .getErrorMailText()
                .contains(MESSAGE_WITHOUT_EMAIL);
    }
}