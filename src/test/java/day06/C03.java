package day06;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.ResultSet;
import java.time.Duration;

public class C03 {

    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //--------captcha yi handle etmek icin yazildi--------
        driver.navigate().refresh();
        driver.navigate().refresh();
        Thread.sleep(3000);
        //--------captcha yi handle etmek icin yazildi--------

        //Arama kutusunda “city bike” aratin (arama kutusunu xpath ile locate edin)

         WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
         searchBox.sendKeys("city bike");
         searchBox.submit();//enter a basmak için kullandım
        //amazonda goruntulenen  sonuc sayısını yazdır
       WebElement resultText =driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(resultText.getText());

        //sadece sonuc sayısını yazdırın
        String resultNumberText= resultText.getText().split(" ")[3];
        //sonradan karsınıza cıkan ılk sonucun metne tıklayın




    }
}
