package Gun04;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _04_Ders extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/auto-complete");
        WebElement textBox = driver.findElement(By.id("autoCompleteSingleInput"));

        //OtomasyonTestSenaryosu
        //O -> tomoasyon -> T -> est -> S -> enaryosu

        Actions actions = new Actions(driver);

        actions.moveToElement(textBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("o")
                .keyUp(Keys.SHIFT)
                .sendKeys("tomasyon")
                .keyDown(Keys.SHIFT)
                .sendKeys("t")
                .keyUp(Keys.SHIFT)
                .sendKeys("est")
                .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("enaryosu")
                .build()
                .perform();

        MyFunctions.Bekle(2);

        BekleKapat();
    }
}
