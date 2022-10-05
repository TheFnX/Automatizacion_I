package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddedProductPage extends BasePage{

    private By watchShoppingCartButton = By.id("linkButton");
    public AddedProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ShoppingCartDetailPage pressShoppingCartButton() {
        webDriver.findElement(watchShoppingCartButton).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new ShoppingCartDetailPage(webDriver);
    }
}
