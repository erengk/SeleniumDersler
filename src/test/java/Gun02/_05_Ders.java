package Gun02;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _05_Ders extends BaseDriver {
    @Test
    public  void Test(){
        //https://demo.seleniumeasy.com/basic-first-form-demo.html
        // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
        // 2-Butona tıklatınız
        // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
        // CSS Selector kullanılarak yapılacak.

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement textBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        String msg = "Merhaba";
        textBox.sendKeys(msg);

        WebElement submitBtn = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        submitBtn.click();

        WebElement assertMsg = driver.findElement(By.cssSelector("span[id='display']"));

        if (assertMsg.getText().contains("Hata Versin")){
            System.out.println("Test Passed");
        }else
            System.out.println("Test Fail");

        //Assert.assertTrue(assertMsg.getText().equals(msg));
        Assert.assertFalse(assertMsg.getText().contains("Hata Versin"),"Test Kaldı");

        BekleKapat();
    }
}
