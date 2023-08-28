package Gun04;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);


        WebElement sourceElement = driver.findElement(By.id("box4"));
        WebElement targetElement = driver.findElement(By.id("box104"));
        String styleValueFirst = sourceElement.getCssValue("background-color");

        actions.dragAndDrop(sourceElement,targetElement).build().perform();
        MyFunctions.Bekle(2);

        String styleValueFinal = sourceElement.getCssValue("background-color");

        //Assert.assertTrue("Renkler eşit değil",styleValueFinal.equals(styleValueFirst));
        Assert.assertFalse("Renkler eşit değil",styleValueFinal.equals(styleValueFirst));

        BekleKapat();
    }
}
