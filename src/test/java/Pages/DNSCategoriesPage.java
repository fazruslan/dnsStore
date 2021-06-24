package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DNSCategoriesPage extends PageFactory {

    WebDriver driver;
    public DNSCategoriesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='catalog-products view-simple']/div/a")
    private WebElement firstProductOnPage;

    @FindBy(xpath = "//div[@class='subcategory']/a[1]")
    private WebElement TvSubcategory;

    public void chooseFirstProductOnCatalog(){
        firstProductOnPage.click();
    }

    public void chooseTvSubcategory(){
        TvSubcategory.click();
    }



}
