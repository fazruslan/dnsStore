import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Webdriver;

import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver driver = Webdriver.getChromeDriver();
    DNSMainPage dnsMainPage = new DNSMainPage(driver);
    DNSCategoriesPage dnsCategoriesPage = new DNSCategoriesPage(driver);
    DNSProductPage dnsProductPage = new DNSProductPage(driver);
    DNSBasketPage dnsBasketPage = new DNSBasketPage(driver);
    DNSFavoritesPage dnsFavoritesPage = new DNSFavoritesPage(driver);

    @BeforeTest
    public void setup() {
        driver.get(dnsMainPage.pageUrl);
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
    public void addProductToBasket(){
        dnsMainPage.chooseHouseTechnic();
        dnsCategoriesPage.chooseTvSubcategory();
        dnsCategoriesPage.chooseTvSubcategory();
        dnsCategoriesPage.chooseFirstProductOnCatalog();

        String productNameInProductPage = dnsProductPage.getProductNameInProductPage();

        dnsProductPage.clickBuyButton();
        dnsProductPage.goToBasketFromProductPage();

        String productNameInBasketPage = dnsBasketPage.getProductNameInPasketPage();

        Assert.assertEquals(productNameInProductPage, productNameInBasketPage);
    }

    @Test
    public void searchProduct(){

    }

    @Test
    public void addProductToFavorite(){
        dnsMainPage.chooseHouseTechnic();
        dnsCategoriesPage.chooseTvSubcategory();
        dnsCategoriesPage.chooseTvSubcategory();
        dnsCategoriesPage.chooseFirstProductOnCatalog();

        String productNameInProductPage = dnsProductPage.getProductNameInProductPage();

        dnsProductPage.clickAddToFavoriteButton();
        dnsProductPage.closeModalWindow();
        dnsProductPage.goToFavoriteFromProductPage();

        String productNameInFavoritePage = dnsFavoritesPage.getProductNameInFavoriteProducts();

        Assert.assertEquals(productNameInProductPage, productNameInFavoritePage );
    }


}
