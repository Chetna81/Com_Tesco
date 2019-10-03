package Com_Tesco;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();

    LoadProp loadProp = new LoadProp();


    @Before
    public void openBrowser(){
        browserSelector.selectBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
