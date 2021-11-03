package StepObject;

import PageObject.RegistrationPage2;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationSteps extends RegistrationPage2 {
    public RegistrationSteps confirmationPop() throws InterruptedException {
        Select confirm_1 = new Select(country);
        country_input.click();
        Thread.sleep(2000);
        return this;
    }
    public RegistrationSteps clickLoginBtn() throws InterruptedException {
        loginBtn.click();
        Thread.sleep(2000);
        return this;
    }

    public RegistrationSteps newOnVentis() throws InterruptedException {
        newBtn.click();
        Thread.sleep(2000);
        return this;
    }
    public RegistrationSteps inputEmail(String email) throws InterruptedException {
        emailInput.sendKeys(email);
        Thread.sleep(2000);
        return this;
    }
    public RegistrationSteps inputPassw(String password) throws InterruptedException {
        passInput.sendKeys(password);
        Thread.sleep(2000);
        return this;
    }
}
