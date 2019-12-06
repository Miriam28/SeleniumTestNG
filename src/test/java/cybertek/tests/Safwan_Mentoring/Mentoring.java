package cybertek.tests.Safwan_Mentoring;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mentoring {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/");
      // WebElement singUp =  driver.findElement(By.linkText("Sign Up For Mailing List"));
        WebElement singUp =  driver.findElement(By.partialLinkText("Sign Up"));
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("safwan");
        driver.close();
        Thread.sleep(5000);

    }

}
