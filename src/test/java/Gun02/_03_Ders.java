package Gun02;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Ders extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunctions.Bekle(3);

        WebElement alerts = driver.findElement(By.id("alerttest"));
        alerts.click();
        MyFunctions.Bekle(3);

        String urlDogrulama = "https://testpages.herokuapp.com/styled/alerts/alert-test.html";

        System.out.println(driver.getCurrentUrl());
        System.out.println(urlDogrulama);
        System.out.println("--------------------------------------");

        driver.navigate().back();
        MyFunctions.Bekle(3);

        String anaSayfa = "https://testpages.herokuapp.com/styled/index.html";
        System.out.println(driver.getCurrentUrl());
        System.out.println(anaSayfa);
        System.out.println("--------------------------------------");

        driver.navigate().forward();
        MyFunctions.Bekle(3);
        System.out.println(driver.getCurrentUrl());
        System.out.println(urlDogrulama);
        System.out.println("--------------------------------------");

        BekleKapat();
    }
}
