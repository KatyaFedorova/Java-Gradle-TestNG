package homeProject.baseAndCommonThings;

public class BaseFunctions {

    FireFoxDriver myDriver = new FirefoxDriver();

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
