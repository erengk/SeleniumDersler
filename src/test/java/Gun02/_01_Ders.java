package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Ders extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/232061499257057");

        List<WebElement> links = driver.findElements(By.tagName("div"));

        int listSize = links.size();
        System.out.println("Liste Boyutu = " + listSize);

        for (WebElement e: links
             ) {
            System.out.println("---------------------------------------");
            System.out.println("href = " + e.getAttribute("role"));
            System.out.println("id = " + e.getAttribute("id"));
            System.out.println("class = " + e.getAttribute("class"));
            System.out.println("data-layout = " + e.getAttribute("data-layout"));
            System.out.println("---------------------------------------");
        }

        BekleKapat();
    }
}
