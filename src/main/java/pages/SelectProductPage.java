package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProductPage extends BasePage{

    private By selectProduct = By.id("");
    public SelectProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddShoppingCartPage selectProductAs(){
        webDriver.findElement(selectProduct).click();
        return new AddShoppingCartPage(webDriver);
    }
}
