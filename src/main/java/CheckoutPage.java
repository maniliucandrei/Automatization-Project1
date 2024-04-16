import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    //Constructor
    WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    //elemente
    private By firstName = By.cssSelector("#firstNameInput");
    private By lastName = By.cssSelector("#lastNameInput");
    private By address = By.cssSelector("#addressLine1Input");
    private By state = By.cssSelector("#provinceInput");
    private By postCode = By.cssSelector("#postCodeInput");
    private By submit = By.cssSelector("#checkout-shipping-continue");

    //metode cu pasii
    public void fillShipping(){
        driver.findElement(firstName).sendKeys("ion");
        driver.findElement(lastName).sendKeys("Ionescu");
        driver.findElement(address).sendKeys("adresa");
        driver.findElement(state).sendKeys("stat");
        driver.findElement(postCode).sendKeys("12345");
        driver.findElement(submit).click();
    }
}