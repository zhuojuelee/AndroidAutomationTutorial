import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;

public class dragAndDrop2 extends base {

    // This drag and drop test is to drag any of the first 3 dots into the hidden dot

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

        // Using Tap options for long press
        TouchAction t = new TouchAction(driver);
        // Defining the Elements
        WebElement dot1 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
        WebElement dot2 = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
        WebElement dot3 = driver.findElementById("io.appium.android.apis:id/drag_dot_3");

        /* Steps to perform drag and drop on hidden dot
            1. Long press the top left dot (dot1) or any of the first 3
            2. Move the dot to hidden dot and release
         */
        t.longPress(longPressOptions().withElement(element(dot3)).withDuration(ofSeconds(2))).perform();
        // Now we see the hidden dot so we define the new element for it
        WebElement hiddenDot = driver.findElementById("io.appium.android.apis:id/drag_dot_hidden");
        t.moveTo(element(hiddenDot)).release().perform();



    }

}
