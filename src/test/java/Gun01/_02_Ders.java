package Gun01;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_Ders extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/232061499257057");

        WebElement firstName = driver.findElement(By.id("first_3"));
        firstName.sendKeys("gokhan");

        WebElement lastName = driver.findElement(By.id("last_3"));
        lastName.sendKeys("eren");

        try {
            WebElement eMail = driver.findElement(By.name("hatalıLocator"));
            eMail.sendKeys("deneme@gmail.com");
        } catch (Exception e) {
            System.out.println("WebElement Bulunamadı --> " + e.getMessage());
        }


        WebElement phoneNumber = driver.findElement(By.id("input_5_full")); //xpath = //input[@name='q12_phoneNumber12[phone]']
        phoneNumber.sendKeys("5555555555");

        WebElement submitBtn = driver.findElement(By.id("input_2"));
        submitBtn.click();

        WebElement assertNMsg = driver.findElement(By.xpath("//p[contains(text(),'Form')]"));
        System.out.println("assertNMsg.getText() = " + assertNMsg.getText());

        BekleKapat();
    }
}
