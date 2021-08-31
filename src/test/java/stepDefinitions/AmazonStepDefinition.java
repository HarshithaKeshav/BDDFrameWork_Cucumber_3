package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonHomePage_PF;

import java.util.concurrent.TimeUnit;

public class AmazonStepDefinition {

    WebDriver driver;
    AmazonHomePage_PF amazonHomePage_pf;

    @Before
    public void setUp(){
        String ProjDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        System.out.println("Before SetUp 1");
    }

//        @Before(order = 2, value = "@RegressionFlow")
//        public void setUp2(){
//        String ProjDir = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver");
//        driver = new ChromeDriver();
//        System.out.println("Before SetUp2");
//    }

//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("Before Step");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("After Step");
//    }



    @Given("amazon webpage is launched")
    public void amazonWebpageIsLaunched() {
        driver.get("https://www.amazon.in/");
        amazonHomePage_pf = new AmazonHomePage_PF(driver);
    }

//    @When("users enter the product name")
//    public void usersEnterTheProductName() {
//        amazonHomePage_pf.enterSearchBox("Iphone");
//    }

    @When("user enters a product name{string} in the search box")
    public void userEntersAProductNameInTheSearchBox(String arg0){
        amazonHomePage_pf.enterSearchBox(arg0);
    }


    @And("clicks on search button")
    public void clicksOnSearchButton() {
        amazonHomePage_pf.clickOnSearchButton();
    }

    @Then("search results should be displayed")
    public void searchResultsShouldBeDisplayed() {
        System.out.println("Test Successful");
    }

    @After
    public void tearDown(){
        driver.close();
        System.out.println("After");

    }

    @When("user enters a product in the search box")
    public void userEntersAProductInTheSearchBox(DataTable product) {
        amazonHomePage_pf.enterSearchBox(product.cell(0,0));
    }
}
