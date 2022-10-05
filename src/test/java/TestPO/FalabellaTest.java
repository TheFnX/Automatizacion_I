package TestPO;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class FalabellaTest extends BaseTest {
    private WebDriver webDriver;

    @Test
    public void setUp() {
        SearchEnginePage searchPage = new SearchEnginePage(webDriver);
        SelectFalabellaPage selectFalabella = searchPage.search("Falabella");
        SearchOnFalabellaPage searchOnFalabella = selectFalabella.selectPageAs();
        SelectProductPage selectProduct = searchOnFalabella.searchOnFalabellaAs("Monitor");
        AddShoppingCartPage addShopingCart = selectProduct.selectProductAs();
        AddedProductPage addedProduct = addShopingCart.pressButton();
        ShoppingCartDetailPage shopingCartDetail = addedProduct.pressShoppingCartButton();
        DispatchOptionsPage dispatchOptions = shopingCartDetail.selectDetailAs();
        DispatchDataPage dispatchData = dispatchOptions.dispatchOptionsAs("BOLIVAR","CARMEN DE BOLIVAR","CARMEN DE BOLIVAR");
        DeliveryDateSelectPage deliveryDateSelect = dispatchData.dispatchDataAs("Av Montreal esq Jacaranda st","Edif. Palo Alto N 260");
        ChoosePaymentPage choosePayment = deliveryDateSelect.deliveryDateSelectAs("Entre Martes 04/10 y Lunes 10/10");
        GiftCardMessagePage giftCardMessage = choosePayment.paymentDateAs("1234567891","12345");

        GiftCardMessagePage gift = new GiftCardMessagePage(webDriver);
        Assert.assertTrue(giftCardMessage.giftCardMessageDisplayed());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}



