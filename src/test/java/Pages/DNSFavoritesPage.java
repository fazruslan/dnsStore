package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DNSFavoritesPage {

    WebDriver driver;
    public DNSFavoritesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='name']/a")
    private WebElement productNameInFavoriteProducts;

    public String getProductNameInFavoriteProducts(){
        return productNameInFavoriteProducts.getText();
    }


}
