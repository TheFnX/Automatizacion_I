package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ShoppingCartDetailPage extends BasePage{

    private By increaseProductButton = By.xpath("//button[contains(text(),'+')]");
    private By openSelectWarranty = By.xpath("//div[@class='fb-inline-dropdown fb-inline-dropdown--whiteBox fb-inline-dropdown--greyBox fb-inline-dropdown--is-closed']");
    private By selectWarranty = By.xpath("//div[@class=\"fb-inline-dropdown__list__container \"]/ul/li[2]");
    private By goShoppingButton = By.xpath("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");
    public ShoppingCartDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public DispatchOptionsPage selectDetailAs(){
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(increaseProductButton).click();
        webDriver.findElement(openSelectWarranty).click();
        webDriver.findElement(selectWarranty).click();
        webDriver.findElement(goShoppingButton).click();
        return new DispatchOptionsPage(webDriver);
    }
}
