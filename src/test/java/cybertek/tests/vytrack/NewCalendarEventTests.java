package cybertek.tests.vytrack;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewCalendarEventTests extends TestBase {


    @Test(description = "Verify that page subtitle is equals to 'All Calendar Events'")
    public void test1() {
        LoginPage loginPage = new LoginPage(); //login page object

        loginPage.login("storemanager85", "UserUser123");
        loginPage.navigateTo("Activities", "Calendar Events");

        String expectedSubtitle = "All Calendar Events";
        String actualSubTitle = loginPage.getPageSubTitle();

        Assert.assertEquals(actualSubTitle, expectedSubtitle);
    }
}
