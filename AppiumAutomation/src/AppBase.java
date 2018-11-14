import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.io.File;

import java.net.MalformedURLException;
import java.sql.SQLException;

public class AppBase {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, MalformedURLException {

        // This class is to invoke an App with package activity
        File appDir = new File("src");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "DEVICE_PLATFORM");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NAME_OF_DEVICE");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "00");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE, "some_ID");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY,"Activity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

    }

}
