import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Putem adauga navigarea catre url aici daca testam o singura aplicatie
        //In cazul nostru neavand o aplicatie de test suficient de complexa
        //Vom naviga catre url din fiecare clasa de test in parte
        // driver.get("URL");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
