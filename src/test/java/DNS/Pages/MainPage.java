package DNS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends PageFactory {

    public String pageUrl = "https://www.dns-shop.ru/";

    private WebDriver driver;

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

    public void clickAcceptCity(){
        acceptCity.click();
    }

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
