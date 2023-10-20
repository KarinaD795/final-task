package final_task.amazon;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import static core.Constants.*;

public class FailedEmailTest {
    @Test
    @Description("Test with invalid email")
    public void loginWithIncorrectEmail() {
        String errorMailText = new MainPage(BASE_URL)
                .clickSignIn()
                .enterUserName(INVALID_USER)
                .clickContinueWithoutRedirect()
                .getErrorMailText();

        Assert.assertEquals(errorMailText, MESSAGE_WITHOUT_EMAIL);
    }
}