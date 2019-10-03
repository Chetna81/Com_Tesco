package Com_Tesco;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By groceries = By.linkText("Groceries");

    public void clickOnGroceries(){
        clickOnElement(groceries);
    }
}
