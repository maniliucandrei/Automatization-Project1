import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriver wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    this driver = driver;


    //Elemente
    private By usernameSpan = By.xpath("//span[@class=\"username\"]");
    private By logoutButton = By.xpath("//a[@id=\"logout\"]");

    private By addToCart = By.cssSelector("div[id=\"1\"]>.shelf-item__buy-btn");
    private By checkoutButton = By.cssSelector(".buy-btn");

    private By productName = By.cssSelector("div[id=\"1\"]>.shelf-item__title");
    private By productPriceDecimal = By.cssSelector("div[id=\"1\"]>shelf-item__price>.val>span");
    private By productPrice = By.cssSelector("div[id=\"1\"]>shelf-item__price>.val");

    private By cartProdcutName = By.cssSelector("shelf-item__details>.title");
    private By cartProductPrice = By.cssSelector("shelf-item__price>p");
    private By cartTotalPrice = By.cssSelector("sub-price__val");

    public void verifycart(){
        String actualproductName = driver.findElement(productName).getText();
        String actualCartProductName = driver.findElement(productName).getText();

        Assert.assertEquals(actualproductName,actualCartProductName);

        String actualCartProductPrice = driver.findElement(cartProductPrice).getText();
        String actualCartTotalPrice = driver.findElement(cartTotalPrice).getText();
        Assert.assertEquals(actualCartTotalPrice,actualCartTotalPrice);
    }




    //Metodele cu pasii
    public void verifyLogin() throws InterruptedException {
        String username = driver.findElement(usernameSpan).getText();
        Assert.assertEquals(username, "demouser");

        String button = driver.findElement(logoutButton).getText();
        Assert.assertEquals(button, "Logout");

        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://bstackdemo.com/?signin=true");


        String price ="$ " + driver.findElement(productPrice).getText() + driver.findElement(productPriceDecimal).getText();
        Thread.sleep(500);

    }

    public void addToCart(){
        driver.findElement(addToCart).click();
        driver.findElement(checkoutButton).click();
    }
    public void checkout(){
        driver.findElement(checkoutButton);
    }
}

