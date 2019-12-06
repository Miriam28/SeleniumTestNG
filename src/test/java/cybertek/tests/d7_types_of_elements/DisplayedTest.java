package cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        // VERIFY ELEMENT IS DISPLAYED

        WebElement home = driver.findElement(By.linkText("Home"));
        Assert.assertTrue(home.isDisplayed());

        // VERIFY ELEMENT NOT DISPLAYED
        WebElement blue = driver.findElement(By.id("username"));

        // verify if element is displayed on screen, verify if visible
        Assert.assertTrue(blue.isDisplayed());





    }
}
