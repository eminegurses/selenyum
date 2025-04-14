package homeworks;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Locale;


public class Faker_Facebook_Homework extends TestBase {

    @Test
    public void Test01() {

        //1. "https://facebook.com" Adresine gidin
        driver.get("https://facebook.com");
        waitForSecond(2);


        //2. “create new account” butonuna basın
        driver.findElement(By.linkText("Yeni hesap oluştur")).click();

        //3. “firstName” giris kutusuna bir isim yazin
        Locale locale = new Locale("TR");
        Faker faker = new Faker(locale);


        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        //4. “surname” giris kutusuna bir soyisim yazin
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        //5. “email” giris kutusuna bir email yazin
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys(faker.internet().emailAddress());

        //6.“email” onay kutusuna emaili tekrar yazin
        //bu adım yok

        //7. Bir sifre girin
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys(faker.internet().password());

        //8. Tarih icin gun secin
        driver.findElement(By.id("day")).sendKeys("18");

        //9. Tarih icin ay secin
        driver.findElement(By.id("year")).sendKeys("January");

        //10. Tarih icin yil secin

        driver.findElement(By.id("month")).sendKeys("1983");

        //11. Cinsiyeti secin
        WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
        female.click();
        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        WebElement custom = driver.findElement(By.xpath("//input[@value='-1']"));

        Assertions.assertTrue(female.isSelected());
        Assertions.assertFalse(male.isSelected());
        Assertions.assertFalse(custom.isSelected());

        waitForSecond(2);

        //13. Sayfayi kapatin
        driver.quit();
    }

        @Test
        public void test01() {

            //https://www.globalsqa.com/samplepagetest/ sitesine gidin
            driver.get("https://www.globalsqa.com/samplepagetest/");

            //Textbox lari fake datalar ile doldurun

            Faker faker = new Faker();
            WebElement nameTextBox = driver.findElement(By.id("g2599-name"));
            nameTextBox.sendKeys(
                    faker.name().firstName(), Keys.TAB,
                    faker.internet().emailAddress(),Keys.TAB,
                    faker.internet().domainName());


        }




    }




