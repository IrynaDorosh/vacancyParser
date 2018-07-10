import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RabotaPage {
    private WebDriver driver;

    public RabotaPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }




    @FindBy(xpath = "//div[@class='f-vacancy-description-inner-content']")
    public static WebElement vacancyBody1;

    @FindBy(xpath = "//div[div[@class = 'd-items'] and @class='d_des']")
    public static WebElement vacancyBody2;









}
