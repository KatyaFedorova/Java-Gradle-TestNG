package homeProject.testTest;

import homeProject.baseAndCommonThings.PathAbstract;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebDriver extends PathAbstract {

    @Test
    public void WebDriver() {
        myDriver.get("https://coursehunters.net/course/php-loft");
        if (!myDriver.findElement(By.id("nav-toggle")).isSelected()) {
            myDriver.findElement(By.id("nav-toggle")).click();
        }
        myDriver.findElement(By.linkText("System programming")).click();
        myDriver.findElement(By.linkText("Основы языка программирования C")).click();
        myDriver.findElement(By.id("positive-rank")).click();
    }

}
