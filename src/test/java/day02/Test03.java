package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

// TechproEducation sayfasina gidin. https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        // Sayfa basligini(title) yazdirin
      String actualTitle= driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        // Sayfa basliginin "IT" icerdigini test edin

        if (actualTitle.contains("IT")){
            System.out.println("test passed");
        }else{
            System.out.println("test fail");
        }

        // Sayfa adresini(url) yazdirin
        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        // Sayfa url'inin "education" icerdigini test edin.
        if (actualUrl.contains("Education")) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        // Sayfa handle degerini yazdirin
       String windowHandle= driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        // Sayfa HTML kodlarinda "IT Programs" kelimesi gectigini test edin

      String pageSource= driver.getPageSource();
      if (pageSource.contains("IT Programs")){
            System.out.println("passed");
      }else{
            System.out.println("failed");

        }
























    }
}

