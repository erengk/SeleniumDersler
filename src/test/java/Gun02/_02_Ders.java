package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _02_Ders extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://form.jotform.com/232061499257057");

        List<WebElement> links = driver.findElements(By.tagName("div"));

        int listSize = links.size();
        System.out.println("Liste Boyutu = " + listSize);

        for (WebElement e: links
        ) {
            System.out.println("---------------------------------------");
            System.out.println("href = " + e.getCssValue("box-sizing"));
            System.out.println("id = " + e.getCssValue("text-align"));
            System.out.println("class = " + e.getCssValue("font-family"));
            System.out.println("data-layout = " + e.getCssValue("color"));
            System.out.println("---------------------------------------");
        }

        BekleKapat();
    }
}
