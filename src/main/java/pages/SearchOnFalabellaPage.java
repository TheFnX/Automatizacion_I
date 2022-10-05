package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchOnFalabellaPage extends BasePage{

    private By inputFalabellaSearch = By.xpath("//*[@id='testId-SearchBar-Input']");
    public SearchOnFalabellaPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SelectProductPage searchOnFalabellaAs(String inputWordSearch){
       typeAndEnter(inputWordSearch, inputFalabellaSearch);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       return new SelectProductPage(webDriver);
    }
}
