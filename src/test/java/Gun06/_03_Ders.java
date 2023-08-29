package Gun06;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.sound.midi.MidiSystem;
import java.util.List;
import java.util.Set;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");

        String anasayfaId = driver.getWindowHandle();
        System.out.println("anasayfaId = " + anasayfaId);

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (WebElement e: links
             ) {
            if (!e.getAttribute("href").toLowerCase().contains("mail")) {
                js.executeScript("arguments[0].click();",e);
                driver.switchTo().window(anasayfaId);
            }
        }

        Set<String> urlId = driver.getWindowHandles();
        for (String id: urlId
             ) {
            MyFunctions.Bekle(2);
            driver.switchTo().window(id);
            System.out.println("driver.getTitle() +\", url: \"+ driver.getCurrentUrl() = " + driver.getTitle() +", url: "+ driver.getCurrentUrl());
        }

        MyFunctions.Bekle(2);

        for (String id: urlId
             ) {
            if (id.equals(anasayfaId))
                continue;

            driver.switchTo().window(id);
            driver.close();
        }

        BekleKapat();
    }
}
