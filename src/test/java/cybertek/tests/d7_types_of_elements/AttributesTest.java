package cybertek.tests.d7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributesTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));

        // get the value of attribute "name"
        System.out.println(blue.getAttribute("name"));

        // get the value of attribute "id"
        System.out.println(blue.getAttribute("id"));

        // we get null if the element does not have that attribute
        System.out.println(blue.getAttribute("href"));

        // it gives empty string
        System.out.println(blue.getAttribute("class"));

        // it returns true false
        System.out.println(blue.getAttribute("checked"));

        // returns the html information of that element
        System.out.println(blue.getAttribute("outerHTML"));

        // returns the text of element (in certain cases)
        System.out.println(blue.getAttribute("value"));

        // returns the text of element (in certain cases)
        System.out.println(blue.getAttribute("innerHTML"));

    }


}
