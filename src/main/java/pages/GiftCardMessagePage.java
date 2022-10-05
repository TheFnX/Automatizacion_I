package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardMessagePage extends BasePage{

    private By giftCardText = By.xpath("//section[@class='fbra_popup--section fbra_test_popup--section ']");
    public GiftCardMessagePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean giftCardMessageDisplayed(){
        WebElement element = webDriver.findElement(giftCardText);
        return element.isDisplayed();
    }
}
