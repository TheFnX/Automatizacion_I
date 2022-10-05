package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        return new DeliveryDateSelectPage(webDriver);
    }
}
