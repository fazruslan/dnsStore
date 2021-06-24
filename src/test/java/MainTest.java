import Pages.DNSMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Webdriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver driver = Webdriver.getChromeDriver();
    DNSMainPage dnsMainPage = new DNSMainPage(driver);

    @BeforeTest
    public void setup() {
        driver.get("https://www.dns-shop.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void openDNSMainPage() {
        Assert.assertTrue(dnsMainPage.getSidebar().isDisplayed());
        Assert.assertTrue(dnsMainPage.getAdBanner().isDisplayed());
        Assert.assertTrue(dnsMainPage.getActualOffers().isDisplayed());
        Assert.assertTrue(dnsMainPage.getActions().isDisplayed());
        Assert.assertTrue(dnsMainPage.getHeaderContent().isDisplayed());

    }

    @Test
    public void addProductToCard(){

    }

    @Test
    public void searchProduct(){

    }
}
