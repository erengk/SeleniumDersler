package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Ders extends BaseDriver {
    public static void main(String[] args) {
        //https://www.n11.com/
        // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
        // 2-Butona tıklatınız
        // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
        // CSS Selector kullanılarak yapılacak.

        driver.get("https://www.n11.com/");

        String msg = "Kitap";

        WebElement textBox = driver.findElement(By.cssSelector("input[id='searchData']"));
        textBox.sendKeys(msg);
        WebElement submitBtn = driver.findElement(By.cssSelector("span[class='iconsSearch']"));
        submitBtn.click();
        WebElement message = driver.findElement(By.cssSelector("div[class='resultText '] > h1"));
        String assertMsg = message.getText();

        if (assertMsg.equals(msg)){
            System.out.println("Test Passed");
        }else
            System.out.println("Test Fail");

        BekleKapat();
    }
}
