package cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // wait when trying to find element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );

        // wait while the page is loading
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        driver.quit();
    }

    @Test
    public void test1()  {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        System.out.println(driver.findElement(By.id("fiasdfasfnish")).getText());
    }

    @Test
    public void test2()  {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        System.out.println(driver.findElement(By.id("finish")).getText());

    }

}
