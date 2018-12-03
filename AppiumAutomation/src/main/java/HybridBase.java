import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HybridBase {

    public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException {

        // Appium Code
        File f = new File("src");
        File fs = new File(f, "ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        if (device.equals("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
        } else if (device.equals("real")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device"); // Use "Android Device" for a real device
        }
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

}
