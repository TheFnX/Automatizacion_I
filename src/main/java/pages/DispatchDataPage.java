package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DispatchDataPage extends BasePage {

    private By inputAddress = By.id("address");
    private By inputDepartmentNumber = By.id("departmentNumber");
    private By enterAddressButton = By.name("useAddress");
    public DispatchDataPage(WebDriver webDriver) {
        super(webDriver);
    }

    public DeliveryDateSelectPage dispatchDataAs(String address,
                                                 String departmentNumber){
        selectByVisibleText(address, inputAddress);
        selectByVisibleText(departmentNumber, inputDepartmentNumber);
        webDriver.findElement(enterAddressButton).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new DeliveryDateSelectPage(webDriver);
    }
}
