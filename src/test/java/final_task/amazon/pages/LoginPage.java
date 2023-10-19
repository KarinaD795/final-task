package final_task.amazon.pages;


public class LoginPage extends LoginPageLocators {
    public LoginPage clickSignIn() {
        signInBtn.click();

        return this;
    }

    public LoginPage enterUserName(String user) {
        inputEmail.clear();
        inputEmail.setValue(user);

        return this;
    }

    public LoginPage clickContinue() {
        continueBtn.click();

        return this;
    }

    public LoginPage enterPassword(String password) {
        inputPassword.clear();
        inputPassword.setValue(password);

        return this;
    }

    public LoginPage clickSubmit() {
        signInSubmitBtn.click();

        return this;
    }

}
