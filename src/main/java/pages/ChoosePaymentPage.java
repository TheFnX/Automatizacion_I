package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ChoosePaymentPage extends BasePage {

    private By giftCardButton = By.cssSelector(".fbra_giftcard_redesign.fbra_appContainer.fbra_test_appContainer");
    private By inputGiftCardNumber = By.id("giftCardNumber");
    private By inputGiftCardSecurityCode = By.id("giftCardSecurityCode");
    private By addCodeButton = By.xpath("//button[contains(text(),'AGREGAR')]");
    public ChoosePaymentPage(WebDriver webDriver) {
        super(webDriver);
    }

    public GiftCardMessagePage paymentDateAs(String giftCardNumber,
                                             String giftCardSecurityCode){
        webDriver.findElement(giftCardButton).click();
        selectByVisibleText(giftCardNumber, inputGiftCardNumber);
        selectByVisibleText(giftCardSecurityCode, inputGiftCardSecurityCode);
        webDriver.findElement(addCodeButton).click();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return new GiftCardMessagePage(webDriver);
    }
}
