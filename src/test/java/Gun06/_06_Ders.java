package Gun06;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _06_Ders extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.copado.com/robotic-testing");
        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement element = driver.findElement(By.xpath("(//div[@class='button-text-with-right-icon'])[5]"));
        //js.executeScript("argument[0].scrollIntoView(true);", element);
        //js.executeScript("arguments[0].scrollIntoView(false);", element);
        //js.executeScript("window.scrollBy(0,250);");

        js.executeScript("arguments[0].click();", element);

        MyFunctions.Bekle(2);
        //element.click();

        BekleKapat();
    }
}
