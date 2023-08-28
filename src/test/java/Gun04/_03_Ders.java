package Gun04;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("div#slider-range > span:nth-child(2)"));
        WebElement msg = driver.findElement(By.cssSelector("p#amount"));

        MyFunctions.Bekle(2);

        actions.dragAndDropBy(element,100,0).build().perform();
        MyFunctions.Bekle(2);
        Assert.assertTrue("$200 olmadı",msg.getText().contains("200"));

        BekleKapat();
    }
}
