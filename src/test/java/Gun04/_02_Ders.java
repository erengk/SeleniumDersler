package Gun04;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement sourceElement = driver.findElement(By.id("box1"));
        WebElement targetElement = driver.findElement(By.id("box101"));

        String first = sourceElement.getCssValue("background-color");
        Actions actions = new Actions(driver);

        actions.clickAndHold(sourceElement).build().perform();
        actions.moveToElement(targetElement).release().build().perform();

        String end = sourceElement.getCssValue("background-color");

        Assert.assertFalse("Renkler eşit", end.equals(first));

        BekleKapat();
    }
}
