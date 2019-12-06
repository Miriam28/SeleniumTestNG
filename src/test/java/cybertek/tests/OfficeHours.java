package cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfficeHours {
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","");

        driver.get("https://washingtondc.craigslist.org/d/free-stuff/search/nva/zip");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement inputBox = driver.findElement(By.id("query"));
        inputBox.sendKeys("test");
        System.out.println(inputBox.getAttribute("value"));

    }

}
