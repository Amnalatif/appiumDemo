import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

public class SampleTest {
    AppiumDriver driver;
    TouchAction touch;


    @BeforeTest
    public void initializer() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("deviceName", "emulator-5554");
        // capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "D:/Appium/apps/ekar-app-demo.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//        System.out.println(System.getProperty("user.dir"));D:Appium/apps/ekar-apps-demo.apk

    }
    @Test
    // Testcase : 01 -> As a user, I should be able to locate my location via pin drop
    // Testcase : 02 -> As a user, I should upload four images to the app after clicking on the pin drop
    public void clickAppButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(6000);
        driver .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")).click();
        Thread.sleep(5000);

        // first image
        driver.findElement(By.id("in.testdemo.map:id/front_img")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();
        // second image
        driver.findElement(By.id("in.testdemo.map:id/back_img")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();
        // third image
        driver.findElement(By.id("in.testdemo.map:id/left_img")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();
        // fourth image
        driver.findElement(By.id("in.testdemo.map:id/right_img")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();

        pressByCoordinates(547,2250,5);
        swipeByCoordinates(1055,2093,823,1305);
        // comment
        driver.findElement(By.id("in.testdemo.map:id/cmd_txt")).sendKeys("Thankyou ");
        Thread.sleep(1000);

        driver.findElement(By.id("next_btn")).click();
    }


    @Test
    //  Testcase : 03 - > I should not be able to proceed to the next step until I have uploaded four images
    public void clickImageButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
        Thread.sleep(6000);
        driver .findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")).click();
        Thread.sleep(5000);

        // first image
        driver.findElement(By.id("in.testdemo.map:id/front_img")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();
        // second image
//        driver.findElement(By.id("in.testdemo.map:id/back_img")).click();
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();
//        // third image
        driver.findElement(By.id("in.testdemo.map:id/left_img")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();
        // fourth image
//        driver.findElement(By.id("in.testdemo.map:id/right_img")).click();
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")).click();
//        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, March 27, 2023 22:20:25, ekar Demo\"]/android.widget.FrameLayout/android.widget.TextView")).click();

        pressByCoordinates(547,2250,5);
        swipeByCoordinates(1055,2093,823,1305);
        // comment
        driver.findElement(By.id("in.testdemo.map:id/cmd_txt")).sendKeys("Thankyou ");
        Thread.sleep(1000);

        driver.findElement(By.id("next_btn")).click();
    }
    public void swipeByCoordinates (int start_x, int start_y, int end_x, int end_y){

        TouchAction ta = new TouchAction((PerformsTouchActions) driver);
        ta.longPress(point(start_x, start_y)).waitAction().moveTo(point(end_x, end_y)).release().perform();
    }
    public void pressByCoordinates (int x, int y, long seconds) {
        TouchAction t =new TouchAction((PerformsTouchActions) driver);
        t
                .press(point(x,y))
                .waitAction(waitOptions(ofSeconds(seconds)))
                .release()
                .perform();
    }
//    @AfterTest
//    public void tearDown(){
//        if(null != driver) {
//            driver.quit();
//        }
//    }
}


