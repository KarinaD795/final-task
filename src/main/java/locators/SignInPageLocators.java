package locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignInPageLocators {
    public SelenideElement inputEmail = $(".a-section").find("#ap_email");
    public SelenideElement continueBtn = $(".a-section").find("#continue");
    public SelenideElement errorEmailText = $x("//h2[@class='a-text-normal']");


    //    password page
    public SelenideElement inputPassword = $(".a-section").find("#ap_password");
    public SelenideElement signInSubmitBtn = $(".a-section").find("#signInSubmit");
    public SelenideElement errorPasswordText = $x("//span[@class='a-list-item']");
}
