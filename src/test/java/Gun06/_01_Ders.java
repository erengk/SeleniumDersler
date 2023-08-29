package Gun06;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_Ders extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://chercher.tech/practice/frames");

        //driver.switchTo().frame("frame1"); //id veya name ile  çok yavaş çalıştı.
        driver.switchTo().frame(0); // index ile çok hızlı bir şekilde çalıştı
        WebElement topic = driver.findElement(By.xpath("//input[@type='text']"));
        topic.sendKeys("Merhaba Frame1");

        MyFunctions.Bekle(2);


        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.cssSelector("input#a"));
        checkBox.click();
        MyFunctions.Bekle(2);

        driver.switchTo().parentFrame(); // Bir üstteki kapsayan frame'e götürür
        driver.switchTo().defaultContent();// Direkt anasayfaya götürür

        driver.switchTo().frame(1);
        MyFunctions.Bekle(2);


        WebElement selectBox = driver.findElement(By.id("animals"));
        MyFunctions.Bekle(2);
        Select select = new Select(selectBox);
        select.selectByIndex(2);

        BekleKapat();
    }
}

/*
frame 0 index numarası
        frame 0
        frame 1
        frame 2

frame 1
frame 2
        frame 0
        frame 1
                frame 0
                frame 1
                frame 2
 */