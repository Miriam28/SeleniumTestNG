package cybertek.tests.d4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {

    public static void main(String[] args) {



        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.tagName("input"));
        fullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("jdoe@cybertekschool.com");

        WebElement submitbutton = driver.findElement(By.tagName("button"));
        submitbutton.click();

    }
}


