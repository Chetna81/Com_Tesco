package Com_Tesco;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;

public class BrowserSelector extends Utils {

    //object of loadprop class

    LoadProp loadProp = new LoadProp();


    String browser = loadProp.getProperty("browser");

    public void selectBrowser() {
        String browser = loadProp.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();

        }else {
            System.out.println("wronr browser name");
        }
    }


}
