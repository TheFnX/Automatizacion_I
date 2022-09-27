package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.InputEvent;

public class BaseTest {

    private WebDriver webDriver;

    public void setUp() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.google.com/");
        webDriver.manage().window().maximize();
//        Thread.sleep(1000);
        searchPage();
//        Thread.sleep(1000);
        selectFalabellaPage();
//        waitAlertPage();
        searchOnFalabellaPage();
        Thread.sleep(1000);
        selectProduct();
        Thread.sleep(1000);
        addShoppingCart();
        Thread.sleep(1000);
        addedProduct();
        Thread.sleep(1000);
        shoppingCartDetail();
        Thread.sleep(1000);
        dispatchOptions();
        Thread.sleep(1000);
        dispatchData();
        Thread.sleep(1000);
        deliveryDateSelect();
        Thread.sleep(3000);
        choosePayment();
        Thread.sleep(3000);
        webDriver.quit();
    }

    public void searchPage(){
        WebElement inputSearch = webDriver.findElement(By.xpath("//input[@title='Buscar']"));
        inputSearch.sendKeys("Falabella");
        inputSearch.sendKeys(Keys.ENTER);
    }

    public void selectFalabellaPage(){
        WebElement optionFalabella = webDriver.findElement(By.xpath("//a[@href='https://www.falabella.com.co/falabella-co']"));
        optionFalabella.click();
    }

    /*public void waitAlertPage() throws AWTException {
        webDriver.findElement(By.className("airship-btn airship-btn-deny"));
        Robot robot = new Robot();
        robot.mouseMove(240,256);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }*/

    public void searchOnFalabellaPage(){
        WebElement inputFalabellaSearch = webDriver.findElement(By.xpath("//*[@id='testId-SearchBar-Input']"));
        inputFalabellaSearch.sendKeys("Monitor");
        inputFalabellaSearch.sendKeys(Keys.ENTER);
    }
    public void selectProduct(){
        WebElement selectProduct = webDriver.findElement(By.id("testId-pod-image-20877483"));
        selectProduct.click();
    }

    public void addShoppingCart(){
        WebElement addProductButton = webDriver.findElement(By.xpath("//button[contains(text(),'Agregar a la Bolsa')]"));
        addProductButton.click();
    }

    public void addedProduct(){
        WebElement watchShoppingCartButton = webDriver.findElement(By.id("linkButton"));
        watchShoppingCartButton.click();
    }

    public void shoppingCartDetail() throws InterruptedException {
        WebElement increaseProductButton = webDriver.findElement(By.xpath("//button[contains(text(),'+')]"));
        increaseProductButton.click();
        Thread.sleep(1000);

        WebElement openSelectWarranty = webDriver.findElement(By.xpath("//div[@class='fb-inline-dropdown fb-inline-dropdown--whiteBox fb-inline-dropdown--greyBox fb-inline-dropdown--is-closed']"));
        openSelectWarranty.click();

        WebElement selectWarranty = webDriver.findElement(By.xpath("//div[@class=\"fb-inline-dropdown__list__container \"]/ul/li[2]"));
        selectWarranty.click();
        Thread.sleep(1000);

        WebElement goShoppingButton = webDriver.findElement(By.xpath("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));
        goShoppingButton.click();
    }

    public void dispatchOptions() throws InterruptedException {
        Select departmentSelect = new Select(webDriver.findElement(By.id("region")));
        departmentSelect.selectByVisibleText("BOLIVAR");
        Thread.sleep(1000);

        Select countrySelect = new Select(webDriver.findElement(By.id("ciudad")));
        countrySelect.selectByVisibleText("CARMEN DE BOLIVAR");
        Thread.sleep(1000);

        Select neighborhoodSelect = new Select(webDriver.findElement(By.id("comuna")));
        neighborhoodSelect.selectByVisibleText("CARMEN DE BOLIVAR");
        Thread.sleep(1000);

        WebElement continueButton = webDriver.findElement(By.name("field04"));
        continueButton.click();
    }

    public void dispatchData(){
        WebElement inputAddress = webDriver.findElement(By.id("address"));
        inputAddress.sendKeys("Av Montreal esq Jacaranda st");

        WebElement inputDepartmentNumber = webDriver.findElement(By.id("departmentNumber"));
        inputDepartmentNumber.sendKeys("Edif. Palo Alto N 260");

        WebElement enterAddress = webDriver.findElement(By.name("useAddress"));
        enterAddress.click();
    }

    public void deliveryDateSelect(){
        Select dateRangeSelect = new Select(webDriver.findElement(By.id("dateRangeSelect")));
        dateRangeSelect.selectByVisibleText("Entre Martes 04/10 y Lunes 10/10");

        WebElement goPayButton = webDriver.findElement(By.xpath("//button[contains(text(),'Continuar')]"));
        goPayButton.click();
    }

    public void choosePayment() throws InterruptedException {
        WebElement selectGiftCard = webDriver.findElement(By.cssSelector(".fbra_giftcard_redesign.fbra_appContainer.fbra_test_appContainer"));
        selectGiftCard.click();
        Thread.sleep(2000);

        WebElement inputGiftCardNumber = webDriver.findElement(By.id("giftCardNumber"));
        inputGiftCardNumber.sendKeys("1234567891234");

        WebElement inputGiftCardSecurityCode = webDriver.findElement(By.id("giftCardSecurityCode"));
        inputGiftCardSecurityCode.sendKeys("123ABC");

        WebElement addCode = webDriver.findElement(By.xpath("//button[contains(text(),'AGREGAR')]"));
        addCode.click();
    }

    public static void main(String arg[]) throws InterruptedException, AWTException {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();

    }
}
