import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class testRunner {

    static ChromeDriver driver;

    homePage home = PageFactory.initElements(driver, homePage.class);

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown (){
        driver.quit();
    }


    @Given("^the correct web address$")
    public void the_correct_web_address()  {
    driver.get(constants.url);
    }

    @When("^I click on hotels$")
    public void i_click_on_hotels()  {
    home.clickHotels();
    }

    @When("^I search for London$")
    public void i_search_for_London()  {
    home.searchLondon();
    }

    @When("^I book for two adults$")
    public void i_book_for_two_adults()  {


    }

    @When("^I book for two nights$")
    public void i_book_for_two_nights() {
    home.selectDateFrom();
    home.selectToDate();
    }

    @When("^I search for a hotel$")
    public void i_search_for_a_hotel()  {

    }

    @Then("^I find a grand plaza apartments$")
    public void i_find_a_grand_plaza_apartments()  {
        // Write code here that turns the phrase above into concrete actions
    }



}
