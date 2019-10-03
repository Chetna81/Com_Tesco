package Com_Tesco;

import org.junit.Test;

public class TestSuite extends BaseTest {
    private HomePage homePage = new HomePage();

    @Test
    public void userClickOnGroceries() {
        homePage.clickOnGroceries();
    }
}
