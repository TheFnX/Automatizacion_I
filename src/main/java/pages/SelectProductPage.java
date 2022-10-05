package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SelectProductPage extends BasePage{

    private By selectProduct = By.id("testId-pod-image-20877483");
    public SelectProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddShoppingCartPage selectProductAs(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(selectProduct).click();
        return new AddShoppingCartPage(webDriver);
    }
}
