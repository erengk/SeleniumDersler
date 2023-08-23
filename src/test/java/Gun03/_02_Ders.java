package Gun03;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Ders extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com.tr/");

        WebElement dropDownMenu = driver.findElement(By.id("searchDropdownBox"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement button = driver.findElement(By.id("nav-search-submit-button"));

        Select menu = new Select(dropDownMenu);
        //menu.selectByVisibleText("Bilgisayarlar");
        //menu.selectByIndex(5);
        menu.selectByValue("search-alias=toys");

        //searchBox.sendKeys("Macbook");
        //searchBox.sendKeys("Mutfak robotu");
        searchBox.sendKeys("araba");

        button.click();

        //Assert.assertTrue("Macbook Bulunamadı", driver.getCurrentUrl().toLowerCase().contains("macbook"));
        //Assert.assertTrue("Computers Bulunamadı", driver.getCurrentUrl().toLowerCase().contains("computers"));
        //Assert.assertTrue("Mutfak Robotu Bulunamadı", driver.getCurrentUrl().toLowerCase().contains("mutfak"));
        Assert.assertTrue("Araba Bulunamadı", driver.getCurrentUrl().toLowerCase().contains("araba"));


        BekleKapat();
    }
}
