package Gun03;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement oneClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        WebElement assertMsg = driver.findElement(By.id("dynamicClickMessage"));

        MyFunctions.Bekle(2);
        Actions actions = new Actions(driver);
        //Action action = actions.moveToElement(oneClick).click().build();
        //Action action = actions.moveToElement(rightClick).contextClick().build();
        Action action = actions.moveToElement(doubleClick).doubleClick().build();

        action.perform();

        //MyFunctions.Bekle(2);

        //Assert.assertTrue("Mesaj görüntülenemedi", assertMsg.getText().contains("dynamic click"));
        BekleKapat();
    }
}
