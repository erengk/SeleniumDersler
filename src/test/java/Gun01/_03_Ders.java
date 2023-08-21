package Gun01;

import Utility.BaseDriver;
import org.openqa.selenium.Beta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Ders extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://form.jotform.com/232061499257057");

        WebElement name = driver.findElement(By.id("first_3"));

        WebElement last = driver.findElement(By.xpath("//input[@name='q3_isim[last]']"));
        
        System.out.println("name.getText() = " + name.getText());
        System.out.println("name.getAttribute(\"class\") = " + name.getAttribute("class"));
        System.out.println("name.getAttribute(\"aria-labelledby\") = " + name.getAttribute("aria-labelledby"));
        System.out.println("name.getAttribute(\"id\") = " + name.getAttribute("id"));
        System.out.println("-------------------------------");
        System.out.println("last.getAttribute(\"type\") = " + last.getAttribute("type"));
        System.out.println("last.getAttribute(\"data-component\") = " + last.getAttribute("data-component"));
        System.out.println(last.getAttribute("autocomplete"));

        BekleKapat();
    }
}
