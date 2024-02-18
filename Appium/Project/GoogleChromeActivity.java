import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleChromeActivity {

        WebDriverWait wait;
        AndroidDriver driver;

        @BeforeClass
        public void beforeClass() throws MalformedURLException {
            // Desired Capabilities
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            options.setAppPackage("com.android.chrome");
            options.setAppActivity("com.google.android.apps.chrome.Main");
            options.noReset();

            // Server URL
            URL serverURL = new URL("http://localhost:4723/wd/hub");

            // Driver initialization
            driver = new AndroidDriver(serverURL, options);
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Open Selenium page
            driver.get("https://v1.training-support.net/selenium");
        }

        @Test
        public void GoogleChrome() {

            String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
            // Wait for the page to load
            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));

            // Just scroll
            //driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward(3)"));

            // Scroll and locate elements
            driver.findElement(AppiumBy.androidUIAutomator(
            UiScrollable + ".scrollTextIntoView(\"To-Do List\")"
            )).click();


            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='To-Do List']")));


            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='To-Do List']")).click();


            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.className("android.widget.EditText")));

            driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Test");

            driver.findElement(AppiumBy.xpath( "//android.widget.Button[@text='Add Task']")).click();


            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath( "//android.widget.TextView[@text='Test']")));

            String addText=driver.findElement(AppiumBy.xpath( "//android.widget.TextView[@text='Test']")).getText();

            Assert.assertEquals(addText, "Test");

//Strike text
            driver.findElement(AppiumBy.xpath( "//android.widget.TextView[@text='Test']")).click();


            //CLick on Clear List button
            wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath( "//android.widget.TextView[@text=' Clear List']")));

            driver.findElement(AppiumBy.xpath( "//android.widget.TextView[@text=' Clear List']")).click();

        }

        @AfterClass
        public void afterClass() {
            driver.quit();
        }

}
