package pages;

import io.qameta.allure.Step;
import locators.SignInPageLocators;
import static com.codeborne.selenide.Selenide.page;


public class PasswordPage extends SignInPageLocators {
    @Step("Enter password field like {password}")
    public PasswordPage enterPassword(String password) {
        inputPassword.clear();
        inputPassword.setValue(password);
        return this;
    }

    @Step("Click on Submit button")
    public AuthorizedMainPage clickOnSubmit() {
        signInSubmitBtn.click();
        return page(AuthorizedMainPage.class);
    }

    @Step("Click on Submit button without redirect")
    public PasswordPage clickSubmitWithoutRedirect() {
        signInSubmitBtn.click();
        return page(PasswordPage.class);
    }

    @Step("Get error password text")
    public String getErrorPasswordText() {
        return errorPasswordText.getAttribute("innerText");
    }
}
