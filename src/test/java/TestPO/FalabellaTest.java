package TestPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

public class FalabellaTest {

    private WebDriver webDriver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.google.com/");
        webDriver.manage().window().maximize();

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

        webDriver.quit();
    }
    public static void main(String arg[]) throws InterruptedException {
        FalabellaTest falabellaTest = new FalabellaTest();
        falabellaTest.setUp();
    }

}



