import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.offset.PointOption.point;

public class scrollingRealDevice extends HybridBase {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities("real");
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        Dimension size = driver.manage().window().getSize();
        int x = size.getWidth() / 2;
        int starty = (int) (driver.manage().window().getSize().height * 0.1);
        int endy = (int) (driver.manage().window().getSize().height * 0.8);

        // Scrolling via TouchActions
        TouchAction t = new TouchAction(driver);
        t.longPress(point(x,starty)).moveTo(point(x,endy)).release().perform();



    }

}
