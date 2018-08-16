import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

    @FindBy (xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div[2]/ul/li[1]/a/span")
    WebElement hotels;

    @FindBy (xpath = "//*[@id=\"s2id_autogen8\"]/a")
    WebElement searchBox;

    @FindBy (xpath = "//*[@id=\"dpd1\"]/div/input")
    WebElement fromDate;

    @FindBy (xpath = "/html/body/div[8]/div[1]/table/tbody/tr[4]/td[6]")
    WebElement date1;

    @FindBy (xpath = "//*[@id=\"dpd2\"]/div/input")
    WebElement toDate;

    @FindBy (xpath = "/html/body/div[9]/div[1]/table/tbody/tr[5]/td[1]")
    WebElement date2;

    @FindBy (xpath = "//*[@id=\"travellersInput\"]")
    WebElement choosePeople;

    @FindBy (xpath = "//*[@id=\"adultInput\"]")
    WebElement numberIn;



    public void clickHotels (){
        hotels.click();
    }

    public void searchLondon (){
        searchBox.sendKeys("London");
    }

    public void selectDateFrom (){
        fromDate.click();
        date1.click();
    }

    public void selectToDate (){
        toDate.click();
        date2.click();
    }

    public void selectPeople (){
        choosePeople.click();
        numberIn.sendKeys("2");
    }
}
