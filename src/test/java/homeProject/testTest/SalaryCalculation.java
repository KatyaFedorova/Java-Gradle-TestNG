package homeProject.testTest;

import homeProject.baseAndCommonThings.BaseFunctions;
import homeProject.baseAndCommonThings.PathAbstract;
import homeProject.testPages.FinancesSite;
import org.testng.annotations.Test;

public class SalaryCalculation extends PathAbstract {

    @Test
    public void SalaryCalculation() {
        openURL("https://minfin.com.ua/currency/banks/kharkov/usd/");
        String currentRate = FinancesSite.getCurrentUSDRates();
        float currentUsd = Float.valueOf(currentRate);
        int currentSalaryInUSD = 300;
        System.out.println("Ваша зарплата в гривне равна "
                + currentUsd * currentSalaryInUSD + "/n"
                + "Текущий курс USD - " + currentRate);
    }

}
