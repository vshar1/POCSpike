
package Tests;

import java.io.File;
import Tests.AbstractBaseTests.TestBase;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

/**
 * Test.
 */
public class ScreenshotTest extends TestBase {

    private final String TEST_URL = "http://www.google.com/";

    @Test
    public void testScreenshot() throws InterruptedException {

	Thread.sleep(5000);
	driver.get(TEST_URL);
	Thread.sleep(5000);
	// This will store the screenshot under /tmp on your local machine
	String screenshotDir = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	screenshot.renameTo(new File(screenshotDir, "device_farm.png"));

    }
}
