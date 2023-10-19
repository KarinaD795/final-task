package locators;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class MainPageLocators {
    public SelenideElement signInBtn = $("#navbar-main").find("#nav-link-accountList");
    public SelenideElement userNameInHeader = $x("//span[@id='nav-link-accountList-nav-line-1']");
}
