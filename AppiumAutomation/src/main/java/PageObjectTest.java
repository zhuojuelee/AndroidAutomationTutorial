import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import pageObjects.*;

public class PageObjectTest extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        HomePage h = new HomePage(driver);
        Preferences p = new Preferences(driver);

        h.Preferences.click();
        p.dependencies.click();
    }

}
