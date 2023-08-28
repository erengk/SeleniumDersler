package Gun03;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement oneClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        WebElement dClick = driver.findElement(By.id("doubleClickBtn"));


        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(oneClick).click().build();
        Action action1 = actions.moveToElement(rightClick).contextClick().build();
        Action action2 = actions.moveToElement(dClick).doubleClick().build();
        action.perform();
        action1.perform();
        action2.perform();

        MyFunctions.Bekle(2);

        List<WebElement> messages = driver.findElements(By.xpath("//p[contains(text(),'done')]"));

        for (WebElement e: messages
             ) {
            System.out.println("e.getText() = " + e.getText());
        }

        //WebElement assertMsg = driver.findElement(By.id("dynamicClickMessage"));
        //MyFunctions.Bekle(2);
        //Assert.assertTrue("Mesaj görüntülenemedi", assertMsg.getText().contains("dynamic click"));

        BekleKapat();
    }
}
