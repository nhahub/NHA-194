package Formula1;

import org.openqa.selenium.*;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class  TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");

        if (driver != null) {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File dest = new File("screenshots/" + result.getName() + ".png");
            dest.getParentFile().mkdirs();

            try {
                Files.copy(src.toPath(), dest.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Screenshot taken: " + dest.getAbsolutePath());
        }
    }
}

