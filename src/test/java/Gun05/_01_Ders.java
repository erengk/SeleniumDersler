package Gun05;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Ders extends BaseDriver {
    @Test
    public void Test(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement button1 = driver.findElement(By.xpath("//button[@onClick='myAlertFunction()']"));
        button1.click();

        MyFunctions.Bekle(2);

        String alertText = driver.switchTo().alert().getText();

        System.out.println("alertText = " + alertText);

        driver.switchTo().alert().accept();

        BekleKapat();
    }
}
