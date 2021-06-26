package DNS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends PageFactory{

    private WebDriver driver;
    public BasketPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='cart-items__product-name']/a")
    private WebElement productNameInBasketPage;

    public String getProductName(){
        return productNameInBasketPage.getText();
    }


}
