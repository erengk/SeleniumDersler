package Gun03;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Ders extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());
        
        tuesday.click();
        MyFunctions.Bekle(2);
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());

        Assert.assertTrue("Seçili Değil", tuesday.isSelected());
        BekleKapat();
    }
}
