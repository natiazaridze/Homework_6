import StepObject.RegistrationSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.RegistrationPage.*;

public class RegistrationTest extends ChromeRunner {
    @Test
    public void InvalidEmailFormat() throws InterruptedException {
        RegistrationSteps steps = new RegistrationSteps();
        steps
                .confirmationPop()
                .clickLoginBtn()
                .newOnVentis()
                .inputEmail(email)
                .inputPassw(password);
    }
}
