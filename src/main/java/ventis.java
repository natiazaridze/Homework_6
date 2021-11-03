import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ventis {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://en.ventis.com/");
        Thread.sleep(2000);
    }

    //Registration with valid credentials
    @Test
    public void positiveCase() throws InterruptedException {
        driver.findElement(By.className("country__btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btn-login-menu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='New on Ventis?']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Utente.Email")).sendKeys("n.zaridze@sweeftdigital.com");
        driver.findElement(By.name("Utente.Passwd")).sendKeys("natia2002");
        driver.findElement(By.name("day")).click();
        Select day = new Select(driver.findElement(By.name("day")));
        day.selectByIndex(17);
        driver.findElement(By.name("month")).click();
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(6);
        driver.findElement(By.name("year")).click();
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("2002");
        driver.findElement(By.name("Utente.Telefono")).sendKeys("995555256545");
        driver.findElement(By.id("genderM")).click();
        driver.findElement(By.id("genderW")).click();
        driver.findElement(By.name("Utente.Termini")).click();
        driver.findElement(By.name("Utente.Privacy")).click();
        driver.findElement(By.id("ko_mkt_diretto")).click();
        driver.findElement(By.name("Utente.Marketing2")).click();
        driver.findElement(By.id("registerButton")).click();
        Thread.sleep(5000);
    }

    //Registration with invalid email format
    @Test
    public void InvalidEmailFormat() throws InterruptedException {
        driver.findElement(By.className("country__btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btn-login-menu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='New on Ventis?']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Utente.Email")).sendKeys("n.zaridze,com");
        driver.findElement(By.name("Utente.Passwd")).sendKeys("natia2002");
        driver.findElement(By.name("day")).click();
        Select day = new Select(driver.findElement(By.name("day")));
        day.selectByIndex(17);
        driver.findElement(By.name("month")).click();
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(6);
        driver.findElement(By.name("year")).click();
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByValue("2002");
        driver.findElement(By.name("Utente.Telefono")).sendKeys("995555256545");
        driver.findElement(By.id("genderM")).click();
        driver.findElement(By.id("genderW")).click();
        driver.findElement(By.name("Utente.Termini")).click();
        driver.findElement(By.name("Utente.Privacy")).click();
        driver.findElement(By.id("ko_mkt_diretto")).click();
        driver.findElement(By.name("Utente.Marketing2")).click();
        driver.findElement(By.id("registerButton")).click();
        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }
}
