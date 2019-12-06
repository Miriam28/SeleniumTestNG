package cybertek.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

<<<<<<<HEAD
=======
        >>>>>>>origin/master

<<<<<<< HEAD
//this class will be a test foundation foe all test classes
//we will put here only before and after parts
//In this way before and after method will be the same
//Every test class will extend TesBase class
=======

public abstract class TestBase {
>>>>>>> origin/master

public abstract class TestBase {

    //this class will be a test foundation for all test classes
//we will put here only before and after parts
//In this way before and after methods will be the same
//Every test class will extend testbase class
// * ExtentReports itself does not build any reports, but allows reporters to access information, which in
// * turn build the said reports. An example of building an HTML report and adding information to ExtentX:
// * ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
// * ExtentXReporter extentx = new ExtentXReporter("localhost");

        protected ExtentReports extentReports;
        //    The ExtentHtmlReporter creates a rich standalone HTML file. It allows several
        protected ExtentHtmlReporter extentHtmlReporter;
        //    Defines a test. You can add logs, snapshots, assign author and categories to a test and its children.
        protected ExtentTest extentTest;

        @BeforeTest
        public void beforeTest(){
            //location of report
            //it's gonna be next to target folder, test-output folder
            String filePath = System.getProperty("user.dir") + "/test-output/report.html";
            extentReports = new ExtentReports();
            extentHtmlReporter = new ExtentHtmlReporter(filePath);
            extentReports.attachReporter(extentHtmlReporter);
            extentHtmlReporter.config().setReportName("Vytrack Test Results");
            //system information
            extentReports.setSystemInfo("Environment", "QA1");
            extentReports.setSystemInfo("Browser", ConfigurationReader.getProperty("browser"));
            extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        }
        protected WebDriver driver;
   protected String url;

    protected String url;
    Actions actions;

    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest() {
        report = new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/report.html";
        htmlReporter = new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        htmlReporter.config().setReportName("Regression tests");

        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));

    }

    @AfterTest
    public void tearDownTest(){
        report.flush();
    }

    @BeforeMethod
    public void setupMethod() {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
<<<<<<< HEAD
        url =  ConfigurationReader.get("url");
        driver.get(url);

    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }
=======
        url = ConfigurationReader.get("url");
        driver.get(url);
        actions = new Actions(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(ITestResult result) throws InterruptedException, IOException {
        // IF FAILED TAKE SCREENSHOT
         if(result.getStatus() == ITestResult.FAILURE){
             // record the name of the failed testcase
             extentLogger.fail(result.getName());
             // take screenshot and return location of the screenshot
             String screenshot = BrowserUtils.getScreenshot(result.getName());
             extentLogger.addScreenCaptureFromPath(screenshot);
             // capture the exception
             extentLogger.fail(result.getThrowable());
         } else if (result.getStatus() == ITestResult.SKIP) {
             // sometime tests are skipped, this is how we log skipped tests
             extentLogger.skip("Test Skipped: " + result.getName());
         }


        // CLOSE BROWSER
        Thread.sleep(1000);
        Driver.closeDriver();
    }


>>>>>>> origin/master
}
