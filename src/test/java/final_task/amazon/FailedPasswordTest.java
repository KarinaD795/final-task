package final_task.amazon;

import core.CoreTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MainPage;
import static core.Constants.*;

public class FailedPasswordTest extends CoreTest {

    @Test
    @Description("Test with invalid password")
    public void loginWithIncorrectPassword() {
        new MainPage(BASE_URL)
                .clickSignIn()
                .enterUserName(USER_NAME)
                .clickOnContinueBtn()
                .enterPassword(INVALID_PASSWORD)
                .clickSubmitWithoutRedirect()
                .getErrorPasswordText()
                .contains(MESSAGE_INCORRECT_PASSWORD);
    }
}