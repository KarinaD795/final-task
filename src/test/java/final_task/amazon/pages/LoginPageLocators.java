package final_task.amazon.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageLocators {
    SelenideElement signInBtn = $("#navbar-main").find("#nav-link-accountList");
    SelenideElement inputEmail = $(".a-section").find("#ap_email");
    SelenideElement continueBtn = $(".a-section").find("#continue");
    SelenideElement inputPassword = $(".a-section").find("#ap_password");
    SelenideElement signInSubmitBtn = $(".a-section").find("#signInSubmit");
}
