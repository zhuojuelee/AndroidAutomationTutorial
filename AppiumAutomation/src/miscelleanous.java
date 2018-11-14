import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class miscelleanous extends base {

    public static void main(String[] args) throws MalformedURLException {

        // These are miscelleanous methods that are useful for validations and other things

        AndroidDriver<AndroidElement> driver = Capabilities();
        System.out.println(driver.currentActivity());  // Prints out what activity you are in
        System.out.println(driver.getContext()); // Views - Native, Hybrid, WebView: Prints you what mode you are in
        System.out.println(driver.getOrientation()); // Gets your device's orientation (Landscape/Portrait)
        System.out.println(driver.isDeviceLocked()); // Checks if your device is locked
        // driver.hideKeyboard(); // Hides the keyboard
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.pressKeyCode(AndroidKeyCode.BACK); // Use pressKeyCode() to hit the android back/home/square button
        // driver.pressKeyCode(AndroidKeyCode.HOME);

    }

}
