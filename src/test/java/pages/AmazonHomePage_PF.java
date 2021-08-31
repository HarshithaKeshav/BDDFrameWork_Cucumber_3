package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage_PF {
    @FindBy(id="twotabsearchtextbox")
    WebElement txt_searchbox;

    @FindBy(id="nav-search-submit-button")
    WebElement btn_searchbtn;

    WebDriver driver;

    public AmazonHomePage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterSearchBox(String text){

        txt_searchbox.sendKeys(text);
    }

    public void clickOnSearchButton(){

        btn_searchbtn.click();
    }
}
