package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddShoppingCartPage extends BasePage{

    private By addProductButton = By.xpath("//button[normalize-space()='Agregar a la Bolsa']");
    public AddShoppingCartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddedProductPage pressButton() {
        webDriver.findElement(addProductButton).click();
        return new AddedProductPage(webDriver);
    }
}
