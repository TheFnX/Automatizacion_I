package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AddShoppingCartPage extends BasePage{

    private By addProductButton = By.xpath("//button[normalize-space()='Agregar a la Bolsa']");
    public AddShoppingCartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddedProductPage pressButton() {
        webDriver.findElement(addProductButton).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new AddedProductPage(webDriver);
    }
}
