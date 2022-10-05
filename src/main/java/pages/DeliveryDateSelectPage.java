package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DeliveryDateSelectPage extends BasePage {

    private By dateRangeSelect = By.id("dateRangeSelect");
    private By goPayButton = By.xpath("//button[contains(text(),'Continuar')]");

    public DeliveryDateSelectPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ChoosePaymentPage deliveryDateSelectAs(String dataRange){
        selectByVisibleText(dataRange, dateRangeSelect);
        webDriver.findElement(goPayButton).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new ChoosePaymentPage(webDriver);
    }
}
