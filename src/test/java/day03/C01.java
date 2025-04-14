package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    // go to techproeducation homepage https://www.techproeducation.com/
//Go to Amazon page. https://www.amazon.com/
//Go back to techproeducation page
//Go to Amazon page again
//Refresh the page
//Close all pages

    public static void main(String[] args) {
//        navigate metodları, tarayıcıda ileri, geri gitme
//        ve sayfayı yenileme işlemleri için kullanılır.
//        Bunlar driver.navigate() üzerinden çağrılır.


//       to(url) Belirtilen URL'ye gider.
//        driver.get(url) ile benzer işlev görür ama navigate().to(url) daha çok dinamik gezinmelerde tercih edilir.
//       go to techproeducation homepage https://www.techproeducation.com/

      WebDriver driver =new ChromeDriver();//bir alan acmak için kullanılır.
      driver.navigate().to("https://www.techproeducation.com/");
      driver.navigate().to("https://www.amazon.com/");
      driver.navigate().back();//back()
       // Tarayıcıda bir önceki sayfaya geri gider (tarayıcıdaki geri butonu gibi çalışır).
      driver.navigate().forward();//Geri gittikten sonra ileri gitmek için kullanılır.
      driver.navigate().refresh();//Sayfayı yeniler (tarayıcıdaki yenileme butonu gibi çalışır).
      driver.quit();


    }


}
