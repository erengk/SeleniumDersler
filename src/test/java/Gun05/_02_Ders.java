package Gun05;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement button2 = driver.findElement(By.xpath("//button[@onClick='myConfirmFunction()']"));
        button2.click();

        MyFunctions.Bekle(2);
        driver.switchTo().alert().dismiss();
        MyFunctions.Bekle(2);

        WebElement msg = driver.findElement(By.id("confirm-demo"));

        Assert.assertTrue("mesaj gözükmedi", msg.getText().toLowerCase().contains("cancel"));
        BekleKapat();
    }
}
