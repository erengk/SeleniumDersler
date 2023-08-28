package Gun05;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


        WebElement button = driver.findElement(By.xpath("//button[@onClick='timedText()']"));
        button.click();
        //MyFunctions.Bekle(15);

        Duration duration = Duration.ofSeconds(90);
        driver.manage().timeouts().implicitlyWait(duration);

        WebElement webDriver = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        Assert.assertTrue("Locator Bulunamadı", webDriver.getText().equals("WebDriver"));
        BekleKapat();
    }
}
