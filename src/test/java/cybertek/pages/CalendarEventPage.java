package cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventPage extends BasePage{

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    public void clickToCreateCalendarEvent(){
        BrowserUtils.waitForVisibility(createCalendarEvent, 5);
        BrowserUtils.waitForClickablility(createCalendarEvent, 5);
        createCalendarEvent.click();
    }

}
