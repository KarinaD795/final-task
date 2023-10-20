package pages;

import io.qameta.allure.Step;
import locators.MainPageLocators;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;


public class MainPage extends MainPageLocators {

    public MainPage(String url) {
        open(url);
    }

    @Step("Click to SignIn button")
    public SignInPage clickSignIn() {
        signInBtn.click();
        return page(SignInPage.class);
    }
}
