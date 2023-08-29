package Gun06;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _07_Ders extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");

        MyFunctions.Bekle(2);
        String id = driver.getWindowHandle();
        Robot rbt = new Robot();
        driver.switchTo().window(id);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        for (int i = 0; i < 21; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        StringSelection pathAddress = new StringSelection("/Users/gokhanerenkamer/Desktop");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pathAddress,null);

        MyFunctions.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        MyFunctions.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        MyFunctions.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);

        WebElement checkBox = driver.findElement(By.id("https://demo.guru99.com/test/upload/"));
        checkBox.click();

        WebElement button = driver.findElement(By.id("submitbutton"));
        button.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3#res")));
        WebElement element = driver.findElement(By.cssSelector("h3#res"));

        Assert.assertTrue(element.getText().contains("successfully"));

        BekleKapat();

    }
}
