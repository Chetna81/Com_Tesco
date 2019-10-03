package Com_Tesco;

import org.openqa.selenium.By;

public class Utils extends BasePage {

    //reusable method
    //click method

    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
}

