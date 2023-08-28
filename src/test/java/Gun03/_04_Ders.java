package Gun03;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_Ders extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.n11.com/");

        WebElement btn = driver.findElement(By.cssSelector("a.btnSignUp"));

        WebElement tamam = driver.findElement(By.xpath("//span[text()='Tamam']"));

        MyFunctions.Bekle(2);

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(btn).click().build();
        action.perform();



        MyFunctions.Bekle(2);
        Assert.assertTrue("url hatalı", driver.getCurrentUrl().contains("uye"));

        BekleKapat();
    }
}
