package Gun05;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir. wait kullanmanızı bekliyorum
        assert ile kontrol ediniz
        (xpath kullanmayınız)
        */
public class _05_Ders extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement linkS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        linkS6.click();

        WebElement linkAddBtn = driver.findElement(By.linkText("Add to cart"));
        linkAddBtn.click();

        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement homePage = driver.findElement(By.cssSelector("a#nava"));
        homePage.click();

        bekle.until(ExpectedConditions.urlToBe("https://www.demoblaze.com/index.html"));

        Assert.assertEquals("https://www.demoblaze.com/index.html", driver.getCurrentUrl());

        BekleKapat();
    }
}
