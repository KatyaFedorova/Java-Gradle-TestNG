package homeProject.baseAndCommonThings;

import org.openqa.selenium.By;

public class BaseFunctions extends PathAbstract{
        // здесь содержиться все что работает с елементами браузера

        public static void openURL(String url) {
        myDriver.navigate().to(url);
        }

    public static void clickOnElement(By by) {
        myDriver.findElement(by).click();
    }

    public static void fillInput(By by, String value) {
        myDriver.findElement(by).sendKeys(value);
    }
}
