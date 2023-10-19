package final_task.amazon.pages;

import static com.codeborne.selenide.Condition.text;


public class ProfilePage extends ProfilePageLocators {
    public ProfilePage getUserName(String name) {
        userName.shouldHave(text("Hello, " + name));
        return this;
    }
}

