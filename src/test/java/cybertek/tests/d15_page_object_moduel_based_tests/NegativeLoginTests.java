package cybertek.tests.d15_page_object_moduel_based_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {
    @Test
    public void wrongPasswordTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.passwordInput.sendKeys("greatpassword");
        loginPage.loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }

    @Test
    public void wrongUsernameTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("superadminuser");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }
}