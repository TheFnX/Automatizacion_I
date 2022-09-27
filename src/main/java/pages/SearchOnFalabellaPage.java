package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchOnFalabellaPage extends BasePage{

    private By inputFalabellaSearch = By.xpath("//*[@id='testId-SearchBar-Input']");
    public SearchOnFalabellaPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SelectProductPage searchOnFalabellaAs(String inputWordSearch){
       webDriver.findElement(inputFalabellaSearch).sendKeys(inputWordSearch);
       return new SelectProductPage(webDriver);
    }
}
