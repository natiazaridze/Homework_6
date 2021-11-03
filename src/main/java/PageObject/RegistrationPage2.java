package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage2 {
    WebDriver driver;
    protected WebElement
        country_input = driver.findElement(By.className("country__btn")),
        country = driver.findElement(By.className("country__btn")),
        loginBtn = driver.findElement(By.id("btn-login-menu")),
        newBtn = driver.findElement(By.xpath("//*[text()='New on Ventis?']")),
        emailInput = driver.findElement(By.name("Utente.Email")),
        passInput = driver.findElement(By.name("Utente.Passwd"));


}
