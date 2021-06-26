import DNS.Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import DNS.utils.Webdriver;

import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver driver = Webdriver.getChromeDriver();
    MainPage mainPage = new MainPage(driver);
    CatalogPage catalogPage = new CatalogPage(driver);
    ProductPage productPage = new ProductPage(driver);
    BasketPage basketPage = new BasketPage(driver);
    FavoritesPage favoritesPage = new FavoritesPage(driver);

    @BeforeTest
    public void setup() {
        driver.get(mainPage.pageUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void openDNSMainPage() {
        Assert.assertTrue(mainPage.getSidebar().isDisplayed());
        Assert.assertTrue(mainPage.getAdBanner().isDisplayed());
        Assert.assertTrue(mainPage.getActualOffers().isDisplayed());
        Assert.assertTrue(mainPage.getActions().isDisplayed());
        Assert.assertTrue(mainPage.getHeaderContent().isDisplayed());

    }

    @Test
    public void addProductToBasket(){
        mainPage.chooseHouseTechnic();
        catalogPage.chooseTvSubcategory();
        catalogPage.chooseTvSubcategory();
        catalogPage.chooseFirstProduct();

        String productNameInProductPage = productPage.getProductName();

        productPage.clickBuyButton();
        productPage.goToBasketFromProductPage();

        String productNameInBasketPage = basketPage.getProductName();

        Assert.assertEquals(productNameInProductPage, productNameInBasketPage,
                "Наименование товара в корзине не соответствует наименованию выбранного товара");
    }

    @Test
    public void searchProduct(){

    }

    @Test
    public void addProductToFavorite(){
        mainPage.chooseHouseTechnic();
        catalogPage.chooseTvSubcategory();
        catalogPage.chooseTvSubcategory();
        catalogPage.chooseFirstProduct();

        String productNameInProductPage = productPage.getProductName();

        productPage.clickAddToFavoriteButton();
        productPage.closeModalWindow();
        productPage.goToFavoriteFromProductPage();

        String productNameInFavoritePage = favoritesPage.getProductName();

        Assert.assertEquals(productNameInProductPage, productNameInFavoritePage,
                "Наименование товара в избранных не соответствует наименованию выбранного товара");
    }


}
