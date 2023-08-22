package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _05_Ders extends BaseDriver {
    public static void main(String[] args) {
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

        //Assert.assertTrue(assertMsg.getText().equals("msg"));

        BekleKapat();
    }
}
