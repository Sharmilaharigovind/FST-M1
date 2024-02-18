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

public class GoogleTaskActivity {
    AndroidDriver driver;
    WebDriverWait wait;
    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address


        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Test method
    @Test
    public void GoogleTaskApp() {

        //Click on Add button
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();


        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='New task']")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.id("add_task_done")).click();



        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"])[1]/android.view.ViewGroup/android.widget.TextView")));

        String task1 = driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"])[1]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(task1, "Complete Activity with Google Tasks");


        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='New task']")));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='New task']")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"])[1]/android.view.ViewGroup/android.widget.TextView")));
         String task2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(task2, "Complete Activity with Google Keep");


        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='New task']")));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='New task']")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();



        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("(//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"])[1]/android.view.ViewGroup/android.widget.TextView")));
         String task3 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(task3, "Complete the second Activity Google Keep");
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
