import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {


    public static String obtainTextFromInnerContent(){

        String result = null;

        if (RabotaPage.vacancyBody1.isEnabled()){
            result = RabotaPage.vacancyBody1.getAttribute("innerText");
        }
        else if (RabotaPage.vacancyBody2.isEnabled()){
            result = RabotaPage.vacancyBody2.getAttribute("innerText");
        }
        else {
            System.out.println("VACANCY BODY IS NOT FOUND");
        }

        return result;

    }



    public static String KeyWordsNamesChecker(String vacancyBody){
        String resulrWord = null;

        return resulrWord;
    }

}
