package Gun06;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _04_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://p-del.co/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunctions.Bekle(2);

        js.executeScript("window.scrollBy(0,3000);");
        // x koordinatında 0 px gidecek
        // y koordinatında ise 3000 px gidecek

        MyFunctions.Bekle(2);

        js.executeScript("window.scrollBy(0,-2000);");
        MyFunctions.Bekle(2);

        BekleKapat();
    }
}
