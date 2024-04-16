import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LogInPage {
    public static void main(String[] args) {
        // Instantiere driver
        WebDriver driver = new ChromeDriver();

        // Setare rezolutie
        driver.manage().window().setSize(new Dimension(1920, 1080));

        // Navigare catre pagina
        driver.get("https://bstackdemo.com/signin");
        driver.findElement(By.cssSelector("#react-select-2-input")).sendKeys("demouser");
        driver.findElement(By.cssSelector("#react-select-2-input")).sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("#react-select-3-input")).sendKeys("testingisfun99");
        driver.findElement(By.cssSelector("#react-select-3-input")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#login-btn")).click();


    }
}



