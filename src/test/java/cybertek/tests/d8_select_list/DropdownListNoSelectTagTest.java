package cybertek.tests.d8_select_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownListNoSelectTagTest {


    @Test
    public void test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");


        WebElement dropdownlink = driver.findElement(By.id("dropdownMenuLink"));

        dropdownlink.click();

        List<WebElement> options = driver.findElements(By.className("dropdown-item"));
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.findElement(By.linkText("Yahoo")).click();

    }
}
