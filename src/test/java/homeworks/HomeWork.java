package homeworks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeWork {


    @Test
    public void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //ChromeDriver kullanarak, facebook sayfasina gidin
        driver.get("https://www.facebook.com/");

        //sayfa basliginin (title) "Facebook" icerdigini dogrulayin
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.contains("Facebook"));

        //Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin
        String actualUrl = driver.getCurrentUrl();
        assertTrue(actualUrl.contains("facebook"));

        //https://testcenter.techproeducation.com/ sayfasina gidin.
        driver.get("https://testcenter.techproeducation.com/");

        //Sayfa headerinin "Automation Engineer" icerdigini dogrulayin.
        WebElement header = driver.findElement(By.tagName("a"));
        assertTrue(header.getText().contains("Automation Engineer"));

        //Sayfa URL'inin "techproeducation" kelimesi icerdigini dogrulayin,
        String actualUrl2 =driver.getCurrentUrl();
        assertTrue(actualUrl2.contains("techproeducation"));

        //"Back to TechProEducation.com" butonunun görüntülendigini doğrulayin
        WebElement element = driver.findElement(By.linkText("Back to TechProEducation.com"));
        assertTrue(element.isDisplayed());
        assertTrue(element.getText().contains("TechProEducation"));

        //Tekrar "facebook" sayfasina donun
        driver.get("https://www.facebook.com/");

        //geri döndüğünüzü doğrulayin.
        assertTrue(driver.getCurrentUrl().contains("facebook"));

        driver.quit();


    }
}