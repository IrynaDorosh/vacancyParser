import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LetsParse {
     private static WebDriver driver;



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

        HashMap<String, String> linksAndKeyWordsMap = new HashMap<String, String>();

        for (int i=0; i<listOfULs.size(); i++){
            listOfULs.get(i).click();
            String vacancyBody = Helper.obtainTextFromInnerContent();
            String KeyWordNameIfFound = Helper.KeyWordsNamesChecker(vacancyBody);
            String refinedLink = driver.getCurrentUrl();
            linksAndKeyWordsMap.put(refinedLink, KeyWordNameIfFound);
        }

        for(Map.Entry entry: linksAndKeyWordsMap.entrySet()){
            System.out.println("Key: "+ entry.getKey()+"Value: "+ entry.getValue()); 
        }








    }

}
