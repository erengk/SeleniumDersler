package Gun04;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");
        WebElement choise = driver.findElement(By.id("autoCompleteMultipleInput"));

        Actions actions = new Actions(driver);

        actions.moveToElement(choise).click().sendKeys("b").build().perform();
        MyFunctions.Bekle(2);

        actions.sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleKapat();
    }
}
