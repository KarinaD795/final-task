package pages;

import io.qameta.allure.Step;
import locators.MainPageLocators;

public class AuthorizedMainPage extends MainPageLocators {

    @Step("Get user name from header")
    public String getUserNameMainPage() {
        return userNameInHeader.getAttribute("innerText");
    }
}
