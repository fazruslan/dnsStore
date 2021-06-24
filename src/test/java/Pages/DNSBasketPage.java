package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DNSBasketPage extends PageFactory{

    WebDriver driver;
    public DNSBasketPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='cart-items__product-name']/a")
    private WebElement productNameInBasketPage;

    public String getProductNameInPasketPage(){
        return productNameInBasketPage.getText();
    }


}
