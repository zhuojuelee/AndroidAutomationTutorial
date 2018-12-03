import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.time.Duration;

public class dragAndDrop extends base {

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
        // WebElement hiddenDot = driver.findElementById("io.appium.android.apis:id/drag_dot_hidden");

        /* Steps to perform drag and drop
            1. Long press the top left dot (dot1)
            2. Move the dot and then release
         */
        t.longPress(longPressOptions().withElement(element(dot1)).withDuration(ofSeconds(2))).moveTo(element(dot3)).release().perform();
        // Or you can write ^above^ like below:
        // t.longPress(element(dot1)).moveTo(element(dot3)).release().perform();
        // We use the one we are using now, because we have extra steps we are doing. For example: withDuration



    }

}
