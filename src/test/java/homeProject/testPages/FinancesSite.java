package homeProject.testPages;

import homeProject.baseAndCommonThings.BaseFunctions;
import org.openqa.selenium.By;

public class FinancesSite extends BaseFunctions {

    public static String getCurrentUSDRates() {
    String[] rates = getTextFromElement(By.cssSelector(".mfcur-table-lg-banks td.mfm-text-nowrap:nth-child(4)")).split(" /");
    return rates[0];

    }
}