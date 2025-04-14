package day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {


    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //arama kutusunun tag name'inin input olduğunu test edelim
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String expectedTagName = "input";
        String actualTagName = searchBox.getTagName();
        Assertions.assertEquals(expectedTagName, actualTagName);

        //arama kutusunun class attribütunun değerinin form-input olduğunu test ediniz

        String expectedAttributeValue = "form-input";
        String actualAttributeValue = searchBox.getDomAttribute("class");
        Assertions.assertEquals(expectedAttributeValue, actualAttributeValue);

        driver.quit();
    }

        @Test
        public void test02() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


            //amazon sitesine gidin
        driver.get("https://amazon.com");

        ///captchayi handle etmek için yazıldı
        driver.navigate().refresh();
        driver.navigate().refresh();

        Thread.sleep(3000);


        //arama kutusuna qa yazın
           WebElement searchbox =  driver.findElement(By.id("twotabsearchtextbox"));
           searchbox.sendKeys("qa");
           //arama kutusuna basarılı bir sekilde yazıldıgına emin olun
            String actualValue = searchbox.getDomProperty("value");
            Assertions.assertEquals("qa",actualValue);

    }
}
