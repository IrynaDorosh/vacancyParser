import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LetsParse {
     private static WebDriver driver;
     private static String vacancyBody;


    @BeforeClass
    public static void beforeclass(){

        System.setProperty("webdriver.chrome.driver", ".//src//main//java//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        rabotaPage = new RabotaPage(driver);
    }

    @Test
    public void obtainAllVacancyBodies(){
        driver.get(Constants.LINK);

        List<WebElement> listOfULs = driver.findElements(By.xpath(Constants.RABOTA_XPATH));

        ArrayList<String> listOfAnswers = new ArrayList<String>();
        for (int i=0; i<listOfULs.size(); i++){
            vacancyBody = Helper.obtainTextFromInnerContent();
            listOfAnswers.add(vacancyBody);
        }

        






    }

}
