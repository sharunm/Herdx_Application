package Herdx_SourcePackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Herdx_Base {
    // gangappan@pro17analytics.com
    //      Otis@2023
    public AndroidDriver driver;

    @BeforeTest
    public void ConfigureAppium() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("UniverseEmulator");
        options.setPlatformName("Android");

        options.setApp("C:\\APK Files\\app-staging-debug.apk");
        options.setPlatformName("Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}


