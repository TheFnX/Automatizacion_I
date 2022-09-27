package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectProductPage extends BasePage{

    private By selectProduct = By.id("testId-pod-image-20877483");
    public SelectProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddShoppingCartPage selectProductAs(){
        webDriver.findElement(selectProduct).click();
        return new AddShoppingCartPage(webDriver);
    }
}
