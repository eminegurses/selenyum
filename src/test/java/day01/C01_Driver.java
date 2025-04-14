package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {
    public static void main(String[] args) {
        /*
        ChromeDriver, seleniumdan gelen komutları alır ve bu komutları Chorome browser in anlayabilecegi sekilde cevirir, bunun için javadan System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        kodu ile selenium a ChromeDriver in konumunu bildirerek chrome browserin doğru bir seklide
        baslatilmasini sagliyoruz.
         */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");



    }
}
