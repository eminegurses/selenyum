package day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {


    @Test
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://testcenter.techproeducation.com/index.php adresine gidin
        driver.get("https://testcenter.techproeducation.com/index.php");

       // back to techpro butonunun kullanıcı erişimi için etkin olup olmadıgını kontrol ediniz
       WebElement backToButton = driver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        Assertions.assertTrue(backToButton.isEnabled());
        //applications lists baslıgı tag name ile locate ediniz
        WebElement applicationsListText = driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationsListText.isDisplayed());
        driver.quit();






    }
}
