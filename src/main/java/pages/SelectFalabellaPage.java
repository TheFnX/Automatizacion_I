package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFalabellaPage extends BasePage{

    private By selectPage = By.xpath("//a[@href='https://www.falabella.com.co/falabella-co']");

    public SelectFalabellaPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SearchOnFalabellaPage selectPageAs(){
        webDriver.findElement(selectPage).click();
        return new SearchOnFalabellaPage(webDriver);
    }
}
