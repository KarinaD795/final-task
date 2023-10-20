package final_task.amazon;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import static core.Constants.*;


public class SuccessSignInTest {

    @Test
    @Description("Test for successful authorization")
    public void successLoginTest() {
        String userNameText = new MainPage(BASE_URL).clickSignIn()
                .enterUserName(USER_NAME)
                .clickOnContinueBtn()
                .enterPassword(PASSWORD)
                .clickOnSubmit()
                .getUserNameMainPage();

        Assert.assertEquals(userNameText, LOGGED_USER);
    }

}
