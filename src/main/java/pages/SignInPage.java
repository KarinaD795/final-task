package pages;

import io.qameta.allure.Step;
import locators.SignInPageLocators;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;


public class SignInPage extends SignInPageLocators {

    @Step("Enter user name like {user}")
    public SignInPage enterUserName(String user) {
        inputEmail.clear();
        inputEmail.setValue(user);
        return this;
    }

    @Step("Click on continue button")
    public PasswordPage clickOnContinueBtn() {
        continueBtn.click();
        sleep(2000);
        return page(PasswordPage.class);
    }

    @Step("Click on continue button without redirect")
    public SignInPage clickContinueWithoutRedirect() {
        continueBtn.click();
        return page(SignInPage.class);
    }

    @Step("Get error mail text")
    public String getErrorMailText() {
        return errorEmailText.getAttribute("innerText");
    }
}
