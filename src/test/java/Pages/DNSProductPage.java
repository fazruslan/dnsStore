package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DNSProductPage extends PageFactory {

    WebDriver driver;
    public DNSProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='product-card-top__buy']//button[2]")
    private WebElement buyButton;

    @FindBy(xpath = "//a[@class='ui-link cart-link']")
    private WebElement basketButton;

    @FindBy(xpath = "//h1['product-card-top__title']")
    private WebElement productName;

    @FindBy(xpath = "//div[@class='product-buy product-buy_one-line']/button")
    private WebElement addToFavoriteButton;

    @FindBy(xpath = "//div[@class='wishlist-login-modal__buttons']/a")
    private WebElement closeModalWindowButton;

    @FindBy(xpath = "//div[@class='buttons']/a[2]")
    private WebElement favoriteButton;

    public void clickBuyButton(){
        buyButton.click();
    }

    public void goToBasketFromProductPage(){
        basketButton.click();
    }

    public String getProductNameInProductPage(){
        return productName.getText();
    }

    public void clickAddToFavoriteButton(){
        addToFavoriteButton.click();
    }

    public void closeModalWindow(){
        closeModalWindowButton.click();
    }

    public void goToFavoriteFromProductPage(){
        favoriteButton.click();
    }
}
