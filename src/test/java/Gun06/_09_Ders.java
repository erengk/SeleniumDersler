package Gun06;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _09_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        MyFunctions.Bekle(3);

        Dimension yeniBoyut = new Dimension(516, 600);
        driver.manage().window().setSize(yeniBoyut);

        BekleKapat();
    }
}
