package Gun01;

import Utility.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class _01_Ders {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new SafariDriver();
        driver.get("https://www.hepsiburada.com/");

        MyFunctions.Bekle(5);
        driver.quit();
        //driver.close
    }
}
