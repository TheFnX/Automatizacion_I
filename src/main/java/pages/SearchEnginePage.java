package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchEnginePage extends BasePage {

    private By inputSearch = By.xpath("//input[@title='Buscar']");

    public SearchEnginePage(WebDriver webDriver) {
        super(webDriver);
    }

    public SelectFalabellaPage search(String wordSearch){
        typeAndEnter(wordSearch, inputSearch);
        return new SelectFalabellaPage(webDriver);
    }
}
