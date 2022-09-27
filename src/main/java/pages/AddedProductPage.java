package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddedProductPage extends BasePage{

    private By watchShoppingCartButton = By.id("linkButton");
    public AddedProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ShoppingCartDetailPage pressShoppingCartButton() {
        webDriver.findElement(watchShoppingCartButton).click();
        return new ShoppingCartDetailPage(webDriver);
    }
}
