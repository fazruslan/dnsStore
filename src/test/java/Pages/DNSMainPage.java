package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DNSMainPage extends PageFactory {

    public String pageUrl = "https://www.dns-shop.ru/";

    WebDriver driver;

    @FindBy(xpath = "//div[@id='homepage-desktop-menu-wrap']")
    private WebElement sidebar;

    @FindBy(xpath = "//div[@id='tns2-iw']")
    private WebElement adBanner;

    @FindBy(xpath = "//div[@class='homepage-actual-offers-main']")
    private WebElement actualOffers;

    @FindBy(xpath = "//div[@class='homepage-actions']")
    private WebElement actionsUnit;

    @FindBy(xpath = "//nav[@id='header-search']")
    private WebElement headerContent;

    @FindBy(xpath = "//div[@id='homepage-desktop-menu-wrap']//div[3]/div/a")
    private WebElement houseTechnics;

    @FindBy(xpath = "//form[@id='u13404bbb67f247c39c1046e38180a57e']//input")
    private WebElement searchField;

    @FindBy(xpath = "//a[@class='btn btn-additional']")
    private WebElement acceptCity;

    public WebElement getSidebar(){
        return sidebar;
    }

    public WebElement getAdBanner(){
        return adBanner;
    }

    public WebElement getActualOffers(){
        return actualOffers;
    }

    public WebElement getActions(){
        return actionsUnit;
    }

    public WebElement getHeaderContent(){
        return headerContent;
    }

    public void chooseHouseTechnic(){
        houseTechnics.click();
    }

    public void typeSearchText(){
        searchField.sendKeys("Смартфоны");
    }

    public void clickSearchField(){
        searchField.click();
    }

    public void submitSearchButton() {
        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        searchField.submit();
    }

    public void clickAcceptCity(){
        acceptCity.click();
    }

    public DNSMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
