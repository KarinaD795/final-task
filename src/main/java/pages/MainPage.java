package pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import locators.MainPageLocators;
import static com.codeborne.selenide.Selenide.page;


public class MainPage extends MainPageLocators {

    public MainPage(String url) {
        Selenide.open(url);
    }

    @Step("Click to SignIn button")
    public SignInPage clickSignIn() {
        signInBtn.click();
        return page(SignInPage.class);
    }
}
