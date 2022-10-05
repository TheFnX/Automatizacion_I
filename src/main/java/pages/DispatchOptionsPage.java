package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DispatchOptionsPage extends BasePage{

    private By departmentSelect = By.id("region");
    private By countrySelect = By.id("ciudad");
    private By neighborhoodSelect = By.id("comuna");
    private By continueButton = By.name("field04");

    public DispatchOptionsPage(WebDriver webDriver) {
        super(webDriver);

    }

    public DispatchDataPage dispatchOptionsAs(String department,
                                              String country,
                                              String neighborhood){
        selectByVisibleText(department, departmentSelect);
        selectByVisibleText(country, countrySelect);
        selectByVisibleText(neighborhood, neighborhoodSelect);
        webDriver.findElement(continueButton).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new DispatchDataPage(webDriver);
    }
}
