package final_task.amazon;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import static core.Constants.*;

public class FailedPasswordTest {

    @Test
    @Description("Test with invalid password")
    public void loginWithIncorrectPassword() {
        String errorPasswordText = new MainPage(BASE_URL)
                .clickSignIn()
                .enterUserName(USER_NAME)
                .clickOnContinueBtn()
                .enterPassword(INVALID_PASSWORD)
                .clickSubmitWithoutRedirect()
                .getErrorPasswordText();

        Assert.assertEquals(errorPasswordText, MESSAGE_INCORRECT_PASSWORD);
    }
}