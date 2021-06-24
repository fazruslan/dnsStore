package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DNSMainPage extends PageFactory {

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


    public DNSMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
