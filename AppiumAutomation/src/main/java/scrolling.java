import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class scrolling extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();

        // Opening Views
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        // Appium does not support any method for scrolling, so we use something called UiScrollable (Android Dev)
        // Note: This call is an Android API call, it has nothing to do with Appium
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"));");


    }


}
