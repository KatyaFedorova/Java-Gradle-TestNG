package homeProject.baseAndCommonThings;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class PathAbstract {
    // здесь содержиться все что работает с Selenium
    protected static FirefoxDriver myDriver;
    protected static WebDriverWait wait;

    public static void openURL(String url) {
        myDriver.navigate().to(url);

        }

    @BeforeMethod
    public void setUp() {
        myDriver = new FirefoxDriver();
        myDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wait = new WebDriverWait(myDriver, 10);
        // Capabilities добавлена строка что бы знать настройки браузера которые мы захотим изменить
        // в будущем что бы подключать разные браузеры при помощи Capabilities
        System.out.println(myDriver.getCapabilities());
    }

    @AfterMethod
    public void tearDown() {
        myDriver.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
